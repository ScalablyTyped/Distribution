package typings.simperium.mod

import org.scalablytyped.runtime.StObject
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
    wait_ : EntityId => Unit
  ): LocalQueueEvent[T] = {
    val __obj = js.Dynamic.literal(queued = js.Any.fromFunction3(queued), send = js.Any.fromFunction1(send))
    __obj.updateDynamic("wait")(js.Any.fromFunction1(wait_))
    __obj.asInstanceOf[LocalQueueEvent[T]]
  }
  
  @scala.inline
  implicit class LocalQueueEventMutableBuilder[Self <: LocalQueueEvent[_], T] (val x: Self with LocalQueueEvent[T]) extends AnyVal {
    
    @scala.inline
    def setQueued(value: (EntityId, Change[T], js.Array[LocalQueuedChange[T]]) => Unit): Self = StObject.set(x, "queued", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSend(value: Change[T] => Unit): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWait_(value: EntityId => Unit): Self = StObject.set(x, "wait", js.Any.fromFunction1(value))
  }
}
