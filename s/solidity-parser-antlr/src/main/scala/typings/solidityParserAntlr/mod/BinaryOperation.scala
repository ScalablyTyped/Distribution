package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.solidityParserAntlr.mod.ASTNode because Already inherited */ trait BinaryOperation
  extends Expression
     with BaseASTNode {
  var left: Expression
  var operator: BinOp
  var right: Expression
  @JSName("type")
  var type_BinaryOperation: typings.solidityParserAntlr.solidityParserAntlrStrings.BinaryOperation
}

object BinaryOperation {
  @scala.inline
  def apply(
    left: Expression,
    operator: BinOp,
    right: Expression,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.BinaryOperation,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): BinaryOperation = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryOperation]
  }
}

