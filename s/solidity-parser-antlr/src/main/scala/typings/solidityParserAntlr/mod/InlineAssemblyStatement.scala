package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineAssemblyStatement
  extends BaseASTNode
     with ASTNode
     with Statement {
  var body: AssemblyBlock = js.native
  var language: String = js.native
  @JSName("type")
  var type_InlineAssemblyStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.InlineAssemblyStatement = js.native
}

object InlineAssemblyStatement {
  @scala.inline
  def apply(
    body: AssemblyBlock,
    language: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.InlineAssemblyStatement
  ): InlineAssemblyStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineAssemblyStatement]
  }
  @scala.inline
  implicit class InlineAssemblyStatementOps[Self <: InlineAssemblyStatement] (val x: Self) extends AnyVal {
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
    def setBody(value: AssemblyBlock): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.InlineAssemblyStatement): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

