package typings.reactNativeCalendars.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarDot extends StObject {
  
  var color: String
  
  var key: String
  
  var selectedDotColor: js.UndefOr[String] = js.undefined
}
object CalendarDot {
  
  inline def apply(color: String, key: String): CalendarDot = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarDot]
  }
  
  extension [Self <: CalendarDot](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setSelectedDotColor(value: String): Self = StObject.set(x, "selectedDotColor", value.asInstanceOf[js.Any])
    
    inline def setSelectedDotColorUndefined: Self = StObject.set(x, "selectedDotColor", js.undefined)
  }
}
