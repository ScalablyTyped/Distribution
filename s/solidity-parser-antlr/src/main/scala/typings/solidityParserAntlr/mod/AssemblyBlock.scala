package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.solidityParserAntlr.mod.ASTNode because Already inherited */ @js.native
trait AssemblyBlock
  extends AssemblyItem
     with BaseASTNode {
  var operations: js.Array[AssemblyItem] = js.native
  @JSName("type")
  var type_AssemblyBlock: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyBlock = js.native
}

object AssemblyBlock {
  @scala.inline
  def apply(
    operations: js.Array[AssemblyItem],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyBlock
  ): AssemblyBlock = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyBlock]
  }
  @scala.inline
  implicit class AssemblyBlockOps[Self <: AssemblyBlock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOperationsVarargs(value: AssemblyItem*): Self = this.set("operations", js.Array(value :_*))
    @scala.inline
    def setOperations(value: js.Array[AssemblyItem]): Self = this.set("operations", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyBlock): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

