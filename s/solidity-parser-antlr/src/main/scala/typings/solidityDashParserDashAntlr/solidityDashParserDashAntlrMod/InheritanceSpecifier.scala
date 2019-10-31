package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InheritanceSpecifier
  extends BaseASTNode
     with ASTNode {
  var arguments: js.Array[Expression]
  var baseName: UserDefinedTypeName
  @JSName("type")
  var type_InheritanceSpecifier: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.InheritanceSpecifier
}

object InheritanceSpecifier {
  @scala.inline
  def apply(
    arguments: js.Array[Expression],
    baseName: UserDefinedTypeName,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.InheritanceSpecifier,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): InheritanceSpecifier = {
    val __obj = js.Dynamic.literal(arguments = arguments, baseName = baseName)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[InheritanceSpecifier]
  }
}

