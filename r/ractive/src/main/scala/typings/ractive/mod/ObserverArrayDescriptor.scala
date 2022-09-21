package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObserverArrayDescriptor[T /* <: Ractive[T] */]
  extends StObject
     with ObserverArrayOpts
     with ObserverDescriptor[T] {
  
  /**
  	 * The observer callback.j
  	 */
  def handler(changes: ArrayChanges): Unit | js.Promise[Any]
  /**
  	 * The observer callback.j
  	 */
  @JSName("handler")
  var handler_Original: ObserverArrayCallback[T]
  
  /**
  	 * Whether or not to use observeOnce when subscribing the observer. Defaults to false.
  	 */
  var once: js.UndefOr[Boolean] = js.undefined
}
object ObserverArrayDescriptor {
  
  inline def apply[T /* <: Ractive[T] */](array: Boolean, handler: ObserverArrayCallback[T]): ObserverArrayDescriptor[T] = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserverArrayDescriptor[T]]
  }
  
  extension [Self <: ObserverArrayDescriptor[?], T /* <: Ractive[T] */](x: Self & ObserverArrayDescriptor[T]) {
    
    inline def setHandler(value: ObserverArrayCallback[T]): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
  }
}
