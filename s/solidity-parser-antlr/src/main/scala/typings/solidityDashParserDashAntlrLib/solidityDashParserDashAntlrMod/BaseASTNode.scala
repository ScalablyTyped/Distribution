package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseASTNode extends js.Object {
  var loc: js.UndefOr[Location] = js.undefined
  var range: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var `type`: ASTNodeTypeString
}

object BaseASTNode {
  @scala.inline
  def apply(
    `type`: ASTNodeTypeString,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): BaseASTNode = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[BaseASTNode]
  }
}

