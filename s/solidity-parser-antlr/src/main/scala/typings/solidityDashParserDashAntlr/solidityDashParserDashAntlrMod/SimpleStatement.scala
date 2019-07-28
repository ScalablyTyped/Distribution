package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleStatement
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_SimpleStatement: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.SimpleStatement
}

object SimpleStatement {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.SimpleStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): SimpleStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[SimpleStatement]
  }
}

