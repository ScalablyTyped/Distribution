package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PragmaValue
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_PragmaValue: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.PragmaValue
}

object PragmaValue {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.PragmaValue,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): PragmaValue = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[PragmaValue]
  }
}

