package typings.reactDashBigDashCalendar

import typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod.stringOrDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllDay[TEvent /* <: js.Object */] extends js.Object {
  var allDay: Boolean
  var end: stringOrDate
  var event: TEvent
  var start: stringOrDate
}

object Anon_AllDay {
  @scala.inline
  def apply[TEvent /* <: js.Object */](allDay: Boolean, end: stringOrDate, event: TEvent, start: stringOrDate): Anon_AllDay[TEvent] = {
    val __obj = js.Dynamic.literal(allDay = allDay, end = end.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AllDay[TEvent]]
  }
}

