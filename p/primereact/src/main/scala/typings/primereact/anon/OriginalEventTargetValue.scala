package typings.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginalEventTargetValue extends StObject {
  
  var originalEvent: typings.std.Event
  
  var target: NameValue
  
  var value: Double
}
object OriginalEventTargetValue {
  
  inline def apply(originalEvent: typings.std.Event, target: NameValue, value: Double): OriginalEventTargetValue = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalEventTargetValue]
  }
  
  extension [Self <: OriginalEventTargetValue](x: Self) {
    
    inline def setOriginalEvent(value: typings.std.Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: NameValue): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
