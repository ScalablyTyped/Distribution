package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThrowStatement
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_ThrowStatement: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.ThrowStatement
}

object ThrowStatement {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.ThrowStatement,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): ThrowStatement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[ThrowStatement]
  }
}

