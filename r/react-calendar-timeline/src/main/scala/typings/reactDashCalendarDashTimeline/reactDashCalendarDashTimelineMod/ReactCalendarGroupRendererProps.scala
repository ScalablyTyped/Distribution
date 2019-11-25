package typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactCalendarGroupRendererProps[CustomGroup /* <: TimelineGroupBase */] extends js.Object {
  var group: CustomGroup
  var isRightSidebar: js.UndefOr[Boolean] = js.undefined
}

object ReactCalendarGroupRendererProps {
  @scala.inline
  def apply[CustomGroup /* <: TimelineGroupBase */](group: CustomGroup, isRightSidebar: js.UndefOr[Boolean] = js.undefined): ReactCalendarGroupRendererProps[CustomGroup] = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    if (!js.isUndefined(isRightSidebar)) __obj.updateDynamic("isRightSidebar")(isRightSidebar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactCalendarGroupRendererProps[CustomGroup]]
  }
}

