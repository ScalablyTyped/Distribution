package typings
package reactDashCalendarDashTimelineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  var context: reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineMod.TimelineContext
  var item: reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineMod.TimelineItem
}

object Anon_Context {
  @scala.inline
  def apply(
    context: reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineMod.TimelineContext,
    item: reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineMod.TimelineItem
  ): Anon_Context = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("context")(context)
    __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[Anon_Context]
  }
}

