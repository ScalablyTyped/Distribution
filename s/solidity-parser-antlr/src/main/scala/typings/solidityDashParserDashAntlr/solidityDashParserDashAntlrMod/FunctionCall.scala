package typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionCall
  extends Expression
     with BaseASTNode {
  var arguments: js.Array[Expression]
  var expression: Expression
  var names: js.Array[String]
  @JSName("type")
  var type_FunctionCall: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.FunctionCall
}

object FunctionCall {
  @scala.inline
  def apply(
    arguments: js.Array[Expression],
    expression: Expression,
    names: js.Array[String],
    `type`: typings.solidityDashParserDashAntlr.solidityDashParserDashAntlrStrings.FunctionCall,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): FunctionCall = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionCall]
  }
}

