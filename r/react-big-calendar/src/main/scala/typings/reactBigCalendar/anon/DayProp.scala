package typings.reactBigCalendar.anon

import typings.react.mod.HTMLAttributes
import typings.reactBigCalendar.mod.DayPropGetter
import typings.reactBigCalendar.mod.EventPropGetter
import typings.reactBigCalendar.mod.SlotPropGetter
import typings.reactBigCalendar.mod.stringOrDate
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DayProp[TEvent /* <: js.Object */] extends js.Object {
  var dayProp: js.UndefOr[DayPropGetter] = js.undefined
  var eventProp: js.UndefOr[EventPropGetter[TEvent]] = js.undefined
  var slotProp: js.UndefOr[SlotPropGetter] = js.undefined
}

object DayProp {
  @scala.inline
  def apply[/* <: js.Object */ TEvent](
    dayProp: (/* date */ typings.std.Date, /* resourceId */ js.UndefOr[Double | String]) => HTMLAttributes[HTMLDivElement] = null,
    eventProp: (TEvent, /* start */ stringOrDate, /* end */ stringOrDate, /* isSelected */ Boolean) => HTMLAttributes[HTMLDivElement] = null,
    slotProp: (/* date */ typings.std.Date, /* resourceId */ js.UndefOr[Double | String]) => HTMLAttributes[HTMLDivElement] = null
  ): DayProp[TEvent] = {
    val __obj = js.Dynamic.literal()
    if (dayProp != null) __obj.updateDynamic("dayProp")(js.Any.fromFunction2(dayProp))
    if (eventProp != null) __obj.updateDynamic("eventProp")(js.Any.fromFunction4(eventProp))
    if (slotProp != null) __obj.updateDynamic("slotProp")(js.Any.fromFunction2(slotProp))
    __obj.asInstanceOf[DayProp[TEvent]]
  }
}

