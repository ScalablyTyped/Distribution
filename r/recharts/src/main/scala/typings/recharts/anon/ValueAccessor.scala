package typings.recharts.anon

import typings.recharts.mod.RechartsFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueAccessor extends js.Object {
  var dataKey: js.UndefOr[scala.Nothing] = js.native
  var valueAccessor: RechartsFunction = js.native
}

object ValueAccessor {
  @scala.inline
  def apply(valueAccessor: /* repeated */ js.Any => Unit): ValueAccessor = {
    val __obj = js.Dynamic.literal(valueAccessor = js.Any.fromFunction1(valueAccessor))
    __obj.asInstanceOf[ValueAccessor]
  }
  @scala.inline
  implicit class ValueAccessorOps[Self <: ValueAccessor] (val x: Self) extends AnyVal {
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
    def setValueAccessor(value: /* repeated */ js.Any => Unit): Self = this.set("valueAccessor", js.Any.fromFunction1(value))
  }
  
}

