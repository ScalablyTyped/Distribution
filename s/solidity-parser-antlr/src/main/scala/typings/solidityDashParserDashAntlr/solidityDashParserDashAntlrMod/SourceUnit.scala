package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceUnit
  extends BaseASTNode
     with ASTNode {
  var children: js.Array[ASTNode]
  @JSName("type")
  var type_SourceUnit: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.SourceUnit
}

object SourceUnit {
  @scala.inline
  def apply(
    children: js.Array[ASTNode],
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.SourceUnit,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): SourceUnit = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[SourceUnit]
  }
}

