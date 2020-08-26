package typings.reactBeautifulDnd.mod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SensorAPI extends js.Object {
  var tryGetLock: TryGetLock = js.native
  def canGetLock(id: DraggableId): Boolean = js.native
  def findClosestDraggableId(event: Event): DraggableId | Null = js.native
  def findOptionsForDraggable(id: DraggableId): DraggableOptions | Null = js.native
  def isLockClaimed(): Boolean = js.native
  def tryReleaseLock(): Unit = js.native
}

object SensorAPI {
  @scala.inline
  def apply(
    canGetLock: DraggableId => Boolean,
    findClosestDraggableId: Event => DraggableId | Null,
    findOptionsForDraggable: DraggableId => DraggableOptions | Null,
    isLockClaimed: () => Boolean,
    tryGetLock: (/* draggableId */ DraggableId, /* forceStop */ js.UndefOr[js.Function0[Unit]], /* options */ js.UndefOr[TryGetLockOptions]) => PreDragActions | Null,
    tryReleaseLock: () => Unit
  ): SensorAPI = {
    val __obj = js.Dynamic.literal(canGetLock = js.Any.fromFunction1(canGetLock), findClosestDraggableId = js.Any.fromFunction1(findClosestDraggableId), findOptionsForDraggable = js.Any.fromFunction1(findOptionsForDraggable), isLockClaimed = js.Any.fromFunction0(isLockClaimed), tryGetLock = js.Any.fromFunction3(tryGetLock), tryReleaseLock = js.Any.fromFunction0(tryReleaseLock))
    __obj.asInstanceOf[SensorAPI]
  }
  @scala.inline
  implicit class SensorAPIOps[Self <: SensorAPI] (val x: Self) extends AnyVal {
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
    def setCanGetLock(value: DraggableId => Boolean): Self = this.set("canGetLock", js.Any.fromFunction1(value))
    @scala.inline
    def setFindClosestDraggableId(value: Event => DraggableId | Null): Self = this.set("findClosestDraggableId", js.Any.fromFunction1(value))
    @scala.inline
    def setFindOptionsForDraggable(value: DraggableId => DraggableOptions | Null): Self = this.set("findOptionsForDraggable", js.Any.fromFunction1(value))
    @scala.inline
    def setIsLockClaimed(value: () => Boolean): Self = this.set("isLockClaimed", js.Any.fromFunction0(value))
    @scala.inline
    def setTryGetLock(
      value: (/* draggableId */ DraggableId, /* forceStop */ js.UndefOr[js.Function0[Unit]], /* options */ js.UndefOr[TryGetLockOptions]) => PreDragActions | Null
    ): Self = this.set("tryGetLock", js.Any.fromFunction3(value))
    @scala.inline
    def setTryReleaseLock(value: () => Unit): Self = this.set("tryReleaseLock", js.Any.fromFunction0(value))
  }
  
}

