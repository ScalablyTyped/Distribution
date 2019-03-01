package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentifierList
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_IdentifierList: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.IdentifierList
}

object IdentifierList {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.IdentifierList,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): IdentifierList = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[IdentifierList]
  }
}

