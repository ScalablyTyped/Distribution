package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableDeclarationStatement
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_VariableDeclarationStatement: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.VariableDeclarationStatement
}

object VariableDeclarationStatement {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.VariableDeclarationStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): VariableDeclarationStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[VariableDeclarationStatement]
  }
}

