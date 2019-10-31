package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Block
  extends BaseASTNode
     with ASTNode
     with Statement {
  var statements: js.Array[Statement]
  @JSName("type")
  var type_Block: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.Block
}

object Block {
  @scala.inline
  def apply(
    statements: js.Array[Statement],
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.Block,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Block = {
    val __obj = js.Dynamic.literal(statements = statements)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[Block]
  }
}

