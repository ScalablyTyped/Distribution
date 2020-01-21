package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssemblyCase
  extends BaseASTNode
     with ASTNode {
  @JSName("type")
  var type_AssemblyCase: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCase
}

object AssemblyCase {
  @scala.inline
  def apply(
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.AssemblyCase,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): AssemblyCase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssemblyCase]
  }
}

