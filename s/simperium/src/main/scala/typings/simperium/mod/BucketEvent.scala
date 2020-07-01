package typings.simperium.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketEvent[T] extends SimperiumEvent {
  def error(err: Error, change: Change[T]): Unit
  def index(cv: ChangeVersion): Unit
  def indexing(): Unit
  def remove(entityId: EntityId): Unit
  def update(entityId: EntityId, updatedEntity: T, remoteInfo: RemoteInfo[T]): Unit
}

object BucketEvent {
  @scala.inline
  def apply[T](
    error: (Error, Change[T]) => Unit,
    index: ChangeVersion => Unit,
    indexing: () => Unit,
    remove: EntityId => Unit,
    update: (EntityId, T, RemoteInfo[T]) => Unit,
    StringDictionary: StringDictionary[js.Function1[/* repeated */ js.Any, Unit]] = null
  ): BucketEvent[T] = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction2(error), index = js.Any.fromFunction1(index), indexing = js.Any.fromFunction0(indexing), remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction3(update))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[BucketEvent[T]]
  }
}

