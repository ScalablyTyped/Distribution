package typings.reactCalendar.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarTileProperties extends js.Object {
  var date: Date
  var view: Detail
}

object CalendarTileProperties {
  @scala.inline
  def apply(date: Date, view: Detail): CalendarTileProperties = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CalendarTileProperties]
  }
}

