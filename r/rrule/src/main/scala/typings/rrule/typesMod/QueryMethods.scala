package typings.rrule.typesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryMethods extends js.Object {
  def after(date: Date, inc: Boolean): Date
  def all(): js.Array[Date]
  def before(date: Date, inc: Boolean): Date
  def between(after: Date, before: Date, inc: Boolean): js.Array[Date]
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
}

