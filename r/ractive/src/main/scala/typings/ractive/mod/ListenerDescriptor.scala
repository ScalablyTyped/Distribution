package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerDescriptor[T /* <: Ractive[T] */] extends StObject {
  
  /**
  	 * The callback to call when the event is fired.
  	 */
  def handler(ctx: ContextHelper, args: js.Any*): Boolean | Unit | js.Promise[js.Any]
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
  
  @scala.inline
  def apply[T /* <: Ractive[T] */](handler: ListenerCallback[T]): ListenerDescriptor[T] = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerDescriptor[T]]
  }
  
  @scala.inline
  implicit class ListenerDescriptorMutableBuilder[Self <: ListenerDescriptor[?], T /* <: Ractive[T] */] (val x: Self & ListenerDescriptor[T]) extends AnyVal {
    
    @scala.inline
    def setHandler(value: ListenerCallback[T]): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
  }
}
