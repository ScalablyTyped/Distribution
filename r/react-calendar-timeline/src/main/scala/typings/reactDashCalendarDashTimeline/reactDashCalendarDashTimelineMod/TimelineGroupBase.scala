package typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineGroupBase extends js.Object {
  var id: Id
  var rightTitle: js.UndefOr[ReactNode] = js.undefined
  var title: ReactNode
}

object TimelineGroupBase {
  @scala.inline
  def apply(id: Id, rightTitle: ReactNode = null, title: ReactNode = null): TimelineGroupBase = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (rightTitle != null) __obj.updateDynamic("rightTitle")(rightTitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineGroupBase]
  }
}

