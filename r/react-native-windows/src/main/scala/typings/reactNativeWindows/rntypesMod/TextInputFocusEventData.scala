package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextInputFocusEventData
  extends StObject
     with TargetedEvent {
  
  var eventCount: Double
  
  var text: String
}
object TextInputFocusEventData {
  
  inline def apply(eventCount: Double, target: Double, text: String): TextInputFocusEventData = {
    val __obj = js.Dynamic.literal(eventCount = eventCount.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputFocusEventData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextInputFocusEventData] (val x: Self) extends AnyVal {
    
    inline def setEventCount(value: Double): Self = StObject.set(x, "eventCount", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
