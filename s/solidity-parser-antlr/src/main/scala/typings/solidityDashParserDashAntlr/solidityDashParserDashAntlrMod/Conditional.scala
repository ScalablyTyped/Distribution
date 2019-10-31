package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.ASTNode because Already inherited */ trait Conditional
  extends Expression
     with BaseASTNode {
  var falseExpression: ASTNode
  var trueExpression: ASTNode
  @JSName("type")
  var type_Conditional: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.Conditional
}

object Conditional {
  @scala.inline
  def apply(
    falseExpression: ASTNode,
    trueExpression: ASTNode,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.Conditional,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Conditional = {
    val __obj = js.Dynamic.literal(falseExpression = falseExpression, trueExpression = trueExpression)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[Conditional]
  }
}

