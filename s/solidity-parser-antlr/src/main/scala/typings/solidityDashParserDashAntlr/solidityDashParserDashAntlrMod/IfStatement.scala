package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IfStatement
  extends BaseASTNode
     with ASTNode {
  var falseBody: ASTNode
  var trueBody: ASTNode
  @JSName("type")
  var type_IfStatement: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.IfStatement
}

object IfStatement {
  @scala.inline
  def apply(
    falseBody: ASTNode,
    trueBody: ASTNode,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.IfStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): IfStatement = {
    val __obj = js.Dynamic.literal(falseBody = falseBody, trueBody = trueBody)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[IfStatement]
  }
}

