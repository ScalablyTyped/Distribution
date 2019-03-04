package typings
package solidityDashParserDashAntlrLib.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableDeclaration
  extends BaseASTNode
     with ASTNode {
  var isStateVar: scala.Boolean
  @JSName("type")
  var type_VariableDeclaration: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.VariableDeclaration
  var visibility: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.public | solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.`private`
}

object VariableDeclaration {
  @scala.inline
  def apply(
    isStateVar: scala.Boolean,
    `type`: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.VariableDeclaration,
    visibility: solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.public | solidityDashParserDashAntlrLib.solidityDashParserDashAntlrLibStrings.`private`,
    loc: Location = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): VariableDeclaration = {
    val __obj = js.Dynamic.literal(isStateVar = isStateVar, visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[VariableDeclaration]
  }
}

