package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceUnit
  extends BaseASTNode
     with ASTNode {
  var children: js.Array[ASTNode] = js.native
  @JSName("type")
  var type_SourceUnit: typings.solidityParserAntlr.solidityParserAntlrStrings.SourceUnit = js.native
}

object SourceUnit {
  @scala.inline
  def apply(
    children: js.Array[ASTNode],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.SourceUnit
  ): SourceUnit = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceUnit]
  }
  @scala.inline
  implicit class SourceUnitOps[Self <: SourceUnit] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: ASTNode*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[ASTNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.SourceUnit): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

