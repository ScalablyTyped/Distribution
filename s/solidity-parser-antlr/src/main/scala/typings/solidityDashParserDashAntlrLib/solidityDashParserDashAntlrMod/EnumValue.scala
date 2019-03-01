package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumValue
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_EnumValue: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.EnumValue
}

object EnumValue {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.EnumValue,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): EnumValue = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[EnumValue]
  }
}

