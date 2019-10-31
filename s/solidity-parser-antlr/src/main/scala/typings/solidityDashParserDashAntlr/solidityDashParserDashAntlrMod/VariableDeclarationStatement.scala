package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.Statement because Already inherited */ trait VariableDeclarationStatement
  extends SimpleStatement
     with BaseASTNode
     with ASTNode {
  var initialValue: js.UndefOr[Expression] = js.undefined
  @JSName("type")
  var type_VariableDeclarationStatement: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.VariableDeclarationStatement
  var variables: js.Array[ASTNode]
}

object VariableDeclarationStatement {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.VariableDeclarationStatement,
    variables: js.Array[ASTNode],
    initialValue: Expression = null,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): VariableDeclarationStatement = {
    val __obj = js.Dynamic.literal(variables = variables)
    __obj.updateDynamic("type")(`type`)
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[VariableDeclarationStatement]
  }
}

