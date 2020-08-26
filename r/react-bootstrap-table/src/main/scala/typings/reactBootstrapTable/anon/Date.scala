package typings.reactBootstrapTable.anon

import typings.reactBootstrapTable.mod.FilterComparator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Date extends js.Object {
  /**
    * Comparator value.
    */
  var comparator: FilterComparator = js.native
  /**
    * Date value. String values will be automatically converted to dates.
    */
  var date: typings.std.Date | String = js.native
}

object Date {
  @scala.inline
  def apply(comparator: FilterComparator, date: typings.std.Date | String): Date = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
  @scala.inline
  implicit class DateOps[Self <: Date] (val x: Self) extends AnyVal {
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
    def setComparator(value: FilterComparator): Self = this.set("comparator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: typings.std.Date | String): Self = this.set("date", value.asInstanceOf[js.Any])
  }
  
}

