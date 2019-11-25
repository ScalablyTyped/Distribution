package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.IfStatement
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.WhileStatement
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.ForStatement
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.Block
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.InlineAssemblyStatement
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.DoWhileStatement
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.ContinueStatement
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.BreakStatement
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.ReturnStatement
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.EmitStatement
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.ThrowStatement
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.SimpleStatement
  - typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.VariableDeclarationStatement
*/
trait Statement extends js.Object

object Statement {
  @scala.inline
  def IfStatement(
    condition: Expression,
    trueBody: Statement,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.IfStatement,
    falseBody: Statement = null,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Statement = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], trueBody = trueBody.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (falseBody != null) __obj.updateDynamic("falseBody")(falseBody.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def ContinueStatement(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ContinueStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def ReturnStatement(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ReturnStatement,
    expression: Expression = null,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def WhileStatement(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.WhileStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def ForStatement(
    body: Statement,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ForStatement,
    conditionExpression: Expression = null,
    initExpression: SimpleStatement = null,
    loc: Location = null,
    loopExpression: ExpressionStatement = null,
    range: js.Tuple2[Double, Double] = null
  ): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (conditionExpression != null) __obj.updateDynamic("conditionExpression")(conditionExpression.asInstanceOf[js.Any])
    if (initExpression != null) __obj.updateDynamic("initExpression")(initExpression.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (loopExpression != null) __obj.updateDynamic("loopExpression")(loopExpression.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def InlineAssemblyStatement(
    body: AssemblyBlock,
    language: String,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.InlineAssemblyStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def ThrowStatement(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ThrowStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def BreakStatement(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.BreakStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def DoWhileStatement(
    body: Statement,
    condition: Expression,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.DoWhileStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Statement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def EmitStatement(
    eventCall: FunctionCall,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.EmitStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Statement = {
    val __obj = js.Dynamic.literal(eventCall = eventCall.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def Block(
    statements: js.Array[Statement],
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.Block,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Statement = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def ExpressionStatement(
    expression: Expression,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ExpressionStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Statement = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  def VariableDeclarationStatement(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.VariableDeclarationStatement,
    variables: js.Array[ASTNode],
    initialValue: Expression = null,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Statement = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statement]
  }
}

