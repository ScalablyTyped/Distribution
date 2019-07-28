package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionTypeParameter
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_FunctionTypeParameter: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.FunctionTypeParameter
}

object FunctionTypeParameter {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.FunctionTypeParameter,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): FunctionTypeParameter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[FunctionTypeParameter]
  }
}

