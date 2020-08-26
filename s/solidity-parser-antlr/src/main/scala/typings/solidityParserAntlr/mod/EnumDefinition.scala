package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumDefinition
  extends BaseASTNode
     with ASTNode {
  var members: js.Array[EnumValue] = js.native
  var name: String = js.native
  @JSName("type")
  var type_EnumDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.EnumDefinition = js.native
}

object EnumDefinition {
  @scala.inline
  def apply(
    members: js.Array[EnumValue],
    name: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.EnumDefinition
  ): EnumDefinition = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumDefinition]
  }
  @scala.inline
  implicit class EnumDefinitionOps[Self <: EnumDefinition] (val x: Self) extends AnyVal {
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
    def setMembersVarargs(value: EnumValue*): Self = this.set("members", js.Array(value :_*))
    @scala.inline
    def setMembers(value: js.Array[EnumValue]): Self = this.set("members", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.EnumDefinition): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

