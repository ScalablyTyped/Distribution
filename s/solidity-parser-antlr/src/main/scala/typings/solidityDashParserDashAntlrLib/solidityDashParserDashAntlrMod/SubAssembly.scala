package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubAssembly
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_SubAssembly: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.SubAssembly
}

object SubAssembly {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.SubAssembly,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): SubAssembly = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[SubAssembly]
  }
}

