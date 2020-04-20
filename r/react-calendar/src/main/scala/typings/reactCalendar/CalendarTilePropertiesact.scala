package typings.reactCalendar

import typings.reactCalendar.mod.Detail
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-calendar.react-calendar.CalendarTileProperties & {  activeStartDate  :std.Date} */
trait CalendarTilePropertiesact extends js.Object {
  var activeStartDate: Date
  var date: Date
  var view: Detail
}

object CalendarTilePropertiesact {
  @scala.inline
  def apply(activeStartDate: Date, date: Date, view: Detail): CalendarTilePropertiesact = {
    val __obj = js.Dynamic.literal(activeStartDate = activeStartDate.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarTilePropertiesact]
  }
}

