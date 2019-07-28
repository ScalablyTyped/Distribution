package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionConstraint
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_VersionConstraint: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.VersionConstraint
}

object VersionConstraint {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.VersionConstraint,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): VersionConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[VersionConstraint]
  }
}

