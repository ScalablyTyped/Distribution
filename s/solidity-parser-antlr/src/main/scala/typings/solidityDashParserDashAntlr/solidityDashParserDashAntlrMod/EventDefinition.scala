package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDefinition
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_EventDefinition: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.EventDefinition
}

object EventDefinition {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.EventDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): EventDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[EventDefinition]
  }
}

