package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForStatement
  extends BaseASTNode
     with ASTNode
     with Statement {
  var body: Statement
  var conditionExpression: js.UndefOr[Expression] = js.undefined
  var initExpression: js.UndefOr[SimpleStatement] = js.undefined
  var loopExpression: js.UndefOr[ExpressionStatement] = js.undefined
  @JSName("type")
  var type_ForStatement: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ForStatement
}

object ForStatement {
  @scala.inline
  def apply(
    body: Statement,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ForStatement,
    conditionExpression: Expression = null,
    initExpression: SimpleStatement = null,
    loc: Location = null,
    loopExpression: ExpressionStatement = null,
    range: js.Tuple2[Double, Double] = null
  ): ForStatement = {
    val __obj = js.Dynamic.literal(body = body)
    __obj.updateDynamic("type")(`type`)
    if (conditionExpression != null) __obj.updateDynamic("conditionExpression")(conditionExpression)
    if (initExpression != null) __obj.updateDynamic("initExpression")(initExpression)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (loopExpression != null) __obj.updateDynamic("loopExpression")(loopExpression)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[ForStatement]
  }
}

