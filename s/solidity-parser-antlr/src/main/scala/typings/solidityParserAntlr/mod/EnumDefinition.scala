package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumDefinition
  extends BaseASTNode
     with ASTNode {
  var members: js.Array[EnumValue]
  var name: String
  @JSName("type")
  var type_EnumDefinition: typings.solidityParserAntlr.solidityParserAntlrStrings.EnumDefinition
}

object EnumDefinition {
  @scala.inline
  def apply(
    members: js.Array[EnumValue],
    name: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.EnumDefinition,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): EnumDefinition = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumDefinition]
  }
}

