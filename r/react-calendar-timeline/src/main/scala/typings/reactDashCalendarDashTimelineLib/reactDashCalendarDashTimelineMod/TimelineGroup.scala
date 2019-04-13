package typings
package reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineGroup extends js.Object {
  var id: scala.Double
  var rightTitle: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var title: reactLib.reactMod.ReactNode
}

object TimelineGroup {
  @scala.inline
  def apply(
    id: scala.Double,
    title: reactLib.reactMod.ReactNode,
    rightTitle: reactLib.reactMod.ReactNode = null
  ): TimelineGroup = {
    val __obj = js.Dynamic.literal(id = id, title = title.asInstanceOf[js.Any])
    if (rightTitle != null) __obj.updateDynamic("rightTitle")(rightTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineGroup]
  }
}

