package typings.reactCalendarTimeline.mod

import typings.react.mod.ReactNode
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TodayMarkerProps extends MarkerProps {
  var interval: js.UndefOr[Double] = js.undefined
}

object TodayMarkerProps {
  @scala.inline
  def apply(
    date: Date | Double,
    children: /* props */ CustomMarkerChildrenProps => ReactNode = null,
    interval: Int | Double = null
  ): TodayMarkerProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[TodayMarkerProps]
  }
}

