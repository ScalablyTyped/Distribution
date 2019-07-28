package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressionStatement
  extends BaseASTNode
     with ASTNode {
  var expression: ASTNode
  @JSName("type")
  var type_ExpressionStatement: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ExpressionStatement
}

object ExpressionStatement {
  @scala.inline
  def apply(
    expression: ASTNode,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ExpressionStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ExpressionStatement = {
    val __obj = js.Dynamic.literal(expression = expression)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[ExpressionStatement]
  }
}

