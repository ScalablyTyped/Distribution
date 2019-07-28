package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mapping
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_Mapping: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.Mapping
}

object Mapping {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.Mapping,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Mapping = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[Mapping]
  }
}

