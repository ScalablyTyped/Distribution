package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssemblyExpression
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_AssemblyExpression: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyExpression
}

object AssemblyExpression {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyExpression,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[AssemblyExpression]
  }
}

