package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifierDefinition
  extends BaseASTNode
     with ASTNode {
  var name: java.lang.String
  @JSName("type")
  var type_ModifierDefinition: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.ModifierDefinition
}

object ModifierDefinition {
  @scala.inline
  def apply(
    name: java.lang.String,
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.ModifierDefinition,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): ModifierDefinition = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[ModifierDefinition]
  }
}

