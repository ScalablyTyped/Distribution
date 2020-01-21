package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Block
  extends BaseASTNode
     with ASTNode
     with Statement {
  var statements: js.Array[Statement]
  @JSName("type")
  var type_Block: typings.solidityParserAntlr.solidityParserAntlrStrings.Block
}

object Block {
  @scala.inline
  def apply(
    statements: js.Array[Statement],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.Block,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): Block = {
    val __obj = js.Dynamic.literal(statements = statements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
}

