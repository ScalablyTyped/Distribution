package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PragmaName
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_PragmaName: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.PragmaName
}

object PragmaName {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.PragmaName,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): PragmaName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[PragmaName]
  }
}

