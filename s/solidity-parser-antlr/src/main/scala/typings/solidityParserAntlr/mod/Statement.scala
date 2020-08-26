package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait Statement extends js.Object

object Statement {
  @scala.inline
  def IfStatement(
    condition: Expression,
    trueBody: Statement,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.IfStatement
  ): Statement = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], trueBody = trueBody.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def ForStatement(body: Statement, `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ForStatement): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def VariableDeclarationStatement(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.VariableDeclarationStatement,
    variables: js.Array[ASTNode]
  ): Statement = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def ThrowStatement(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ThrowStatement): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def ContinueStatement(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ContinueStatement): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def EmitStatement(
    eventCall: FunctionCall,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.EmitStatement
  ): Statement = {
    val __obj = js.Dynamic.literal(eventCall = eventCall.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def ExpressionStatement(
    expression: Expression,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ExpressionStatement
  ): Statement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def BreakStatement(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.BreakStatement): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def InlineAssemblyStatement(
    body: AssemblyBlock,
    language: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.InlineAssemblyStatement
  ): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def DoWhileStatement(
    body: Statement,
    condition: Expression,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.DoWhileStatement
  ): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def ReturnStatement(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ReturnStatement): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def WhileStatement(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.WhileStatement): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def Block(
    statements: js.Array[Statement],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.Block
  ): Statement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
}

