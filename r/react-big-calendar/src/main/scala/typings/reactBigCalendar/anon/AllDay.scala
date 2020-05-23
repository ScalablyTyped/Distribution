package typings.reactBigCalendar.anon

import typings.reactBigCalendar.mod.stringOrDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllDay[TEvent /* <: js.Object */] extends js.Object {
  var allDay: Boolean
  var end: stringOrDate
  var event: TEvent
  var start: stringOrDate
}

object AllDay {
  @scala.inline
  def apply[TEvent](allDay: Boolean, end: stringOrDate, event: TEvent, start: stringOrDate): AllDay[TEvent] = {
    val __obj = js.Dynamic.literal(allDay = allDay.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllDay[TEvent]]
  }
}

