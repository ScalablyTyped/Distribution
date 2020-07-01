package typings.simperium.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelEvent[T] extends SimperiumEvent {
  def acknowledge(entityId: EntityId, change: Change[T]): Unit
  def indexingStateChange(isIndexing: Boolean): Unit
  def ready(): Unit
  def send(message: String): Unit
  def update(entityId: EntityId, updatedEntity: T): Unit
  def version(entityId: EntityId, version: Double, entity: T): Unit
}

object ChannelEvent {
  @scala.inline
  def apply[T](
    acknowledge: (EntityId, Change[T]) => Unit,
    indexingStateChange: Boolean => Unit,
    ready: () => Unit,
    send: String => Unit,
    update: (EntityId, T) => Unit,
    version: (EntityId, Double, T) => Unit,
    StringDictionary: StringDictionary[js.Function1[/* repeated */ js.Any, Unit]] = null
  ): ChannelEvent[T] = {
    val __obj = js.Dynamic.literal(acknowledge = js.Any.fromFunction2(acknowledge), indexingStateChange = js.Any.fromFunction1(indexingStateChange), ready = js.Any.fromFunction0(ready), send = js.Any.fromFunction1(send), update = js.Any.fromFunction2(update), version = js.Any.fromFunction3(version))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ChannelEvent[T]]
  }
}

