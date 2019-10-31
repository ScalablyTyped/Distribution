package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringLiteral
  extends AssemblyItem
     with BaseASTNode {
  @JSName("type")
  var type_StringLiteral: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.StringLiteral
  var value: String
}

object StringLiteral {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.StringLiteral,
    value: String,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): StringLiteral = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[StringLiteral]
  }
}

