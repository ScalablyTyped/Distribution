package typings.reactCalendarTimeline.mod

import typings.reactCalendarTimeline.AnonEndTimeStartTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderContext extends js.Object {
  var intervals: js.Array[AnonEndTimeStartTime]
  var unit: String
}

object HeaderContext {
  @scala.inline
  def apply(intervals: js.Array[AnonEndTimeStartTime], unit: String): HeaderContext = {
    val __obj = js.Dynamic.literal(intervals = intervals.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HeaderContext]
  }
}

