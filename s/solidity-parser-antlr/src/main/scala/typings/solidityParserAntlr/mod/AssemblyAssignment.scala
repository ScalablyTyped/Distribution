package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.solidityParserAntlr.mod.ASTNode because Already inherited */ trait AssemblyAssignment
  extends AssemblyItem
     with BaseASTNode {
  var expression: AssemblyExpression
  var names: js.Array[Identifier]
  @JSName("type")
  var type_AssemblyAssignment: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyAssignment
}

object AssemblyAssignment {
  @scala.inline
  def apply(
    expression: AssemblyExpression,
    names: js.Array[Identifier],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyAssignment,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyAssignment = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyAssignment]
  }
}

