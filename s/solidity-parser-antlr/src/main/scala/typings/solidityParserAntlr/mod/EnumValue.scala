package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumValue
  extends BaseASTNode
     with ASTNode {
  var name: String
  @JSName("type")
  var type_EnumValue: typings.solidityParserAntlr.solidityParserAntlrStrings.EnumValue
}

object EnumValue {
  @scala.inline
  def apply(
    name: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.EnumValue,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): EnumValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValue]
  }
}

