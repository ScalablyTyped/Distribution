package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifierInvocation
  extends BaseASTNode
     with ASTNode {
  var arguments: js.Array[Expression] | Null
  var name: String
  @JSName("type")
  var type_ModifierInvocation: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ModifierInvocation
}

object ModifierInvocation {
  @scala.inline
  def apply(
    name: String,
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.ModifierInvocation,
    arguments: js.Array[Expression] = null,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): ModifierInvocation = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[ModifierInvocation]
  }
}

