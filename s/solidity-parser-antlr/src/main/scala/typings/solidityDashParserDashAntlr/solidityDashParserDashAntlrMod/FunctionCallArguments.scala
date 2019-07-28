package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionCallArguments
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_FunctionCallArguments: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.FunctionCallArguments
}

object FunctionCallArguments {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.FunctionCallArguments,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): FunctionCallArguments = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[FunctionCallArguments]
  }
}

