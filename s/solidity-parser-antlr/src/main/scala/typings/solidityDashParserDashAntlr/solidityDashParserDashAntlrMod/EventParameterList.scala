package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventParameterList
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_EventParameterList: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.EventParameterList
}

object EventParameterList {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.EventParameterList,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): EventParameterList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[EventParameterList]
  }
}

