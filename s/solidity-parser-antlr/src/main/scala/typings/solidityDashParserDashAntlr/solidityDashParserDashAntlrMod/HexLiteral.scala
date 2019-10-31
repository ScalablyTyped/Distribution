package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HexLiteral
  extends AssemblyItem
     with BaseASTNode {
  @JSName("type")
  var type_HexLiteral: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.HexLiteral
  var value: String
}

object HexLiteral {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.HexLiteral,
    value: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): HexLiteral = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[HexLiteral]
  }
}

