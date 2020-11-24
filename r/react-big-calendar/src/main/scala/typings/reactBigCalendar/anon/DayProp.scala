package typings.reactBigCalendar.anon

import typings.react.mod.HTMLAttributes
import typings.reactBigCalendar.mod.DayPropGetter
import typings.reactBigCalendar.mod.EventPropGetter
import typings.reactBigCalendar.mod.SlotPropGetter
import typings.reactBigCalendar.mod.stringOrDate
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DayProp[TEvent /* <: js.Object */] extends js.Object {
  
  var dayProp: js.UndefOr[DayPropGetter] = js.native
  
  var eventProp: js.UndefOr[EventPropGetter[TEvent]] = js.native
  
  var slotProp: js.UndefOr[SlotPropGetter] = js.native
}
object DayProp {
  
  @scala.inline
  def apply[TEvent /* <: js.Object */](): DayProp[TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayProp[TEvent]]
  }
  
  @scala.inline
  implicit class DayPropOps[Self <: DayProp[_], TEvent /* <: js.Object */] (val x: Self with DayProp[TEvent]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDayProp(
      value: (/* date */ typings.std.Date, /* resourceId */ js.UndefOr[Double | String]) => HTMLAttributes[HTMLDivElement]
    ): Self = this.set("dayProp", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDayProp: Self = this.set("dayProp", js.undefined)
    
    @scala.inline
    def setEventProp(
      value: (TEvent, /* start */ stringOrDate, /* end */ stringOrDate, /* isSelected */ Boolean) => HTMLAttributes[HTMLDivElement]
    ): Self = this.set("eventProp", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteEventProp: Self = this.set("eventProp", js.undefined)
    
    @scala.inline
    def setSlotProp(
      value: (/* date */ typings.std.Date, /* resourceId */ js.UndefOr[Double | String]) => HTMLAttributes[HTMLDivElement]
    ): Self = this.set("slotProp", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSlotProp: Self = this.set("slotProp", js.undefined)
  }
}
