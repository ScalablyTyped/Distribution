package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionCall
  extends StObject
     with BaseASTNode
     with Expression {
  
  var arguments: js.Array[Expression]
  
  var expression: Expression
  
  var names: js.Array[String]
  
  @JSName("type")
  var type_FunctionCall: typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionCall
}
object FunctionCall {
  
  inline def apply(arguments: js.Array[Expression], expression: Expression, names: js.Array[String]): FunctionCall = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionCall")
    __obj.asInstanceOf[FunctionCall]
  }
  
  extension [Self <: FunctionCall](x: Self) {
    
    inline def setArguments(value: js.Array[Expression]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsVarargs(value: Expression*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionCall): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
