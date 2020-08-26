package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContinueStatement
  extends BaseASTNode
     with ASTNode
     with Statement {
  @JSName("type")
  var type_ContinueStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.ContinueStatement = js.native
}

object ContinueStatement {
  @scala.inline
  def apply(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ContinueStatement): ContinueStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinueStatement]
  }
  @scala.inline
  implicit class ContinueStatementOps[Self <: ContinueStatement] (val x: Self) extends AnyVal {
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
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.ContinueStatement): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

