package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionOperator
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_VersionOperator: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.VersionOperator
}

object VersionOperator {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.VersionOperator,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): VersionOperator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[VersionOperator]
  }
}

