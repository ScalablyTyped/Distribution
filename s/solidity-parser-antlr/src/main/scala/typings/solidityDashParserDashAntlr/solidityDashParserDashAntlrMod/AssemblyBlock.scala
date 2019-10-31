package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.ASTNode because Already inherited */ trait AssemblyBlock
  extends AssemblyItem
     with BaseASTNode {
  var operations: js.Array[AssemblyItem]
  @JSName("type")
  var type_AssemblyBlock: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyBlock
}

object AssemblyBlock {
  @scala.inline
  def apply(
    operations: js.Array[AssemblyItem],
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyBlock,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyBlock = {
    val __obj = js.Dynamic.literal(operations = operations)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[AssemblyBlock]
  }
}

