package typings.reactDateRange.mod

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateContainerType extends js.Object {
  var date: Moment = js.native
}

object DateContainerType {
  @scala.inline
  def apply(date: Moment): DateContainerType = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateContainerType]
  }
  @scala.inline
  implicit class DateContainerTypeOps[Self <: DateContainerType] (val x: Self) extends AnyVal {
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
    def setDate(value: Moment): Self = this.set("date", value.asInstanceOf[js.Any])
  }
  
}

