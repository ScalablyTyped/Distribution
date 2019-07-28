package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressionList
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_ExpressionList: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ExpressionList
}

object ExpressionList {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ExpressionList,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ExpressionList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[ExpressionList]
  }
}

