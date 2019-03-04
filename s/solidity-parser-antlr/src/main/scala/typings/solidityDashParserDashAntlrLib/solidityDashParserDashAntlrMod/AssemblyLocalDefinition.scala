package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssemblyLocalDefinition
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_AssemblyLocalDefinition: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.AssemblyLocalDefinition
}

object AssemblyLocalDefinition {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.AssemblyLocalDefinition,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): AssemblyLocalDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[AssemblyLocalDefinition]
  }
}

