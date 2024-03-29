package typings.reactNativeWindows.rntypesMod.Animated

import typings.reactNativeWindows.rntypesMod.NativeSyntheticEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventConfig[T] extends StObject {
  
  var listener: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[T], Unit]] = js.undefined
  
  var useNativeDriver: Boolean
}
object EventConfig {
  
  inline def apply[T](useNativeDriver: Boolean): EventConfig[T] = {
    val __obj = js.Dynamic.literal(useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventConfig[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventConfig[?], T] (val x: Self & EventConfig[T]) extends AnyVal {
    
    inline def setListener(value: /* event */ NativeSyntheticEvent[T] => Unit): Self = StObject.set(x, "listener", js.Any.fromFunction1(value))
    
    inline def setListenerUndefined: Self = StObject.set(x, "listener", js.undefined)
    
    inline def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
  }
}
