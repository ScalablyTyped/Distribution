package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnStatement
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_ReturnStatement: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.ReturnStatement
}

object ReturnStatement {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.ReturnStatement,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): ReturnStatement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[ReturnStatement]
  }
}

