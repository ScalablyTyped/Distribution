package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Break
  extends AssemblyItem
     with BaseASTNode {
  @JSName("type")
  var type_Break: typings.solidityParserAntlr.solidityParserAntlrStrings.Break = js.native
}

object Break {
  @scala.inline
  def apply(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.Break): Break = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Break]
  }
  @scala.inline
  implicit class BreakOps[Self <: Break] (val x: Self) extends AnyVal {
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
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.Break): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

