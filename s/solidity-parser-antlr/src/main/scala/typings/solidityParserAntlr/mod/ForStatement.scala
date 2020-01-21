package typings.solidityParserAntlr.mod

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
  var type_ForStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.ForStatement
}

object ForStatement {
  @scala.inline
  def apply(
    body: Statement,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ForStatement,
    conditionExpression: Expression = null,
    initExpression: SimpleStatement = null,
    loc: Location = null,
    loopExpression: ExpressionStatement = null,
    range: js.Tuple2[Double, Double] = null
  ): ForStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (conditionExpression != null) __obj.updateDynamic("conditionExpression")(conditionExpression.asInstanceOf[js.Any])
    if (initExpression != null) __obj.updateDynamic("initExpression")(initExpression.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (loopExpression != null) __obj.updateDynamic("loopExpression")(loopExpression.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForStatement]
  }
}

