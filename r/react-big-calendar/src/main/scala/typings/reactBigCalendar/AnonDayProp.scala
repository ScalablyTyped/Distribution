package typings.reactBigCalendar

import typings.reactBigCalendar.mod.DayPropGetter
import typings.reactBigCalendar.mod.EventPropGetter
import typings.reactBigCalendar.mod.SlotPropGetter
import typings.reactBigCalendar.mod.stringOrDate
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDayProp[TEvent /* <: js.Object */] extends js.Object {
  var dayProp: js.UndefOr[DayPropGetter] = js.undefined
  var eventProp: js.UndefOr[EventPropGetter[TEvent]] = js.undefined
  var slotProp: js.UndefOr[SlotPropGetter] = js.undefined
}

object AnonDayProp {
  @scala.inline
  def apply[TEvent /* <: js.Object */](
    dayProp: /* date */ Date => AnonClassName = null,
    eventProp: (TEvent, /* start */ stringOrDate, /* end */ stringOrDate, /* isSelected */ Boolean) => AnonClassName = null,
    slotProp: /* date */ Date => AnonClassName = null
  ): AnonDayProp[TEvent] = {
    val __obj = js.Dynamic.literal()
    if (dayProp != null) __obj.updateDynamic("dayProp")(js.Any.fromFunction1(dayProp))
    if (eventProp != null) __obj.updateDynamic("eventProp")(js.Any.fromFunction4(eventProp))
    if (slotProp != null) __obj.updateDynamic("slotProp")(js.Any.fromFunction1(slotProp))
    __obj.asInstanceOf[AnonDayProp[TEvent]]
  }
}

