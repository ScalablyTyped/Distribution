package typings.react.mod

import typings.react.reactStrings.pending
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PendingThenable[T]
  extends StObject
     with typings.react.experimentalMod.reactAugmentingMod.ThenableImpl[T] {
  
  var status: pending
}
object PendingThenable {
  
  inline def apply[T](`then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]): PendingThenable[T] = {
    val __obj = js.Dynamic.literal(status = "pending")
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[PendingThenable[T]]
  }
  
  extension [Self <: PendingThenable[?], T](x: Self & PendingThenable[T]) {
    
    inline def setStatus(value: pending): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
