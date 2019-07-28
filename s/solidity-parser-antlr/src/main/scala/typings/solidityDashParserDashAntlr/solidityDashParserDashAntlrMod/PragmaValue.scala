package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PragmaValue
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_PragmaValue: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.PragmaValue
}

object PragmaValue {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.PragmaValue,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): PragmaValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[PragmaValue]
  }
}

