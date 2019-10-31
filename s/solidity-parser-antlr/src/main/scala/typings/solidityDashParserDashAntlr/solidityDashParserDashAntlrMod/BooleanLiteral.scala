package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanLiteral
  extends PrimaryExpression
     with BaseASTNode {
  @JSName("type")
  var type_BooleanLiteral: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.BooleanLiteral
  var value: Boolean
}

object BooleanLiteral {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.BooleanLiteral,
    value: Boolean,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): BooleanLiteral = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[BooleanLiteral]
  }
}

