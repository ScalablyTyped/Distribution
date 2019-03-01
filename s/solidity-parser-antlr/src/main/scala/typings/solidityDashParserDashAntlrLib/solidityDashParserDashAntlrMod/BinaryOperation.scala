package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryOperation
  extends BaseASTNode
     with ASTNode {
  var left: ASTNode
  var operator: BinOp
  var right: ASTNode
  @JSName("type")
  var type_BinaryOperation: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.BinaryOperation
}

object BinaryOperation {
  @scala.inline
  def apply(
    left: ASTNode,
    operator: BinOp,
    right: ASTNode,
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.BinaryOperation,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): BinaryOperation = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("operator")(operator)
    __obj.updateDynamic("right")(right)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[BinaryOperation]
  }
}

