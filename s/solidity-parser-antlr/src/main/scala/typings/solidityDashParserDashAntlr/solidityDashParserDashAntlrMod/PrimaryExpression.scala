package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryExpression
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_PrimaryExpression: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.PrimaryExpression
}

object PrimaryExpression {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.PrimaryExpression,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): PrimaryExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[PrimaryExpression]
  }
}

