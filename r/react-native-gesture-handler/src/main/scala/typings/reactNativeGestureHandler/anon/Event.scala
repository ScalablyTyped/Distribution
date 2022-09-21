package typings.reactNativeGestureHandler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  var event: String
  
  var interval: Any
  
  var pointers: js.UndefOr[Double] = js.undefined
  
  var taps: Any
  
  var time: Any
}
object Event {
  
  inline def apply(event: String, interval: Any, taps: Any, time: Any): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], taps = taps.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  extension [Self <: Event](x: Self) {
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setInterval(value: Any): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setPointers(value: Double): Self = StObject.set(x, "pointers", value.asInstanceOf[js.Any])
    
    inline def setPointersUndefined: Self = StObject.set(x, "pointers", js.undefined)
    
    inline def setTaps(value: Any): Self = StObject.set(x, "taps", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Any): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
