package typings.reactNativeCalendars.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgendaThemeStyle
  extends StObject
     with CalendarTheme {
  
  var agendaDayNumColor: js.UndefOr[String] = js.undefined
  
  var agendaDayTextColor: js.UndefOr[String] = js.undefined
  
  var agendaKnobColor: js.UndefOr[String] = js.undefined
  
  var agendaTodayColor: js.UndefOr[String] = js.undefined
}
object AgendaThemeStyle {
  
  inline def apply(): AgendaThemeStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgendaThemeStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AgendaThemeStyle] (val x: Self) extends AnyVal {
    
    inline def setAgendaDayNumColor(value: String): Self = StObject.set(x, "agendaDayNumColor", value.asInstanceOf[js.Any])
    
    inline def setAgendaDayNumColorUndefined: Self = StObject.set(x, "agendaDayNumColor", js.undefined)
    
    inline def setAgendaDayTextColor(value: String): Self = StObject.set(x, "agendaDayTextColor", value.asInstanceOf[js.Any])
    
    inline def setAgendaDayTextColorUndefined: Self = StObject.set(x, "agendaDayTextColor", js.undefined)
    
    inline def setAgendaKnobColor(value: String): Self = StObject.set(x, "agendaKnobColor", value.asInstanceOf[js.Any])
    
    inline def setAgendaKnobColorUndefined: Self = StObject.set(x, "agendaKnobColor", js.undefined)
    
    inline def setAgendaTodayColor(value: String): Self = StObject.set(x, "agendaTodayColor", value.asInstanceOf[js.Any])
    
    inline def setAgendaTodayColorUndefined: Self = StObject.set(x, "agendaTodayColor", js.undefined)
  }
}
