package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.solidityParserAntlr.mod.ASTNode because Already inherited */ @js.native
trait BinaryOperation
  extends Expression
     with BaseASTNode {
  var left: Expression = js.native
  var operator: BinOp = js.native
  var right: Expression = js.native
  @JSName("type")
  var type_BinaryOperation: typings.solidityParserAntlr.solidityParserAntlrStrings.BinaryOperation = js.native
}

object BinaryOperation {
  @scala.inline
  def apply(
    left: Expression,
    operator: BinOp,
    right: Expression,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.BinaryOperation
  ): BinaryOperation = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryOperation]
  }
  @scala.inline
  implicit class BinaryOperationOps[Self <: BinaryOperation] (val x: Self) extends AnyVal {
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
    def setLeft(value: Expression): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperator(value: BinOp): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: Expression): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.BinaryOperation): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

