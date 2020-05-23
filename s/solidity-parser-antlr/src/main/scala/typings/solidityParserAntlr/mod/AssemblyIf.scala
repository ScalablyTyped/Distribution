package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.solidityParserAntlr.mod.ASTNode because Already inherited */ trait AssemblyIf
  extends AssemblyItem
     with BaseASTNode {
  @JSName("type")
  var type_AssemblyIf: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyIf
}

object AssemblyIf {
  @scala.inline
  def apply(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyIf,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyIf = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyIf]
  }
}

