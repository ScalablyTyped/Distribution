package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.ASTNode because Already inherited */ trait AssemblyLocalDefinition
  extends AssemblyItem
     with BaseASTNode {
  @JSName("type")
  var type_AssemblyLocalDefinition: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyLocalDefinition
}

object AssemblyLocalDefinition {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.AssemblyLocalDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyLocalDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[AssemblyLocalDefinition]
  }
}

