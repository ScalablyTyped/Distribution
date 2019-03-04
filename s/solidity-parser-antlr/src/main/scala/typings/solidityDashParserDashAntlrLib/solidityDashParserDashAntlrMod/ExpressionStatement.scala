package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpressionStatement
  extends BaseASTNode
     with ASTNode {
  var expression: ASTNode
  @JSName("type")
  var type_ExpressionStatement: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.ExpressionStatement
}

object ExpressionStatement {
  @scala.inline
  def apply(
    expression: ASTNode,
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.ExpressionStatement,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): ExpressionStatement = {
    val __obj = js.Dynamic.literal(expression = expression)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[ExpressionStatement]
  }
}

