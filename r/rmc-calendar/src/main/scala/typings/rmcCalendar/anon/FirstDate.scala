package typings.rmcCalendar.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirstDate extends js.Object {
  var firstDate: Date = js.native
  var lastDate: Date = js.native
}

object FirstDate {
  @scala.inline
  def apply(firstDate: Date, lastDate: Date): FirstDate = {
    val __obj = js.Dynamic.literal(firstDate = firstDate.asInstanceOf[js.Any], lastDate = lastDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstDate]
  }
  @scala.inline
  implicit class FirstDateOps[Self <: FirstDate] (val x: Self) extends AnyVal {
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
    def setFirstDate(value: Date): Self = this.set("firstDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastDate(value: Date): Self = this.set("lastDate", value.asInstanceOf[js.Any])
  }
  
}

