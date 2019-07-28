package typings.reactDashBigDashCalendar

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End[TEvent /* <: js.Object */] extends js.Object {
  var end: js.UndefOr[js.Function1[/* event */ TEvent, Date]] = js.undefined
  var start: js.UndefOr[js.Function1[/* event */ TEvent, Date]] = js.undefined
  var title: js.UndefOr[js.Function1[/* event */ TEvent, String]] = js.undefined
  var tooltip: js.UndefOr[js.Function1[/* event */ TEvent, String]] = js.undefined
}

object Anon_End {
  @scala.inline
  def apply[TEvent /* <: js.Object */](
    end: /* event */ TEvent => Date = null,
    start: /* event */ TEvent => Date = null,
    title: /* event */ TEvent => String = null,
    tooltip: /* event */ TEvent => String = null
  ): Anon_End[TEvent] = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(js.Any.fromFunction1(end))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    if (title != null) __obj.updateDynamic("title")(js.Any.fromFunction1(title))
    if (tooltip != null) __obj.updateDynamic("tooltip")(js.Any.fromFunction1(tooltip))
    __obj.asInstanceOf[Anon_End[TEvent]]
  }
}

