package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnStatement
  extends StObject
     with BaseASTNode
     with ASTNode
     with Statement {
  
  var expression: Expression | Null
  
  @JSName("type")
  var type_ReturnStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.ReturnStatement
}
object ReturnStatement {
  
  @scala.inline
  def apply(): ReturnStatement = {
    val __obj = js.Dynamic.literal(expression = null)
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[ReturnStatement]
  }
  
  @scala.inline
  implicit class ReturnStatementMutableBuilder[Self <: ReturnStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionNull: Self = StObject.set(x, "expression", null)
    
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.ReturnStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
