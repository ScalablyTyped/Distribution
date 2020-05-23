package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.solidityParserAntlr.mod.ASTNode because Already inherited */ trait AssemblyBlock
  extends AssemblyItem
     with BaseASTNode {
  var operations: js.Array[AssemblyItem]
  @JSName("type")
  var type_AssemblyBlock: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyBlock
}

object AssemblyBlock {
  @scala.inline
  def apply(
    operations: js.Array[AssemblyItem],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyBlock,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyBlock = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyBlock]
  }
}

