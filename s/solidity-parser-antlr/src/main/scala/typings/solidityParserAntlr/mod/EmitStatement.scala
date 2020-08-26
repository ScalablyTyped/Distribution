package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmitStatement
  extends BaseASTNode
     with ASTNode
     with Statement {
  var eventCall: FunctionCall = js.native
  @JSName("type")
  var type_EmitStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.EmitStatement = js.native
}

object EmitStatement {
  @scala.inline
  def apply(
    eventCall: FunctionCall,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.EmitStatement
  ): EmitStatement = {
    val __obj = js.Dynamic.literal(eventCall = eventCall.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitStatement]
  }
  @scala.inline
  implicit class EmitStatementOps[Self <: EmitStatement] (val x: Self) extends AnyVal {
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
    def setEventCall(value: FunctionCall): Self = this.set("eventCall", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.EmitStatement): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

