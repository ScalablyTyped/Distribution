package typings.reactNativeReanimated.reanimated2CommonTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeEvent[T] extends StObject {
  
  var nativeEvent: T
}
object NativeEvent {
  
  inline def apply[T](nativeEvent: T): NativeEvent[T] = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeEvent[T]]
  }
  
  extension [Self <: NativeEvent[?], T](x: Self & NativeEvent[T]) {
    
    inline def setNativeEvent(value: T): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
