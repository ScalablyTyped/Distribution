package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionTypeName
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_FunctionTypeName: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.FunctionTypeName
}

object FunctionTypeName {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.FunctionTypeName,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): FunctionTypeName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[FunctionTypeName]
  }
}

