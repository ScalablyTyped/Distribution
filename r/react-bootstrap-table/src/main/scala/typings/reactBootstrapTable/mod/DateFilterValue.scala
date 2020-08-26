package typings.reactBootstrapTable.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateFilterValue extends _FilterValueData {
  var comparator: FilterComparator = js.native
  var date: Date | String = js.native
}

object DateFilterValue {
  @scala.inline
  def apply(comparator: FilterComparator, date: Date | String): DateFilterValue = {
    val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateFilterValue]
  }
  @scala.inline
  implicit class DateFilterValueOps[Self <: DateFilterValue] (val x: Self) extends AnyVal {
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
    def setDate(value: Date | String): Self = this.set("date", value.asInstanceOf[js.Any])
  }
  
}

