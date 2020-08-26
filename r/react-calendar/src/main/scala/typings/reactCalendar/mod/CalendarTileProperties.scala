package typings.reactCalendar.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarTileProperties extends js.Object {
  var date: Date = js.native
  var view: Detail = js.native
}

object CalendarTileProperties {
  @scala.inline
  def apply(date: Date, view: Detail): CalendarTileProperties = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarTileProperties]
  }
  @scala.inline
  implicit class CalendarTilePropertiesOps[Self <: CalendarTileProperties] (val x: Self) extends AnyVal {
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
    def setView(value: Detail): Self = this.set("view", value.asInstanceOf[js.Any])
  }
  
}

