package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifierInvocation
  extends BaseASTNode
     with ASTNode {
  var arguments: js.Array[Expression] | Null = js.native
  var name: String = js.native
  @JSName("type")
  var type_ModifierInvocation: typings.solidityParserAntlr.solidityParserAntlrStrings.ModifierInvocation = js.native
}

object ModifierInvocation {
  @scala.inline
  def apply(name: String, `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ModifierInvocation): ModifierInvocation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifierInvocation]
  }
  @scala.inline
  implicit class ModifierInvocationOps[Self <: ModifierInvocation] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.ModifierInvocation): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgumentsVarargs(value: Expression*): Self = this.set("arguments", js.Array(value :_*))
    @scala.inline
    def setArguments(value: js.Array[Expression]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgumentsNull: Self = this.set("arguments", null)
  }
  
}

