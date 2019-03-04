package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssemblyFor
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_AssemblyFor: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.AssemblyFor
}

object AssemblyFor {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.AssemblyFor,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): AssemblyFor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[AssemblyFor]
  }
}

