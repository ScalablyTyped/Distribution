package typings.reactBeautifulDnd.mod

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SensorAPI extends js.Object {
  var tryGetLock: TryGetLock
  def canGetLock(id: DraggableId): Boolean
  def findClosestDraggableId(event: Event_): DraggableId | Null
  def findOptionsForDraggable(id: DraggableId): DraggableOptions | Null
  def isLockClaimed(): Boolean
  def tryReleaseLock(): Unit
}

object SensorAPI {
  @scala.inline
  def apply(
    canGetLock: DraggableId => Boolean,
    findClosestDraggableId: Event_ => DraggableId | Null,
    findOptionsForDraggable: DraggableId => DraggableOptions | Null,
    isLockClaimed: () => Boolean,
    tryGetLock: (/* draggableId */ DraggableId, /* forceStop */ js.UndefOr[js.Function0[Unit]], /* options */ js.UndefOr[TryGetLockOptions]) => PreDragActions | Null,
    tryReleaseLock: () => Unit
  ): SensorAPI = {
    val __obj = js.Dynamic.literal(canGetLock = js.Any.fromFunction1(canGetLock), findClosestDraggableId = js.Any.fromFunction1(findClosestDraggableId), findOptionsForDraggable = js.Any.fromFunction1(findOptionsForDraggable), isLockClaimed = js.Any.fromFunction0(isLockClaimed), tryGetLock = js.Any.fromFunction3(tryGetLock), tryReleaseLock = js.Any.fromFunction0(tryReleaseLock))
    __obj.asInstanceOf[SensorAPI]
  }
}

