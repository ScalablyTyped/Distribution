package typings.react.mod

import typings.react.reactStrings.fulfilled
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FulfilledThenable[T]
  extends StObject
     with typings.react.nextMod.reactAugmentingMod.ThenableImpl[T] {
  
  var status: fulfilled
  
  var value: T
}
object FulfilledThenable {
  
  inline def apply[T](
    `then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any],
    value: T
  ): FulfilledThenable[T] = {
    val __obj = js.Dynamic.literal(status = "fulfilled", value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[FulfilledThenable[T]]
  }
  
  extension [Self <: FulfilledThenable[?], T](x: Self & FulfilledThenable[T]) {
    
    inline def setStatus(value: fulfilled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
