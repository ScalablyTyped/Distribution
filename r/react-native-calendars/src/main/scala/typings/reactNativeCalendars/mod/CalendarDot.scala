package typings.reactNativeCalendars.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarDot extends StObject {
  
  var color: String = js.native
  
  var key: String = js.native
  
  var selectedDotColor: js.UndefOr[String] = js.native
}
object CalendarDot {
  
  @scala.inline
  def apply(color: String, key: String): CalendarDot = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarDot]
  }
  
  @scala.inline
  implicit class CalendarDotMutableBuilder[Self <: CalendarDot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedDotColor(value: String): Self = StObject.set(x, "selectedDotColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedDotColorUndefined: Self = StObject.set(x, "selectedDotColor", js.undefined)
  }
}
