package typings
package reactDashCalendarDashTimelineLib.reactDashCalendarDashTimelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineGroup extends js.Object {
  var id: scala.Double
  var rightTitle: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var title: reactLib.reactMod.ReactNs.ReactNode
}

object TimelineGroup {
  @scala.inline
  def apply(
    id: scala.Double,
    title: reactLib.reactMod.ReactNs.ReactNode,
    rightTitle: reactLib.reactMod.ReactNs.ReactNode = null
  ): TimelineGroup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (rightTitle != null) __obj.updateDynamic("rightTitle")(rightTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineGroup]
  }
}

