package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.solidityParserAntlr.mod.ASTNode because Already inherited */ trait UserDefinedTypeName
  extends TypeName
     with BaseASTNode {
  var namePath: String
  @JSName("type")
  var type_UserDefinedTypeName: typings.solidityParserAntlr.solidityParserAntlrStrings.UserDefinedTypeName
}

object UserDefinedTypeName {
  @scala.inline
  def apply(
    namePath: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.UserDefinedTypeName,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): UserDefinedTypeName = {
    val __obj = js.Dynamic.literal(namePath = namePath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDefinedTypeName]
  }
}

