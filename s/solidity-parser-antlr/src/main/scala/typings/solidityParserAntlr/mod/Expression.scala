package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.solidityParserAntlr.mod.IndexAccess
  - typings.solidityParserAntlr.mod.TupleExpression
  - typings.solidityParserAntlr.mod.BinaryOperation
  - typings.solidityParserAntlr.mod.Conditional
  - typings.solidityParserAntlr.mod.MemberAccess
  - typings.solidityParserAntlr.mod.FunctionCall
  - typings.solidityParserAntlr.mod.PrimaryExpression
*/
trait Expression
  extends StObject
     with ASTNode
object Expression {
  
  @scala.inline
  def BinaryOperation(left: Expression, operator: BinOp, right: Expression): typings.solidityParserAntlr.mod.BinaryOperation = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BinaryOperation")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.BinaryOperation]
  }
  
  @scala.inline
  def BooleanLiteral(value: Boolean): typings.solidityParserAntlr.mod.BooleanLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.BooleanLiteral]
  }
  
  @scala.inline
  def Conditional(falseExpression: ASTNode, trueExpression: ASTNode): typings.solidityParserAntlr.mod.Conditional = {
    val __obj = js.Dynamic.literal(falseExpression = falseExpression.asInstanceOf[js.Any], trueExpression = trueExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Conditional")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.Conditional]
  }
  
  @scala.inline
  def ElementaryTypeNameExpression(typeName: ElementaryTypeName): typings.solidityParserAntlr.mod.ElementaryTypeNameExpression = {
    val __obj = js.Dynamic.literal(typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ElementaryTypeNameExpression")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.ElementaryTypeNameExpression]
  }
  
  @scala.inline
  def FunctionCall(arguments: js.Array[Expression], expression: Expression, names: js.Array[String]): typings.solidityParserAntlr.mod.FunctionCall = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionCall")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.FunctionCall]
  }
  
  @scala.inline
  def Identifier(name: String): typings.solidityParserAntlr.mod.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.Identifier]
  }
  
  @scala.inline
  def IndexAccess(base: Expression, index: Expression): typings.solidityParserAntlr.mod.IndexAccess = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IndexAccess")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.IndexAccess]
  }
  
  @scala.inline
  def MemberAccess(expression: Expression, memberName: String): typings.solidityParserAntlr.mod.MemberAccess = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], memberName = memberName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberAccess")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.MemberAccess]
  }
  
  @scala.inline
  def NumberLiteral(number: String): typings.solidityParserAntlr.mod.NumberLiteral = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], subdenomination = null)
    __obj.updateDynamic("type")("NumberLiteral")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.NumberLiteral]
  }
  
  @scala.inline
  def TupleExpression(components: js.Array[Expression], isArray: Boolean): typings.solidityParserAntlr.mod.TupleExpression = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], isArray = isArray.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TupleExpression")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.TupleExpression]
  }
}
