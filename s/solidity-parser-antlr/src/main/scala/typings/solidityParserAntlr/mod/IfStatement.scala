package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IfStatement
  extends BaseASTNode
     with ASTNode
     with Statement {
  var condition: Expression
  var falseBody: js.UndefOr[Statement] = js.undefined
  var trueBody: Statement
  @JSName("type")
  var type_IfStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.IfStatement
}

object IfStatement {
  @scala.inline
  def apply(
    condition: Expression,
    trueBody: Statement,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.IfStatement,
    falseBody: Statement = null,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): IfStatement = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], trueBody = trueBody.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (falseBody != null) __obj.updateDynamic("falseBody")(falseBody.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfStatement]
  }
}

