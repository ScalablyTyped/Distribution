package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StructDefinition
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_StructDefinition: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.StructDefinition
}

object StructDefinition {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.StructDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): StructDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[StructDefinition]
  }
}

