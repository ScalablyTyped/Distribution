package typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod

import typings.reactDashCalendarDashTimeline.Anon_EndTimeStartTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderContext extends js.Object {
  var intervals: js.Array[Anon_EndTimeStartTime]
  var unit: String
}

object HeaderContext {
  @scala.inline
  def apply(intervals: js.Array[Anon_EndTimeStartTime], unit: String): HeaderContext = {
    val __obj = js.Dynamic.literal(intervals = intervals.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HeaderContext]
  }
}

