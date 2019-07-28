package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnParameters
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_ReturnParameters: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ReturnParameters
}

object ReturnParameters {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ReturnParameters,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ReturnParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[ReturnParameters]
  }
}

