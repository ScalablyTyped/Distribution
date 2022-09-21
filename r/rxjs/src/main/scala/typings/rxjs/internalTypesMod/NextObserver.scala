package typings.rxjs.internalTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NextObserver[T]
  extends StObject
     with PartialObserver[T] {
  
  var closed: js.UndefOr[Boolean] = js.undefined
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var error: js.UndefOr[js.Function1[/* err */ Any, Unit]] = js.undefined
  
  def next(value: T): Unit
}
object NextObserver {
  
  inline def apply[T](next: T => Unit): NextObserver[T] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
    __obj.asInstanceOf[NextObserver[T]]
  }
  
  extension [Self <: NextObserver[?], T](x: Self & NextObserver[T]) {
    
    inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setError(value: /* err */ Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
  }
}
