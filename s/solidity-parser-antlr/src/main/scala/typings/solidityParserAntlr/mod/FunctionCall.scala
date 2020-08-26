package typings.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionCall
  extends Expression
     with BaseASTNode {
  var arguments: js.Array[Expression] = js.native
  var expression: Expression = js.native
  var names: js.Array[String] = js.native
  @JSName("type")
  var type_FunctionCall: typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionCall = js.native
}

object FunctionCall {
  @scala.inline
  def apply(
    arguments: js.Array[Expression],
    expression: Expression,
    names: js.Array[String],
    `type`: typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionCall
  ): FunctionCall = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionCall]
  }
  @scala.inline
  implicit class FunctionCallOps[Self <: FunctionCall] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgumentsVarargs(value: Expression*): Self = this.set("arguments", js.Array(value :_*))
    @scala.inline
    def setArguments(value: js.Array[Expression]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpression(value: Expression): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamesVarargs(value: String*): Self = this.set("names", js.Array(value :_*))
    @scala.inline
    def setNames(value: js.Array[String]): Self = this.set("names", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.solidityParserAntlr.solidityParserAntlrStrings.FunctionCall): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

