package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateMutability
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_StateMutability: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.StateMutability
}

object StateMutability {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.StateMutability,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): StateMutability = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[StateMutability]
  }
}

