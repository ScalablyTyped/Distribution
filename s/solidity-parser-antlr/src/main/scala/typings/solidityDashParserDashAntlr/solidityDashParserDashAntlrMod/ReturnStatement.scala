package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnStatement
  extends BaseASTNode
     with ASTNode
     with Statement {
  var expression: Expression | Null
  @JSName("type")
  var type_ReturnStatement: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ReturnStatement
}

object ReturnStatement {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ReturnStatement,
    expression: Expression = null,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ReturnStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[ReturnStatement]
  }
}

