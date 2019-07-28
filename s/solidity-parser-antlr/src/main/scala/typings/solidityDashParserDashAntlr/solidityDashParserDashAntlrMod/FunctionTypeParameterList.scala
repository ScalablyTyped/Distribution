package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionTypeParameterList
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_FunctionTypeParameterList: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.FunctionTypeParameterList
}

object FunctionTypeParameterList {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.FunctionTypeParameterList,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): FunctionTypeParameterList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[FunctionTypeParameterList]
  }
}

