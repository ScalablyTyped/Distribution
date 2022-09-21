package typings.reactAsync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<react-async.react-async.AbstractState<T>, 'run' | 'reload' | 'cancel' | 'setData' | 'setError'> */
trait ReducerBaseState[T] extends StObject {
  
  var counter: Double
  
  var initialValue: js.UndefOr[T | js.Error] = js.undefined
  
  var promise: js.Promise[T]
}
object ReducerBaseState {
  
  inline def apply[T](counter: Double, promise: js.Promise[T]): ReducerBaseState[T] = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReducerBaseState[T]]
  }
  
  extension [Self <: ReducerBaseState[?], T](x: Self & ReducerBaseState[T]) {
    
    inline def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    inline def setInitialValue(value: T | js.Error): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
    
    inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
    
    inline def setPromise(value: js.Promise[T]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
  }
}
