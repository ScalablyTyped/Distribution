package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumValue
  extends BaseASTNode
     with ASTNode {
  var name: String
  @JSName("type")
  var type_EnumValue: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.EnumValue
}

object EnumValue {
  @scala.inline
  def apply(
    name: String,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.EnumValue,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): EnumValue = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[EnumValue]
  }
}

