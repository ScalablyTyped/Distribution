package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssemblyFunctionReturns
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_AssemblyFunctionReturns: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyFunctionReturns
}

object AssemblyFunctionReturns {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyFunctionReturns,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyFunctionReturns = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyFunctionReturns]
  }
}

