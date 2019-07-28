package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventParameter
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_EventParameter: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.EventParameter
}

object EventParameter {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.EventParameter,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): EventParameter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[EventParameter]
  }
}

