package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.ASTNode because Already inherited */ trait AssemblyAssignment
  extends AssemblyItem
     with BaseASTNode {
  var expression: AssemblyExpression
  var names: js.Array[Identifier]
  @JSName("type")
  var type_AssemblyAssignment: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyAssignment
}

object AssemblyAssignment {
  @scala.inline
  def apply(
    expression: AssemblyExpression,
    names: js.Array[Identifier],
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyAssignment,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyAssignment = {
    val __obj = js.Dynamic.literal(expression = expression, names = names)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[AssemblyAssignment]
  }
}

