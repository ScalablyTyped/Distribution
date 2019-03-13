package typings
package reactDashBigDashCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DayProp[TEvent /* <: reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.Event */] extends js.Object {
  var dayProp: js.UndefOr[reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.DayPropGetter] = js.undefined
  var eventProp: js.UndefOr[reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.EventPropGetter[TEvent]] = js.undefined
  var slotProp: js.UndefOr[reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.SlotPropGetter] = js.undefined
}

object Anon_DayProp {
  @scala.inline
  def apply[TEvent /* <: reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.Event */](
    dayProp: reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.DayPropGetter = null,
    eventProp: reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.EventPropGetter[TEvent] = null,
    slotProp: reactDashBigDashCalendarLib.reactDashBigDashCalendarMod.SlotPropGetter = null
  ): Anon_DayProp[TEvent] = {
    val __obj = js.Dynamic.literal()
    if (dayProp != null) __obj.updateDynamic("dayProp")(dayProp)
    if (eventProp != null) __obj.updateDynamic("eventProp")(eventProp)
    if (slotProp != null) __obj.updateDynamic("slotProp")(slotProp)
    __obj.asInstanceOf[Anon_DayProp[TEvent]]
  }
}

