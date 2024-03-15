public class BalancedParentheses {
    public void balanceParentheses(String expression){
for(char bracket:expression.toCharArray()){
      String stack;
    if(bracket == '{'|| bracket =='('|| bracket == '['){
stack.push(bracket);
}else if (bracket == '}'|| bracket =='(' || bracket == ']'){
       if(stack.isEmpty() || !isItBalanced(stack.pop(),bracket)){
System.out.println("The expression is not balanced");
return;

       }

                                                    


}      

}       
}                                                 
  public boolean isItBalanced(char open, char close){


if(open == '{' && close =='}'){
    return true;

}else if (open == '('&&close == ')'){
    return true;
}
else if (open =='[' && close ==']'){
    return true;
}

return false;
  }






}