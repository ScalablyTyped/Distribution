package typings.sparqljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ordering extends js.Object {
  var descending: js.UndefOr[Boolean] = js.native
  var expression: Expression = js.native
}

object Ordering {
  @scala.inline
  def apply(expression: Expression): Ordering = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ordering]
  }
  @scala.inline
  implicit class OrderingOps[Self <: Ordering] (val x: Self) extends AnyVal {
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
    def setExpression(value: Expression): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescending(value: Boolean): Self = this.set("descending", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescending: Self = this.set("descending", js.undefined)
  }
  
}

