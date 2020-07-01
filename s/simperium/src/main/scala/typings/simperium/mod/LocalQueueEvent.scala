package typings.simperium.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalQueueEvent[T] extends SimperiumEvent {
  def queued(id: EntityId, change: Change[T], queue: js.Array[LocalQueuedChange[T]]): Unit
  def send(change: Change[T]): Unit
  def wait(id: EntityId): Unit
}

object LocalQueueEvent {
  @scala.inline
  def apply[T](
    queued: (EntityId, Change[T], js.Array[LocalQueuedChange[T]]) => Unit,
    send: Change[T] => Unit,
    wait: EntityId => Unit,
    StringDictionary: StringDictionary[js.Function1[/* repeated */ js.Any, Unit]] = null
  ): LocalQueueEvent[T] = {
    val __obj = js.Dynamic.literal(queued = js.Any.fromFunction3(queued), send = js.Any.fromFunction1(send), wait = js.Any.fromFunction1(wait))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[LocalQueueEvent[T]]
  }
}

