package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberLiteral
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_NumberLiteral: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.NumberLiteral
}

object NumberLiteral {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.NumberLiteral,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): NumberLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[NumberLiteral]
  }
}

