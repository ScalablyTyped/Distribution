package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssemblyAssignment
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_AssemblyAssignment: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyAssignment
}

object AssemblyAssignment {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyAssignment,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[AssemblyAssignment]
  }
}

