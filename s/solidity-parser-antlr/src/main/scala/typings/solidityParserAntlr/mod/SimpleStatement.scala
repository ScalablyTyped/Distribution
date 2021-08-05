package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.solidityParserAntlr.mod.VariableDeclarationStatement
  - typings.solidityParserAntlr.mod.ExpressionStatement
*/
trait SimpleStatement
  extends StObject
     with Statement
object SimpleStatement {
  
  inline def ExpressionStatement(expression: Expression): typings.solidityParserAntlr.mod.ExpressionStatement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExpressionStatement")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.ExpressionStatement]
  }
  
  inline def VariableDeclarationStatement(variables: js.Array[ASTNode]): typings.solidityParserAntlr.mod.VariableDeclarationStatement = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclarationStatement")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.VariableDeclarationStatement]
  }
}
