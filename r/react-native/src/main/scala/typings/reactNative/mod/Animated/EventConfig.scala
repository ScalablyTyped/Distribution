package typings.reactNative.mod.Animated

import typings.reactNative.mod.NativeSyntheticEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventConfig[T] extends StObject {
  
  var listener: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[T], Unit]] = js.undefined
  
  var useNativeDriver: Boolean
}
object EventConfig {
  
  @scala.inline
  def apply[T](useNativeDriver: Boolean): EventConfig[T] = {
    val __obj = js.Dynamic.literal(useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventConfig[T]]
  }
  
  @scala.inline
  implicit class EventConfigMutableBuilder[Self <: EventConfig[?], T] (val x: Self & EventConfig[T]) extends AnyVal {
    
    @scala.inline
    def setListener(value: /* event */ NativeSyntheticEvent[T] => Unit): Self = StObject.set(x, "listener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setListenerUndefined: Self = StObject.set(x, "listener", js.undefined)
    
    @scala.inline
    def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
  }
}
