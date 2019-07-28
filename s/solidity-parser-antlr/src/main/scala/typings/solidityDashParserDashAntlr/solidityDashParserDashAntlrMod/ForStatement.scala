package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForStatement
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_ForStatement: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ForStatement
}

object ForStatement {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ForStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ForStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[ForStatement]
  }
}

