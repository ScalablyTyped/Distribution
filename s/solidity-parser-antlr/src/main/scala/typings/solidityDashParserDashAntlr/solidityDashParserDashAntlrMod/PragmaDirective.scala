package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PragmaDirective
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_PragmaDirective: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.PragmaDirective
}

object PragmaDirective {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.PragmaDirective,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): PragmaDirective = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[PragmaDirective]
  }
}

