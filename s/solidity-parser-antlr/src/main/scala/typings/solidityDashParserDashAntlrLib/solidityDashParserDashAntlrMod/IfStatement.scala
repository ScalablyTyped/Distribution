package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IfStatement
  extends BaseASTNode
     with ASTNode {
  var falseBody: ASTNode
  var trueBody: ASTNode
  @JSName("type")
  var type_IfStatement: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.IfStatement
}

object IfStatement {
  @scala.inline
  def apply(
    falseBody: ASTNode,
    trueBody: ASTNode,
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.IfStatement,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): IfStatement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("falseBody")(falseBody)
    __obj.updateDynamic("trueBody")(trueBody)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[IfStatement]
  }
}

