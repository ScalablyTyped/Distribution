package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Version
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_Version: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.Version
}

object Version {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.Version,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): Version = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[Version]
  }
}

