package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventDefinition
  extends BaseASTNode
     with ASTNode {
  var name: String = js.native
  var parameters: js.Array[VariableDeclaration] = js.native
  @JSName("type")
  var type_EventDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.EventDefinition = js.native
}

object EventDefinition {
  @scala.inline
  def apply(
    name: String,
    parameters: js.Array[VariableDeclaration],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.EventDefinition
  ): EventDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDefinition]
  }
  @scala.inline
  implicit class EventDefinitionOps[Self <: EventDefinition] (val x: Self) extends AnyVal {
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
    def setParametersVarargs(value: VariableDeclaration*): Self = this.set("parameters", js.Array(value :_*))
    @scala.inline
    def setParameters(value: js.Array[VariableDeclaration]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.EventDefinition): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

