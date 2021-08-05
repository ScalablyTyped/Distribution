package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressionStatement
  extends StObject
     with BaseASTNode
     with ASTNode
     with SimpleStatement {
  
  var expression: Expression
  
  @JSName("type")
  var type_ExpressionStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.ExpressionStatement
}
object ExpressionStatement {
  
  inline def apply(expression: Expression): ExpressionStatement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExpressionStatement")
    __obj.asInstanceOf[ExpressionStatement]
  }
  
  extension [Self <: ExpressionStatement](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.ExpressionStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
