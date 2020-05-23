package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.solidityParserAntlr.mod.ASTNode because Already inherited */ trait AssemblyLocalDefinition
  extends AssemblyItem
     with BaseASTNode {
  @JSName("type")
  var type_AssemblyLocalDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLocalDefinition
}

object AssemblyLocalDefinition {
  @scala.inline
  def apply(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyLocalDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyLocalDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyLocalDefinition]
  }
}

