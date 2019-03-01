package typings
package reactDashCalendarDashTimelineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Group extends js.Object {
  var group: reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineMod.TimelineGroup
  var isRightSidebar: scala.Boolean
}

object Anon_Group {
  @scala.inline
  def apply(
    group: reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineMod.TimelineGroup,
    isRightSidebar: scala.Boolean
  ): Anon_Group = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("group")(group)
    __obj.updateDynamic("isRightSidebar")(isRightSidebar)
    __obj.asInstanceOf[Anon_Group]
  }
}

