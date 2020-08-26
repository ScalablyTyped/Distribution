package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThrowStatement
  extends BaseASTNode
     with ASTNode
     with Statement {
  @JSName("type")
  var type_ThrowStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.ThrowStatement = js.native
}

object ThrowStatement {
  @scala.inline
  def apply(`type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ThrowStatement): ThrowStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThrowStatement]
  }
  @scala.inline
  implicit class ThrowStatementOps[Self <: ThrowStatement] (val x: Self) extends AnyVal {
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
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.ThrowStatement): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

