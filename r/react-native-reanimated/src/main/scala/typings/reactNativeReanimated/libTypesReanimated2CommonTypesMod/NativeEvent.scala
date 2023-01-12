package typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NativeEvent[?], T] (val x: Self & NativeEvent[T]) extends AnyVal {
    
    inline def setNativeEvent(value: T): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
