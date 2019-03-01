package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionOperator
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_VersionOperator: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.VersionOperator
}

object VersionOperator {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.VersionOperator,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): VersionOperator = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[VersionOperator]
  }
}

