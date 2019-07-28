package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnStatement
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_ReturnStatement: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ReturnStatement
}

object ReturnStatement {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ReturnStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ReturnStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[ReturnStatement]
  }
}

