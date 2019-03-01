package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssemblyStackAssignment
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_AssemblyStackAssignment: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.AssemblyStackAssignment
}

object AssemblyStackAssignment {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.AssemblyStackAssignment,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): AssemblyStackAssignment = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[AssemblyStackAssignment]
  }
}

