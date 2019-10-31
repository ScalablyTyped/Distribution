package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.ASTNode because Already inherited */ trait SubAssembly
  extends AssemblyItem
     with BaseASTNode {
  @JSName("type")
  var type_SubAssembly: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.SubAssembly
}

object SubAssembly {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.SubAssembly,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): SubAssembly = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[SubAssembly]
  }
}

