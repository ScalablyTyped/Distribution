package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InheritanceSpecifier
  extends BaseASTNode
     with ASTNode {
  var arguments: js.Array[Expression]
  var baseName: UserDefinedTypeName
  @JSName("type")
  var type_InheritanceSpecifier: typings.solidityParserAntlr.solidityParserAntlrStrings.InheritanceSpecifier
}

object InheritanceSpecifier {
  @scala.inline
  def apply(
    arguments: js.Array[Expression],
    baseName: UserDefinedTypeName,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.InheritanceSpecifier,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): InheritanceSpecifier = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], baseName = baseName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[InheritanceSpecifier]
  }
}

