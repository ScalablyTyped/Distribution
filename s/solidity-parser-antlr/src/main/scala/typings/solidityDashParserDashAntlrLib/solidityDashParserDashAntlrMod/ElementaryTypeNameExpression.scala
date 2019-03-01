package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementaryTypeNameExpression
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_ElementaryTypeNameExpression: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.ElementaryTypeNameExpression
}

object ElementaryTypeNameExpression {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.ElementaryTypeNameExpression,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): ElementaryTypeNameExpression = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[ElementaryTypeNameExpression]
  }
}

