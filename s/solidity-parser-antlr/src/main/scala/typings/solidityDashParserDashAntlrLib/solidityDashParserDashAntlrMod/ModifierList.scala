package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifierList
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_ModifierList: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.ModifierList
}

object ModifierList {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.ModifierList,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): ModifierList = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[ModifierList]
  }
}

