package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssemblyCase
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_AssemblyCase: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.AssemblyCase
}

object AssemblyCase {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.AssemblyCase,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): AssemblyCase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[AssemblyCase]
  }
}

