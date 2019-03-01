package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportDirective
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_ImportDirective: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.ImportDirective
}

object ImportDirective {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.ImportDirective,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): ImportDirective = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[ImportDirective]
  }
}

