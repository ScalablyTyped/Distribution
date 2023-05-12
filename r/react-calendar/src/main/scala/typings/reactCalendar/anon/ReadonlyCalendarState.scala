package typings.reactCalendar.anon

import typings.reactCalendar.distCjsSharedTypesMod.Value
import typings.reactCalendar.distCjsSharedTypesMod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-calendar.react-calendar/dist/cjs/Calendar.CalendarState> */
trait ReadonlyCalendarState extends StObject {
  
  val action: js.UndefOr[typings.reactCalendar.distCjsSharedTypesMod.Action] = js.undefined
  
  val activeStartDate: js.UndefOr[js.Date | Null] = js.undefined
  
  val hover: js.UndefOr[js.Date | Null] = js.undefined
  
  val value: js.UndefOr[Value] = js.undefined
  
  val view: js.UndefOr[View] = js.undefined
}
object ReadonlyCalendarState {
  
  inline def apply(): ReadonlyCalendarState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyCalendarState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyCalendarState] (val x: Self) extends AnyVal {
    
    inline def setAction(value: typings.reactCalendar.distCjsSharedTypesMod.Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setActiveStartDate(value: js.Date): Self = StObject.set(x, "activeStartDate", value.asInstanceOf[js.Any])
    
    inline def setActiveStartDateNull: Self = StObject.set(x, "activeStartDate", null)
    
    inline def setActiveStartDateUndefined: Self = StObject.set(x, "activeStartDate", js.undefined)
    
    inline def setHover(value: js.Date): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverNull: Self = StObject.set(x, "hover", null)
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
