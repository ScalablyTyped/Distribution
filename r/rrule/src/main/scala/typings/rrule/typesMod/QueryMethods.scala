package typings.rrule.typesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryMethods extends js.Object {
  def after(date: Date, inc: Boolean): Date = js.native
  def all(): js.Array[Date] = js.native
  def before(date: Date, inc: Boolean): Date = js.native
  def between(after: Date, before: Date, inc: Boolean): js.Array[Date] = js.native
}

object QueryMethods {
  @scala.inline
  def apply(
    after: (Date, Boolean) => Date,
    all: () => js.Array[Date],
    before: (Date, Boolean) => Date,
    between: (Date, Date, Boolean) => js.Array[Date]
  ): QueryMethods = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction2(after), all = js.Any.fromFunction0(all), before = js.Any.fromFunction2(before), between = js.Any.fromFunction3(between))
    __obj.asInstanceOf[QueryMethods]
  }
  @scala.inline
  implicit class QueryMethodsOps[Self <: QueryMethods] (val x: Self) extends AnyVal {
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
    def setAfter(value: (Date, Boolean) => Date): Self = this.set("after", js.Any.fromFunction2(value))
    @scala.inline
    def setAll(value: () => js.Array[Date]): Self = this.set("all", js.Any.fromFunction0(value))
    @scala.inline
    def setBefore(value: (Date, Boolean) => Date): Self = this.set("before", js.Any.fromFunction2(value))
    @scala.inline
    def setBetween(value: (Date, Date, Boolean) => js.Array[Date]): Self = this.set("between", js.Any.fromFunction3(value))
  }
  
}

