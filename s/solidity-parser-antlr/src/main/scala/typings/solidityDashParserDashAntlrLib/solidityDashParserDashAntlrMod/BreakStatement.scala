package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreakStatement
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_BreakStatement: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.BreakStatement
}

object BreakStatement {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.BreakStatement,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): BreakStatement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[BreakStatement]
  }
}

