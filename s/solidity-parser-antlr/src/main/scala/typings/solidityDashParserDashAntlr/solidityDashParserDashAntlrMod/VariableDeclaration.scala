package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.`private`
import typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.public
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableDeclaration
  extends BaseASTNode
     with ASTNode {
  var isStateVar: Boolean
  @JSName("type")
  var type_VariableDeclaration: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.VariableDeclaration
  var visibility: public | `private`
}

object VariableDeclaration {
  @scala.inline
  def apply(
    isStateVar: Boolean,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.VariableDeclaration,
    visibility: public | `private`,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): VariableDeclaration = {
    val __obj = js.Dynamic.literal(isStateVar = isStateVar, visibility = visibility.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[VariableDeclaration]
  }
}

