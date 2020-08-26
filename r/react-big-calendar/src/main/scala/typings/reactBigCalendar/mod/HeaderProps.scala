package typings.reactBigCalendar.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderProps extends js.Object {
  var date: Date = js.native
  var label: String = js.native
  var localizer: DateLocalizer = js.native
}

object HeaderProps {
  @scala.inline
  def apply(date: Date, label: String, localizer: DateLocalizer): HeaderProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], localizer = localizer.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderProps]
  }
  @scala.inline
  implicit class HeaderPropsOps[Self <: HeaderProps] (val x: Self) extends AnyVal {
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
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocalizer(value: DateLocalizer): Self = this.set("localizer", value.asInstanceOf[js.Any])
  }
  
}

