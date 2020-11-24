package typings.reduxAsyncQueue.mod

import typings.redux.mod.Action
import typings.redux.mod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncQueueAction[T /* <: Action[_] */] extends js.Object {
  
  def callback(next: js.Function0[Unit], dispatch: Dispatch[T]): Unit = js.native
  
  var queue: String = js.native
}
object AsyncQueueAction {
  
  @scala.inline
  def apply[T /* <: Action[_] */](callback: (js.Function0[Unit], Dispatch[T]) => Unit, queue: String): AsyncQueueAction[T] = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), queue = queue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncQueueAction[T]]
  }
  
  @scala.inline
  implicit class AsyncQueueActionOps[Self <: AsyncQueueAction[_], T /* <: Action[_] */] (val x: Self with AsyncQueueAction[T]) extends AnyVal {
    
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
    def setCallback(value: (js.Function0[Unit], Dispatch[T]) => Unit): Self = this.set("callback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setQueue(value: String): Self = this.set("queue", value.asInstanceOf[js.Any])
  }
}
