package typings.reactAsync.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<react-async.react-async.AbstractState<T>, 'run' | 'reload' | 'cancel' | 'setData' | 'setError'> */
@js.native
trait ReducerBaseState[T] extends js.Object {
  
  var counter: Double = js.native
  
  var initialValue: js.UndefOr[T | Error] = js.native
  
  var promise: js.Promise[T] = js.native
}
object ReducerBaseState {
  
  @scala.inline
  def apply[T](counter: Double, promise: js.Promise[T]): ReducerBaseState[T] = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReducerBaseState[T]]
  }
  
  @scala.inline
  implicit class ReducerBaseStateOps[Self <: ReducerBaseState[_], T] (val x: Self with ReducerBaseState[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCounter(value: Double): Self = this.set("counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromise(value: js.Promise[T]): Self = this.set("promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialValue(value: T | Error): Self = this.set("initialValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialValue: Self = this.set("initialValue", js.undefined)
  }
}
