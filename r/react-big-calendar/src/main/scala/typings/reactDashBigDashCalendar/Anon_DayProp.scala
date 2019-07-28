package typings.reactDashBigDashCalendar

import typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod.DayPropGetter
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod.EventPropGetter
import typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod.SlotPropGetter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DayProp[TEvent /* <: js.Object */] extends js.Object {
  var dayProp: js.UndefOr[DayPropGetter] = js.undefined
  var eventProp: js.UndefOr[EventPropGetter[TEvent]] = js.undefined
  var slotProp: js.UndefOr[SlotPropGetter] = js.undefined
}

object Anon_DayProp {
  @scala.inline
  def apply[TEvent /* <: js.Object */](
    dayProp: DayPropGetter = null,
    eventProp: EventPropGetter[TEvent] = null,
    slotProp: SlotPropGetter = null
  ): Anon_DayProp[TEvent] = {
    val __obj = js.Dynamic.literal()
    if (dayProp != null) __obj.updateDynamic("dayProp")(dayProp)
    if (eventProp != null) __obj.updateDynamic("eventProp")(eventProp)
    if (slotProp != null) __obj.updateDynamic("slotProp")(slotProp)
    __obj.asInstanceOf[Anon_DayProp[TEvent]]
  }
}

