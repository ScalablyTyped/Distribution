package typings.reactBigCalendar.anon

import typings.react.mod.ComponentType
import typings.reactBigCalendar.mod.ViewStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Agenda extends StObject {
  
  var agenda: js.UndefOr[Boolean | (ComponentType[Any] & ViewStatic)] = js.undefined
  
  var day: js.UndefOr[Boolean | (ComponentType[Any] & ViewStatic)] = js.undefined
  
  var month: js.UndefOr[Boolean | (ComponentType[Any] & ViewStatic)] = js.undefined
  
  var week: js.UndefOr[Boolean | (ComponentType[Any] & ViewStatic)] = js.undefined
  
  var work_week: js.UndefOr[Boolean | (ComponentType[Any] & ViewStatic)] = js.undefined
}
object Agenda {
  
  inline def apply(): Agenda = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Agenda]
  }
  
  extension [Self <: Agenda](x: Self) {
    
    inline def setAgenda(value: Boolean | (ComponentType[Any] & ViewStatic)): Self = StObject.set(x, "agenda", value.asInstanceOf[js.Any])
    
    inline def setAgendaUndefined: Self = StObject.set(x, "agenda", js.undefined)
    
    inline def setDay(value: Boolean | (ComponentType[Any] & ViewStatic)): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setMonth(value: Boolean | (ComponentType[Any] & ViewStatic)): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setWeek(value: Boolean | (ComponentType[Any] & ViewStatic)): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
    
    inline def setWeekUndefined: Self = StObject.set(x, "week", js.undefined)
    
    inline def setWork_week(value: Boolean | (ComponentType[Any] & ViewStatic)): Self = StObject.set(x, "work_week", value.asInstanceOf[js.Any])
    
    inline def setWork_weekUndefined: Self = StObject.set(x, "work_week", js.undefined)
  }
}
