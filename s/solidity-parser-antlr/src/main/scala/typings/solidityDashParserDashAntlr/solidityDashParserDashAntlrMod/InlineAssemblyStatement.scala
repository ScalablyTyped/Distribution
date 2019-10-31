package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineAssemblyStatement
  extends BaseASTNode
     with ASTNode
     with Statement {
  var body: AssemblyBlock
  var language: String
  @JSName("type")
  var type_InlineAssemblyStatement: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.InlineAssemblyStatement
}

object InlineAssemblyStatement {
  @scala.inline
  def apply(
    body: AssemblyBlock,
    language: String,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.InlineAssemblyStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): InlineAssemblyStatement = {
    val __obj = js.Dynamic.literal(body = body, language = language)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[InlineAssemblyStatement]
  }
}

