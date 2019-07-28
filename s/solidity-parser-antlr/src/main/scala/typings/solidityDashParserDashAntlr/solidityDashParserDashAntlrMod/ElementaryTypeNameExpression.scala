package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementaryTypeNameExpression
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_ElementaryTypeNameExpression: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ElementaryTypeNameExpression
}

object ElementaryTypeNameExpression {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ElementaryTypeNameExpression,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ElementaryTypeNameExpression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[ElementaryTypeNameExpression]
  }
}

