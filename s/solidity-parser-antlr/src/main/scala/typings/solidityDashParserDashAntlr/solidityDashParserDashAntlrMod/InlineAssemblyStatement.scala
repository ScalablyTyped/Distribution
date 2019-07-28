package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineAssemblyStatement
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_InlineAssemblyStatement: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.InlineAssemblyStatement
}

object InlineAssemblyStatement {
  @scala.inline
  def apply(
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.InlineAssemblyStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): InlineAssemblyStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[InlineAssemblyStatement]
  }
}

