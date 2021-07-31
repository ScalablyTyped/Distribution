package typings.reactBigCalendar.anon

import typings.react.mod.HTMLAttributes
import typings.reactBigCalendar.mod.DayPropGetter
import typings.reactBigCalendar.mod.EventPropGetter
import typings.reactBigCalendar.mod.SlotPropGetter
import typings.reactBigCalendar.mod.stringOrDate
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DayProp[TEvent /* <: js.Object */] extends StObject {
  
  var dayProp: js.UndefOr[DayPropGetter] = js.undefined
  
  var eventProp: js.UndefOr[EventPropGetter[TEvent]] = js.undefined
  
  var slotProp: js.UndefOr[SlotPropGetter] = js.undefined
}
object DayProp {
  
  @scala.inline
  def apply[TEvent /* <: js.Object */](): DayProp[TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayProp[TEvent]]
  }
  
  @scala.inline
  implicit class DayPropMutableBuilder[Self <: DayProp[?], TEvent /* <: js.Object */] (val x: Self & DayProp[TEvent]) extends AnyVal {
    
    @scala.inline
    def setDayProp(
      value: (/* date */ typings.std.Date, /* resourceId */ js.UndefOr[Double | String]) => HTMLAttributes[HTMLDivElement]
    ): Self = StObject.set(x, "dayProp", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDayPropUndefined: Self = StObject.set(x, "dayProp", js.undefined)
    
    @scala.inline
    def setEventProp(
      value: (TEvent, /* start */ stringOrDate, /* end */ stringOrDate, /* isSelected */ Boolean) => HTMLAttributes[HTMLDivElement]
    ): Self = StObject.set(x, "eventProp", js.Any.fromFunction4(value))
    
    @scala.inline
    def setEventPropUndefined: Self = StObject.set(x, "eventProp", js.undefined)
    
    @scala.inline
    def setSlotProp(
      value: (/* date */ typings.std.Date, /* resourceId */ js.UndefOr[Double | String]) => HTMLAttributes[HTMLDivElement]
    ): Self = StObject.set(x, "slotProp", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSlotPropUndefined: Self = StObject.set(x, "slotProp", js.undefined)
  }
}
