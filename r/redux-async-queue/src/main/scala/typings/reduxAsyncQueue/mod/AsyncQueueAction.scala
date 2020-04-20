package typings.reduxAsyncQueue.mod

import typings.redux.mod.Action
import typings.redux.mod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncQueueAction[T /* <: Action[_] */] extends js.Object {
  var queue: String
  def callback(next: js.Function0[Unit], dispatch: Dispatch[T]): Unit
}

object AsyncQueueAction {
  @scala.inline
  def apply[T /* <: Action[_] */](callback: (js.Function0[Unit], Dispatch[T]) => Unit, queue: String): AsyncQueueAction[T] = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), queue = queue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncQueueAction[T]]
  }
}

