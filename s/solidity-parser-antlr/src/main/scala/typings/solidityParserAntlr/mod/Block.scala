package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Block
  extends BaseASTNode
     with ASTNode
     with Statement {
  var statements: js.Array[Statement] = js.native
  @JSName("type")
  var type_Block: typings.solidityParserAntlr.solidityParserAntlrStrings.Block = js.native
}

object Block {
  @scala.inline
  def apply(
    statements: js.Array[Statement],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.Block
  ): Block = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
  @scala.inline
  implicit class BlockOps[Self <: Block] (val x: Self) extends AnyVal {
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
    def setStatementsVarargs(value: Statement*): Self = this.set("statements", js.Array(value :_*))
    @scala.inline
    def setStatements(value: js.Array[Statement]): Self = this.set("statements", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.Block): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

