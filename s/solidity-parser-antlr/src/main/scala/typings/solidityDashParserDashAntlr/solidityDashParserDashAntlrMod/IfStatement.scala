package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

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
  var type_IfStatement: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.IfStatement
}

object IfStatement {
  @scala.inline
  def apply(
    condition: Expression,
    trueBody: Statement,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.IfStatement,
    falseBody: Statement = null,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): IfStatement = {
    val __obj = js.Dynamic.literal(condition = condition, trueBody = trueBody)
    __obj.updateDynamic("type")(`type`)
    if (falseBody != null) __obj.updateDynamic("falseBody")(falseBody)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[IfStatement]
  }
}

