package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssemblySwitch
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_AssemblySwitch: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblySwitch
}

object AssemblySwitch {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblySwitch,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblySwitch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[AssemblySwitch]
  }
}

