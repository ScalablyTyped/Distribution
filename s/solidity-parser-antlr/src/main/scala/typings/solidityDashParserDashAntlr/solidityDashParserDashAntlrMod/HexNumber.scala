package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HexNumber
  extends AssemblyItem
     with BaseASTNode {
  @JSName("type")
  var type_HexNumber: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.HexNumber
  var value: String
}

object HexNumber {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.HexNumber,
    value: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): HexNumber = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[HexNumber]
  }
}

