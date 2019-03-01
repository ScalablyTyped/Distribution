package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PragmaName
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_PragmaName: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.PragmaName
}

object PragmaName {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.PragmaName,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): PragmaName = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[PragmaName]
  }
}

