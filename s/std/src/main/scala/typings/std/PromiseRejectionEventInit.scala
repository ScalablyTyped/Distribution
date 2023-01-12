package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromiseRejectionEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var promise: js.Promise[Any]
  
  /* standard dom */
  var reason: js.UndefOr[Any] = js.undefined
}
object PromiseRejectionEventInit {
  
  inline def apply(promise: js.Promise[Any]): PromiseRejectionEventInit = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseRejectionEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PromiseRejectionEventInit] (val x: Self) extends AnyVal {
    
    inline def setPromise(value: js.Promise[Any]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    inline def setReason(value: Any): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
