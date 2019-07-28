package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementaryTypeName
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_ElementaryTypeName: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ElementaryTypeName
}

object ElementaryTypeName {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ElementaryTypeName,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ElementaryTypeName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[ElementaryTypeName]
  }
}

