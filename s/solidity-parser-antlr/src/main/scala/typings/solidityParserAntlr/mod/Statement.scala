package typings.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.solidityParserAntlr.mod.IfStatement
  - typings.solidityParserAntlr.mod.WhileStatement
  - typings.solidityParserAntlr.mod.ForStatement
  - typings.solidityParserAntlr.mod.Block
  - typings.solidityParserAntlr.mod.InlineAssemblyStatement
  - typings.solidityParserAntlr.mod.DoWhileStatement
  - typings.solidityParserAntlr.mod.ContinueStatement
  - typings.solidityParserAntlr.mod.BreakStatement
  - typings.solidityParserAntlr.mod.ReturnStatement
  - typings.solidityParserAntlr.mod.EmitStatement
  - typings.solidityParserAntlr.mod.ThrowStatement
  - typings.solidityParserAntlr.mod.SimpleStatement
  - typings.solidityParserAntlr.mod.VariableDeclarationStatement
*/
trait Statement extends StObject
object Statement {
  
  inline def Block(statements: js.Array[Statement]): typings.solidityParserAntlr.mod.Block = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Block")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.Block]
  }
  
  inline def BreakStatement(): typings.solidityParserAntlr.mod.BreakStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BreakStatement")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.BreakStatement]
  }
  
  inline def ContinueStatement(): typings.solidityParserAntlr.mod.ContinueStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ContinueStatement")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.ContinueStatement]
  }
  
  inline def DoWhileStatement(body: Statement, condition: Expression): typings.solidityParserAntlr.mod.DoWhileStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DoWhileStatement")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.DoWhileStatement]
  }
  
  inline def EmitStatement(eventCall: FunctionCall): typings.solidityParserAntlr.mod.EmitStatement = {
    val __obj = js.Dynamic.literal(eventCall = eventCall.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("EmitStatement")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.EmitStatement]
  }
  
  inline def ExpressionStatement(expression: Expression): typings.solidityParserAntlr.mod.ExpressionStatement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExpressionStatement")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.ExpressionStatement]
  }
  
  inline def ForStatement(body: Statement): typings.solidityParserAntlr.mod.ForStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForStatement")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.ForStatement]
  }
  
  inline def IfStatement(condition: Expression, trueBody: Statement): typings.solidityParserAntlr.mod.IfStatement = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], trueBody = trueBody.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IfStatement")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.IfStatement]
  }
  
  inline def InlineAssemblyStatement(body: AssemblyBlock, language: String): typings.solidityParserAntlr.mod.InlineAssemblyStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("InlineAssemblyStatement")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.InlineAssemblyStatement]
  }
  
  inline def ReturnStatement(): typings.solidityParserAntlr.mod.ReturnStatement = {
    val __obj = js.Dynamic.literal(expression = null)
    __obj.updateDynamic("type")("ReturnStatement")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.ReturnStatement]
  }
  
  inline def ThrowStatement(): typings.solidityParserAntlr.mod.ThrowStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ThrowStatement")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.ThrowStatement]
  }
  
  inline def VariableDeclarationStatement(variables: js.Array[ASTNode]): typings.solidityParserAntlr.mod.VariableDeclarationStatement = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("VariableDeclarationStatement")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.VariableDeclarationStatement]
  }
  
  inline def WhileStatement(): typings.solidityParserAntlr.mod.WhileStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("WhileStatement")
    __obj.asInstanceOf[typings.solidityParserAntlr.mod.WhileStatement]
  }
}
