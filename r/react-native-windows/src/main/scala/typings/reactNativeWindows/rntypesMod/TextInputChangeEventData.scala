package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextInputChangeEventData
  extends StObject
     with TargetedEvent {
  
  var eventCount: Double
  
  var text: String
}
object TextInputChangeEventData {
  
  inline def apply(eventCount: Double, target: Double, text: String): TextInputChangeEventData = {
    val __obj = js.Dynamic.literal(eventCount = eventCount.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputChangeEventData]
  }
  
  extension [Self <: TextInputChangeEventData](x: Self) {
    
    inline def setEventCount(value: Double): Self = StObject.set(x, "eventCount", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
