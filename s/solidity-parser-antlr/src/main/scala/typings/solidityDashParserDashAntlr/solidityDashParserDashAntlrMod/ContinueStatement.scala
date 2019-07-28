package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinueStatement
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_ContinueStatement: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ContinueStatement
}

object ContinueStatement {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ContinueStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ContinueStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[ContinueStatement]
  }
}

