package typings.sqlBricks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhereGroup extends _WhereExpression {
  var expressions: js.Array[WhereExpression] = js.native
  var op: js.UndefOr[String] = js.native
}

object WhereGroup {
  @scala.inline
  def apply(expressions: js.Array[WhereExpression]): WhereGroup = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhereGroup]
  }
  @scala.inline
  implicit class WhereGroupOps[Self <: WhereGroup] (val x: Self) extends AnyVal {
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
    def setExpressionsVarargs(value: WhereExpression*): Self = this.set("expressions", js.Array(value :_*))
    @scala.inline
    def setExpressions(value: js.Array[WhereExpression]): Self = this.set("expressions", value.asInstanceOf[js.Any])
    @scala.inline
    def setOp(value: String): Self = this.set("op", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOp: Self = this.set("op", js.undefined)
  }
  
}

