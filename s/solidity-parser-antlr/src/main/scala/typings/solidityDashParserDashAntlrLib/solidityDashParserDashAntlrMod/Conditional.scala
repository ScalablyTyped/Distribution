package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Conditional
  extends BaseASTNode
     with ASTNode {
  var falseExpression: ASTNode
  var trueExpression: ASTNode
  @JSName("type")
  var type_Conditional: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.Conditional
}

object Conditional {
  @scala.inline
  def apply(
    falseExpression: ASTNode,
    trueExpression: ASTNode,
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.Conditional,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): Conditional = {
    val __obj = js.Dynamic.literal(falseExpression = falseExpression, trueExpression = trueExpression)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[Conditional]
  }
}

