package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateVariableDeclaration
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_StateVariableDeclaration: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.StateVariableDeclaration
  var variables: js.Array[VariableDeclaration]
}

object StateVariableDeclaration {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.StateVariableDeclaration,
    variables: js.Array[VariableDeclaration],
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): StateVariableDeclaration = {
    val __obj = js.Dynamic.literal(variables = variables)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[StateVariableDeclaration]
  }
}

