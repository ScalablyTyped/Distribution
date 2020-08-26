package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IfStatement
  extends BaseASTNode
     with ASTNode
     with Statement {
  var condition: Expression = js.native
  var falseBody: js.UndefOr[Statement] = js.native
  var trueBody: Statement = js.native
  @JSName("type")
  var type_IfStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.IfStatement = js.native
}

object IfStatement {
  @scala.inline
  def apply(
    condition: Expression,
    trueBody: Statement,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.IfStatement
  ): IfStatement = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], trueBody = trueBody.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfStatement]
  }
  @scala.inline
  implicit class IfStatementOps[Self <: IfStatement] (val x: Self) extends AnyVal {
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
    def setCondition(value: Expression): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrueBody(value: Statement): Self = this.set("trueBody", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.IfStatement): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setFalseBody(value: Statement): Self = this.set("falseBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFalseBody: Self = this.set("falseBody", js.undefined)
  }
  
}

