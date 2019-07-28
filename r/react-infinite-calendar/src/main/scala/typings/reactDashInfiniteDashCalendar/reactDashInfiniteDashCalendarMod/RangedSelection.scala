package typings.reactDashInfiniteDashCalendar.reactDashInfiniteDashCalendarMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangedSelection extends js.Object {
  var end: Date
  var eventType: EVENT_TYPE
  var start: Date
}

object RangedSelection {
  @scala.inline
  def apply(end: Date, eventType: EVENT_TYPE, start: Date): RangedSelection = {
    val __obj = js.Dynamic.literal(end = end, eventType = eventType, start = start)
  
    __obj.asInstanceOf[RangedSelection]
  }
}

