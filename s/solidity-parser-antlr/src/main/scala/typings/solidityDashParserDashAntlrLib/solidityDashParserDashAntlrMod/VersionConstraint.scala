package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionConstraint
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_VersionConstraint: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.VersionConstraint
}

object VersionConstraint {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.VersionConstraint,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): VersionConstraint = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[VersionConstraint]
  }
}

