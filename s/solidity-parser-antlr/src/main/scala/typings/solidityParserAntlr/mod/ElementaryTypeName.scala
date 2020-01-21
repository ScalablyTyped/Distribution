package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.solidityParserAntlr.mod.ASTNode because Already inherited */ trait ElementaryTypeName
  extends TypeName
     with BaseASTNode {
  var name: String
  @JSName("type")
  var type_ElementaryTypeName: typings.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeName
}

object ElementaryTypeName {
  @scala.inline
  def apply(
    name: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ElementaryTypeName,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ElementaryTypeName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementaryTypeName]
  }
}

