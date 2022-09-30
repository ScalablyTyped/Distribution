package typings.react.mod

import typings.react.reactStrings.rejected
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectedThenable[T]
  extends StObject
     with typings.react.experimentalMod.reactAugmentingMod.ThenableImpl[T] {
  
  var reason: Any
  
  var status: rejected
}
object RejectedThenable {
  
  inline def apply[T](
    reason: Any,
    `then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]
  ): RejectedThenable[T] = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = "rejected")
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[RejectedThenable[T]]
  }
  
  extension [Self <: RejectedThenable[?], T](x: Self & RejectedThenable[T]) {
    
    inline def setReason(value: Any): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: rejected): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
