package typings.reactCalendarTimeline.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<react-calendar-timeline.react-calendar-timeline.MarkerProps, 'date'> */
trait CursorMarkerProps extends js.Object {
  var children: js.UndefOr[js.Function1[/* props */ CustomMarkerChildrenProps, ReactNode]] = js.undefined
}

object CursorMarkerProps {
  @scala.inline
  def apply(children: /* props */ CustomMarkerChildrenProps => ReactNode = null): CursorMarkerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    __obj.asInstanceOf[CursorMarkerProps]
  }
}

