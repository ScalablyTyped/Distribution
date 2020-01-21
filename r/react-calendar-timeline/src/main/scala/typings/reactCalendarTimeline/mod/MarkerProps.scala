package typings.reactCalendarTimeline.mod

import typings.react.mod.ReactNode
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerProps extends js.Object {
  var children: js.UndefOr[js.Function1[/* props */ CustomMarkerChildrenProps, ReactNode]] = js.undefined
  var date: Date | Double
}

object MarkerProps {
  @scala.inline
  def apply(date: Date | Double, children: /* props */ CustomMarkerChildrenProps => ReactNode = null): MarkerProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    __obj.asInstanceOf[MarkerProps]
  }
}

