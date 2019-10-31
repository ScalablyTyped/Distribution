package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhileStatement
  extends BaseASTNode
     with ASTNode
     with Statement {
  @JSName("type")
  var type_WhileStatement: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.WhileStatement
}

object WhileStatement {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.WhileStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): WhileStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[WhileStatement]
  }
}

