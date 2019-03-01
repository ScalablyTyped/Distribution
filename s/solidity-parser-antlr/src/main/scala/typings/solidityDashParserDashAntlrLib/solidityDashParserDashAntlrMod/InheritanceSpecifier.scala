package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InheritanceSpecifier
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_InheritanceSpecifier: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.InheritanceSpecifier
}

object InheritanceSpecifier {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.InheritanceSpecifier,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): InheritanceSpecifier = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[InheritanceSpecifier]
  }
}

