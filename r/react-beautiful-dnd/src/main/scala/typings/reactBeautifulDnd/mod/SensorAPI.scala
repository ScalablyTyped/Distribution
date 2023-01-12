package typings.reactBeautifulDnd.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SensorAPI extends StObject {
  
  def canGetLock(id: DraggableId): Boolean
  
  def findClosestDraggableId(event: Event): DraggableId | Null
  
  def findOptionsForDraggable(id: DraggableId): DraggableOptions | Null
  
  def isLockClaimed(): Boolean
  
  var tryGetLock: TryGetLock
  
  def tryReleaseLock(): Unit
}
object SensorAPI {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: SensorAPI] (val x: Self) extends AnyVal {
    
    inline def setCanGetLock(value: DraggableId => Boolean): Self = StObject.set(x, "canGetLock", js.Any.fromFunction1(value))
    
    inline def setFindClosestDraggableId(value: Event => DraggableId | Null): Self = StObject.set(x, "findClosestDraggableId", js.Any.fromFunction1(value))
    
    inline def setFindOptionsForDraggable(value: DraggableId => DraggableOptions | Null): Self = StObject.set(x, "findOptionsForDraggable", js.Any.fromFunction1(value))
    
    inline def setIsLockClaimed(value: () => Boolean): Self = StObject.set(x, "isLockClaimed", js.Any.fromFunction0(value))
    
    inline def setTryGetLock(
      value: (/* draggableId */ DraggableId, /* forceStop */ js.UndefOr[js.Function0[Unit]], /* options */ js.UndefOr[TryGetLockOptions]) => PreDragActions | Null
    ): Self = StObject.set(x, "tryGetLock", js.Any.fromFunction3(value))
    
    inline def setTryReleaseLock(value: () => Unit): Self = StObject.set(x, "tryReleaseLock", js.Any.fromFunction0(value))
  }
}
