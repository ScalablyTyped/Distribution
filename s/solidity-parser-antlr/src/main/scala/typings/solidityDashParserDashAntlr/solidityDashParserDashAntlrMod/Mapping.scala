package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.ASTNode because Already inherited */ trait Mapping
  extends TypeName
     with BaseASTNode {
  var keyType: ElementaryTypeName
  @JSName("type")
  var type_Mapping: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.Mapping
  var valueType: TypeName
}

object Mapping {
  @scala.inline
  def apply(
    keyType: ElementaryTypeName,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.Mapping,
    valueType: TypeName,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Mapping = {
    val __obj = js.Dynamic.literal(keyType = keyType.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mapping]
  }
}

