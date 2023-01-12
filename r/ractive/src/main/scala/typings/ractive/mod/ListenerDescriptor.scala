package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerDescriptor[T /* <: Ractive[T] */] extends StObject {
  
  /**
  	 * The callback to call when the event is fired.
  	 */
  def handler(ctx: ListenerContextHelper, args: Any*): Boolean | Unit | js.Promise[Any]
  /**
  	 * The callback to call when the event is fired.
  	 */
  @JSName("handler")
  var handler_Original: ListenerCallback[T]
  
  /**
  	 * Whether or not to immediately cancel the listener after the first firing.
  	 */
  var once: js.UndefOr[Boolean] = js.undefined
}
object ListenerDescriptor {
  
  inline def apply[T /* <: Ractive[T] */](handler: ListenerCallback[T]): ListenerDescriptor[T] = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerDescriptor[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListenerDescriptor[?], T /* <: Ractive[T] */] (val x: Self & ListenerDescriptor[T]) extends AnyVal {
    
    inline def setHandler(value: ListenerCallback[T]): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
  }
}
