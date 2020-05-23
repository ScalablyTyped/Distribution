package typings.reactCalendar.anon

import typings.reactCalendar.mod.Detail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-calendar.react-calendar.CalendarTileProperties & {  activeStartDate  :std.Date} */
trait CalendarTilePropertiesact extends js.Object {
  var activeStartDate: typings.std.Date
  var date: typings.std.Date
  var view: Detail
}

object CalendarTilePropertiesact {
  @scala.inline
  def apply(activeStartDate: typings.std.Date, date: typings.std.Date, view: Detail): CalendarTilePropertiesact = {
    val __obj = js.Dynamic.literal(activeStartDate = activeStartDate.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarTilePropertiesact]
  }
}

