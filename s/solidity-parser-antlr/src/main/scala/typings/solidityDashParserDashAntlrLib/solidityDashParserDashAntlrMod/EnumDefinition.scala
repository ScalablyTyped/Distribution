package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumDefinition
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_EnumDefinition: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.EnumDefinition
}

object EnumDefinition {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.EnumDefinition,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): EnumDefinition = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[EnumDefinition]
  }
}

