package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.solidityParserAntlr.mod.ASTNode because Already inherited */ @js.native
trait Conditional
  extends Expression
     with BaseASTNode {
  var falseExpression: ASTNode = js.native
  var trueExpression: ASTNode = js.native
  @JSName("type")
  var type_Conditional: typings.solidityParserAntlr.solidityParserAntlrStrings.Conditional = js.native
}

object Conditional {
  @scala.inline
  def apply(
    falseExpression: ASTNode,
    trueExpression: ASTNode,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.Conditional
  ): Conditional = {
    val __obj = js.Dynamic.literal(falseExpression = falseExpression.asInstanceOf[js.Any], trueExpression = trueExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conditional]
  }
  @scala.inline
  implicit class ConditionalOps[Self <: Conditional] (val x: Self) extends AnyVal {
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
    def setFalseExpression(value: ASTNode): Self = this.set("falseExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrueExpression(value: ASTNode): Self = this.set("trueExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.Conditional): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

