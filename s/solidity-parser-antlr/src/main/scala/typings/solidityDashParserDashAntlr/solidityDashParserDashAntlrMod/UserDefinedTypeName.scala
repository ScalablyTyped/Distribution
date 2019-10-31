package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.ASTNode because Already inherited */ trait UserDefinedTypeName
  extends TypeName
     with BaseASTNode {
  var namePath: String
  @JSName("type")
  var type_UserDefinedTypeName: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.UserDefinedTypeName
}

object UserDefinedTypeName {
  @scala.inline
  def apply(
    namePath: String,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.UserDefinedTypeName,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): UserDefinedTypeName = {
    val __obj = js.Dynamic.literal(namePath = namePath)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[UserDefinedTypeName]
  }
}

