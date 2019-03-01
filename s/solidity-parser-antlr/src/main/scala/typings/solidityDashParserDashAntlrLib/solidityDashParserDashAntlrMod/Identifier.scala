package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identifier
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_Identifier: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.Identifier
}

object Identifier {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.Identifier,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): Identifier = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[Identifier]
  }
}

