package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentifierList
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_IdentifierList: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.IdentifierList
}

object IdentifierList {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.IdentifierList,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): IdentifierList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[IdentifierList]
  }
}

