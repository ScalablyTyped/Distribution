package typings.simperium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalQueueEvent[T] extends SimperiumEvent {
  
  def queued(id: EntityId, change: Change[T], queue: js.Array[LocalQueuedChange[T]]): Unit = js.native
  
  def send(change: Change[T]): Unit = js.native
  
  def wait(id: EntityId): Unit = js.native
}
object LocalQueueEvent {
  
  @scala.inline
  def apply[T](
    queued: (EntityId, Change[T], js.Array[LocalQueuedChange[T]]) => Unit,
    send: Change[T] => Unit,
    wait: EntityId => Unit
  ): LocalQueueEvent[T] = {
    val __obj = js.Dynamic.literal(queued = js.Any.fromFunction3(queued), send = js.Any.fromFunction1(send), wait = js.Any.fromFunction1(wait))
    __obj.asInstanceOf[LocalQueueEvent[T]]
  }
  
  @scala.inline
  implicit class LocalQueueEventOps[Self <: LocalQueueEvent[_], T] (val x: Self with LocalQueueEvent[T]) extends AnyVal {
    
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
    def setQueued(value: (EntityId, Change[T], js.Array[LocalQueuedChange[T]]) => Unit): Self = this.set("queued", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSend(value: Change[T] => Unit): Self = this.set("send", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWait(value: EntityId => Unit): Self = this.set("wait", js.Any.fromFunction1(value))
  }
}
