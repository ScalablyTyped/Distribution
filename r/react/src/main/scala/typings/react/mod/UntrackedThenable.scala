package typings.react.mod

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntrackedThenable[T]
  extends StObject
     with typings.react.nextMod.reactAugmentingMod.ThenableImpl[T] {
  
  var status: js.UndefOr[Unit] = js.undefined
}
object UntrackedThenable {
  
  inline def apply[T](`then`: (js.Function1[T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]): UntrackedThenable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[UntrackedThenable[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UntrackedThenable[?], T] (val x: Self & UntrackedThenable[T]) extends AnyVal {
    
    inline def setStatus(value: Unit): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
