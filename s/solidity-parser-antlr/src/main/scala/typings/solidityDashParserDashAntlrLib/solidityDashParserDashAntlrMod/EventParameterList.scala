package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventParameterList
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_EventParameterList: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.EventParameterList
}

object EventParameterList {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.EventParameterList,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): EventParameterList = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[EventParameterList]
  }
}

