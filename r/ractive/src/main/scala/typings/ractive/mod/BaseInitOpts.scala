package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseInitOpts[T /* <: Ractive[T] */]
  extends StObject
     with BaseParseOpts
     with PropertyOpts[T] {
  
  /** A map of observers */
  var observe: js.UndefOr[Registry[ObserverCallback[T] | ObserverDescriptor[T]]] = js.undefined
  
  /** A map of event listeners */
  var on: js.UndefOr[Registry[ListenerCallback[T] | ListenerDescriptor[T]]] = js.undefined
}
object BaseInitOpts {
  
  inline def apply[T /* <: Ractive[T] */](): BaseInitOpts[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseInitOpts[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseInitOpts[?], T /* <: Ractive[T] */] (val x: Self & BaseInitOpts[T]) extends AnyVal {
    
    inline def setObserve(value: Registry[ObserverCallback[T] | ObserverDescriptor[T]]): Self = StObject.set(x, "observe", value.asInstanceOf[js.Any])
    
    inline def setObserveUndefined: Self = StObject.set(x, "observe", js.undefined)
    
    inline def setOn(value: Registry[ListenerCallback[T] | ListenerDescriptor[T]]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
  }
}
