package typings.reactAsync.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<react-async.react-async.AbstractState<T>, 'run' | 'reload' | 'cancel' | 'setData' | 'setError'> */
trait ReducerBaseState[T] extends js.Object {
  var counter: Double
  var initialValue: js.UndefOr[T | Error] = js.undefined
  var promise: js.Promise[T]
}

object ReducerBaseState {
  @scala.inline
  def apply[T](counter: Double, promise: js.Promise[T], initialValue: T | Error = null): ReducerBaseState[T] = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any])
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReducerBaseState[T]]
  }
}

