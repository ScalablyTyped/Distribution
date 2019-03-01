package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableDeclarationStatement
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_VariableDeclarationStatement: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.VariableDeclarationStatement
}

object VariableDeclarationStatement {
  @scala.inline
  def apply(
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.VariableDeclarationStatement,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): VariableDeclarationStatement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[VariableDeclarationStatement]
  }
}

