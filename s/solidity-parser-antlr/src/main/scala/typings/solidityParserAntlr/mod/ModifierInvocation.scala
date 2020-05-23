package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifierInvocation
  extends BaseASTNode
     with ASTNode {
  var arguments: js.Array[Expression] | Null
  var name: String
  @JSName("type")
  var type_ModifierInvocation: typings.solidityParserAntlr.solidityParserAntlrStrings.ModifierInvocation
}

object ModifierInvocation {
  @scala.inline
  def apply(
    name: String,
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.ModifierInvocation,
    arguments: js.Array[Expression] = null,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ModifierInvocation = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], arguments = arguments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifierInvocation]
  }
}

