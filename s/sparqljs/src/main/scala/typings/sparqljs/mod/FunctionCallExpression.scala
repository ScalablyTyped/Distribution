package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.functionCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionCallExpression
  extends BaseExpression
     with _Expression {
  var args: js.Array[Expression] = js.native
  var function: String = js.native
  @JSName("type")
  var type_FunctionCallExpression: functionCall = js.native
}

object FunctionCallExpression {
  @scala.inline
  def apply(args: js.Array[Expression], function: String, `type`: functionCall): FunctionCallExpression = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionCallExpression]
  }
  @scala.inline
  implicit class FunctionCallExpressionOps[Self <: FunctionCallExpression] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: Expression*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[Expression]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setFunction(value: String): Self = this.set("function", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: functionCall): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

