package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObserverBaseDescriptor[T /* <: Ractive[T] */]
  extends StObject
     with ObserverOpts
     with ObserverDescriptor[T] {
  
  /**
  	 * The observer callback.
  	 */
  def handler(value: Any, old: Any, keypath: String, parts: String*): Unit | js.Promise[Any]
  /**
  	 * The observer callback.
  	 */
  @JSName("handler")
  var handler_Original: ObserverCallback[T]
  
  /**
  	 * Whether or not to use observeOnce when subscribing the observer. Defaults to false.
  	 */
  var once: js.UndefOr[Boolean] = js.undefined
}
object ObserverBaseDescriptor {
  
  inline def apply[T /* <: Ractive[T] */](handler: ObserverCallback[T]): ObserverBaseDescriptor[T] = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserverBaseDescriptor[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObserverBaseDescriptor[?], T /* <: Ractive[T] */] (val x: Self & ObserverBaseDescriptor[T]) extends AnyVal {
    
    inline def setHandler(value: ObserverCallback[T]): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
  }
}
