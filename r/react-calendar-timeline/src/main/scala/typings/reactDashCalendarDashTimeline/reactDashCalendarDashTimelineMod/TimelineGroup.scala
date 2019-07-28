package typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineGroup extends js.Object {
  var id: Double
  var rightTitle: js.UndefOr[ReactNode] = js.undefined
  var title: ReactNode
}

object TimelineGroup {
  @scala.inline
  def apply(id: Double, title: ReactNode, rightTitle: ReactNode = null): TimelineGroup = {
    val __obj = js.Dynamic.literal(id = id, title = title.asInstanceOf[js.Any])
    if (rightTitle != null) __obj.updateDynamic("rightTitle")(rightTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineGroup]
  }
}

