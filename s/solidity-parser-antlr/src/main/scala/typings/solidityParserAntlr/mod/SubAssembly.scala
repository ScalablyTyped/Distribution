package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.solidityParserAntlr.mod.ASTNode because Already inherited */ @js.native
trait SubAssembly
  extends AssemblyItem
     with BaseASTNode {
  @JSName("type")
  var type_SubAssembly: typings.solidityParserAntlr.solidityParserAntlrStrings.SubAssembly = js.native
}

object SubAssembly {
  @scala.inline
  def apply(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.SubAssembly): SubAssembly = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubAssembly]
  }
  @scala.inline
  implicit class SubAssemblyOps[Self <: SubAssembly] (val x: Self) extends AnyVal {
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
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.SubAssembly): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

