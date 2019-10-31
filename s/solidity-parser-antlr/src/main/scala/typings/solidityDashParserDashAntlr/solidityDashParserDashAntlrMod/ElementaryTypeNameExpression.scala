package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod.ASTNode because Already inherited */ trait ElementaryTypeNameExpression
  extends PrimaryExpression
     with BaseASTNode {
  var typeName: ElementaryTypeName
  @JSName("type")
  var type_ElementaryTypeNameExpression: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ElementaryTypeNameExpression
}

object ElementaryTypeNameExpression {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ElementaryTypeNameExpression,
    typeName: ElementaryTypeName,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ElementaryTypeNameExpression = {
    val __obj = js.Dynamic.literal(typeName = typeName)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[ElementaryTypeNameExpression]
  }
}

