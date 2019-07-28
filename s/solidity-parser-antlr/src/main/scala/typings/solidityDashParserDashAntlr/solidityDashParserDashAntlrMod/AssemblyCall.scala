package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssemblyCall
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_AssemblyCall: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyCall
}

object AssemblyCall {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyCall,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyCall = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[AssemblyCall]
  }
}

