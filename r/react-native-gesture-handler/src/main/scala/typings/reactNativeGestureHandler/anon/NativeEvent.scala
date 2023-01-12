package typings.reactNativeGestureHandler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeEvent extends StObject {
  
  var nativeEvent: HandlerTag
  
  var timeStamp: Double
}
object NativeEvent {
  
  inline def apply(nativeEvent: HandlerTag, timeStamp: Double): NativeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NativeEvent] (val x: Self) extends AnyVal {
    
    inline def setNativeEvent(value: HandlerTag): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
  }
}
