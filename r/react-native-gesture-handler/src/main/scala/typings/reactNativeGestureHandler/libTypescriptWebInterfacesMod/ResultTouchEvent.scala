package typings.reactNativeGestureHandler.libTypescriptWebInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: react-native-gesture-handler.react-native-gesture-handler/lib/typescript/web/interfaces.NativeTouchEvent | number} */ trait ResultTouchEvent extends StObject {
  
  var nativeEvent: NativeTouchEvent
  
  var timeStamp: Double
}
object ResultTouchEvent {
  
  inline def apply(nativeEvent: NativeTouchEvent, timeStamp: Double): ResultTouchEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultTouchEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResultTouchEvent] (val x: Self) extends AnyVal {
    
    inline def setNativeEvent(value: NativeTouchEvent): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
  }
}
