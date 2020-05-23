package typings.reactCalendarTimeline.anon

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.reactCalendarTimeline.mod.Interval
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<react-calendar-timeline.react-calendar-timeline.GetIntervalProps> & {  key  :string | number} */
trait RequiredGetIntervalPropsk extends js.Object {
  var interval: Interval
  var key: String | Double
  var onClick: MouseEventHandler[Element]
  var style: CSSProperties
}

object RequiredGetIntervalPropsk {
  @scala.inline
  def apply(
    interval: Interval,
    key: String | Double,
    onClick: MouseEvent[Element, NativeMouseEvent] => Unit,
    style: CSSProperties
  ): RequiredGetIntervalPropsk = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredGetIntervalPropsk]
  }
}

