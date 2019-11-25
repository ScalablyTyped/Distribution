package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateVariableDeclaration
  extends BaseASTNode
     with ASTNode {
  var initialValue: js.UndefOr[Expression] = js.undefined
  @JSName("type")
  var type_StateVariableDeclaration: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.StateVariableDeclaration
  var variables: js.Array[VariableDeclaration]
}

object StateVariableDeclaration {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.StateVariableDeclaration,
    variables: js.Array[VariableDeclaration],
    initialValue: Expression = null,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): StateVariableDeclaration = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateVariableDeclaration]
  }
}

