package typings.reactNativeGestureHandler.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: react-native-gesture-handler.react-native-gesture-handler/lib/typescript/web/interfaces.NativeEvent | number} */ trait ResultEvent extends StObject {
  
  var nativeEvent: NativeEvent
  
  var timeStamp: Double
}
object ResultEvent {
  
  inline def apply(nativeEvent: NativeEvent, timeStamp: Double): ResultEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultEvent]
  }
  
  extension [Self <: ResultEvent](x: Self) {
    
    inline def setNativeEvent(value: NativeEvent): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
  }
}
