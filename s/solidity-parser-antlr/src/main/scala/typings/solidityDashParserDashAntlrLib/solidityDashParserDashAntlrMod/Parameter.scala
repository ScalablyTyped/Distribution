package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameter
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_Parameter: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.Parameter
}

object Parameter {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.Parameter,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): Parameter = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[Parameter]
  }
}

