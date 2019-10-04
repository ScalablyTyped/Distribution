package typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod

import typings.react.reactMod.ReactNode
import typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.left
import typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidebarHeaderProps[Data] extends js.Object {
  var headerData: js.UndefOr[Data] = js.undefined
  var variant: js.UndefOr[left | right] = js.undefined
  def children(props: SidebarHeaderChildrenFnProps[Data]): ReactNode
}

object SidebarHeaderProps {
  @scala.inline
  def apply[Data](
    children: SidebarHeaderChildrenFnProps[Data] => ReactNode,
    headerData: Data = null,
    variant: left | right = null
  ): SidebarHeaderProps[Data] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (headerData != null) __obj.updateDynamic("headerData")(headerData.asInstanceOf[js.Any])
    if (variant != null) __obj.updateDynamic("variant")(variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[SidebarHeaderProps[Data]]
  }
}

