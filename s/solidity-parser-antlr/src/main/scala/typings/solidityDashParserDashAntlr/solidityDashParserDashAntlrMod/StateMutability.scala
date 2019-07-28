package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateMutability
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_StateMutability: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.StateMutability
}

object StateMutability {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.StateMutability,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): StateMutability = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[StateMutability]
  }
}

