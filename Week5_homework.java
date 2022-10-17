import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CalJFrame extends JFrame implements ActionListener{
    private JPanel contentPane;
    CalJFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setBounds(500, 100, 340, 500);
        setVisible(true);

        contentPane=new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JTextField calText=new JTextField("000000");
        calText.setBounds(20, 10, 285, 50);
        contentPane.add(calText);

        JButton btn1 =new JButton("1");
        btn1.setBounds(20, 80, 75, 50);
        btn1.addActionListener(this);
        contentPane.add(btn1);

        JButton btn2 =new JButton("2");
        btn2.setBounds(125, 80, 75, 50);
        btn2.addActionListener(this);
        contentPane.add(btn2);

        JButton btn3 =new JButton("3");
        btn3.setBounds(230, 80, 75, 50);
        btn3.addActionListener(this);
        contentPane.add(btn3);

        JButton btn4 =new JButton("4");
        btn4.setBounds(20, 160, 75, 50);
        btn4.addActionListener(this);
        contentPane.add(btn4);

        JButton btn5 =new JButton("5");
        btn5.setBounds(125, 160, 75, 50);
        btn5.addActionListener(this);
        contentPane.add(btn5);

        JButton btn6 =new JButton("6");
        btn6.setBounds(230, 160, 75, 50);
        btn6.addActionListener(this);
        contentPane.add(btn6);

        JButton btn7 =new JButton("7");
        btn7.setBounds(20, 240, 75, 50);
        btn7.addActionListener(this);
        contentPane.add(btn7);

        JButton btn8 =new JButton("8");
        btn8.setBounds(125, 240, 75, 50);
        btn8.addActionListener(this);
        contentPane.add(btn8);

        JButton btn9 =new JButton("9");
        btn9.setBounds(230, 240, 75, 50);
        btn9.addActionListener(this);
        contentPane.add(btn9);

        JButton btnPlus =new JButton("+");
        btnPlus.setBounds(20, 320, 75, 50);
        btnPlus.addActionListener(this);
        contentPane.add(btnPlus);

        JButton btn0 =new JButton("0");
        btn0.setBounds(125, 320, 75, 50);
        btn0.addActionListener(this);
        contentPane.add(btn0);

        JButton btnMinus =new JButton("-");
        btnMinus.setBounds(230, 320, 75, 50);
        btnMinus.addActionListener(this);
        contentPane.add(btnMinus);

        JButton btnTimes =new JButton("x");
        btnTimes.setBounds(20, 400, 75, 50);
        btnTimes.addActionListener(this);
        contentPane.add(btnTimes);

        JButton btnEquals =new JButton("=");
        btnEquals.setBounds(125, 400, 75, 50);
        btnEquals.addActionListener(this);
        contentPane.add(btnEquals);

        JButton btnDivide =new JButton("÷");
        btnDivide.setBounds(230, 400, 75, 50);
        btnDivide.addActionListener(this);
        contentPane.add(btnDivide);

        }

        public void actionPerformed(ActionEvent e){
            JButton nameBtn=(JButton)e.getSource();
            JOptionPane.showMessageDialog(null,nameBtn.getText());
        }

}

public class Week5_homework {
    public static void main (String[] args){
        CalJFrame calculator= new CalJFrame();
    }
    
}
