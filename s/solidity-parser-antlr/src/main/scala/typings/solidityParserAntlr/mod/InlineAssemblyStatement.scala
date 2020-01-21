package typings.solidityParserAntlr.mod

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
  var type_InlineAssemblyStatement: typings.solidityParserAntlr.solidityParserAntlrStrings.InlineAssemblyStatement
}

object InlineAssemblyStatement {
  @scala.inline
  def apply(
    body: AssemblyBlock,
    language: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.InlineAssemblyStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): InlineAssemblyStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineAssemblyStatement]
  }
}

