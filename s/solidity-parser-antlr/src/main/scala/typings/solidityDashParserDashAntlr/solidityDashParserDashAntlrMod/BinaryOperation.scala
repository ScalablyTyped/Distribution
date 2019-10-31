package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.ASTNode because Already inherited */ trait BinaryOperation
  extends Expression
     with BaseASTNode {
  var left: Expression
  var operator: BinOp
  var right: Expression
  @JSName("type")
  var type_BinaryOperation: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.BinaryOperation
}

object BinaryOperation {
  @scala.inline
  def apply(
    left: Expression,
    operator: BinOp,
    right: Expression,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.BinaryOperation,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): BinaryOperation = {
    val __obj = js.Dynamic.literal(left = left, operator = operator, right = right)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[BinaryOperation]
  }
}

