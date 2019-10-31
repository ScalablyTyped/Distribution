package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecimalNumber
  extends AssemblyItem
     with BaseASTNode {
  @JSName("type")
  var type_DecimalNumber: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.DecimalNumber
  var value: String
}

object DecimalNumber {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.DecimalNumber,
    value: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): DecimalNumber = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[DecimalNumber]
  }
}

