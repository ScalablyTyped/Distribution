package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifierList
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_ModifierList: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ModifierList
}

object ModifierList {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ModifierList,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ModifierList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[ModifierList]
  }
}

