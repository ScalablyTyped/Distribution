package typings.simperium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GhostStore[T] extends js.Object {
  def eachGhost(iterator: js.Function1[/* ghost */ Ghost[T], Unit]): Unit
  def get(entityId: EntityId): js.Promise[Ghost[T]]
  def getChangeVersion(): js.Promise[ChangeVersion]
  def put(entityId: EntityId, version: Double, data: T): js.Promise[Ghost[T]]
  def remove(entityId: EntityId): js.Promise[Ghost[T]]
  def setChangeVersion(version: ChangeVersion): js.Promise[Unit]
}

object GhostStore {
  @scala.inline
  def apply[T](
    eachGhost: js.Function1[/* ghost */ Ghost[T], Unit] => Unit,
    get: EntityId => js.Promise[Ghost[T]],
    getChangeVersion: () => js.Promise[ChangeVersion],
    put: (EntityId, Double, T) => js.Promise[Ghost[T]],
    remove: EntityId => js.Promise[Ghost[T]],
    setChangeVersion: ChangeVersion => js.Promise[Unit]
  ): GhostStore[T] = {
    val __obj = js.Dynamic.literal(eachGhost = js.Any.fromFunction1(eachGhost), get = js.Any.fromFunction1(get), getChangeVersion = js.Any.fromFunction0(getChangeVersion), put = js.Any.fromFunction3(put), remove = js.Any.fromFunction1(remove), setChangeVersion = js.Any.fromFunction1(setChangeVersion))
    __obj.asInstanceOf[GhostStore[T]]
  }
}

