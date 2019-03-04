package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceUnit
  extends BaseASTNode
     with ASTNode {
  var children: js.Array[ASTNode]
  @JSName("type")
  var type_SourceUnit: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.SourceUnit
}

object SourceUnit {
  @scala.inline
  def apply(
    children: js.Array[ASTNode],
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.SourceUnit,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): SourceUnit = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[SourceUnit]
  }
}

