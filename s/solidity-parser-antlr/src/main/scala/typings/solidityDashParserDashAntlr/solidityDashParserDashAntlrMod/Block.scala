package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Block
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_Block: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.Block
}

object Block {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.Block,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Block = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[Block]
  }
}

