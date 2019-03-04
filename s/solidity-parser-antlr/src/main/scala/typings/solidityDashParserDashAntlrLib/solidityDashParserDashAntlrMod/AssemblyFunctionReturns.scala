package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssemblyFunctionReturns
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_AssemblyFunctionReturns: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.AssemblyFunctionReturns
}

object AssemblyFunctionReturns {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.AssemblyFunctionReturns,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): AssemblyFunctionReturns = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[AssemblyFunctionReturns]
  }
}

