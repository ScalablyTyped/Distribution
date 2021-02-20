package typings.simperium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GhostStore[T] extends StObject {
  
  def eachGhost(iterator: js.Function1[/* ghost */ Ghost[T], Unit]): Unit = js.native
  
  def get(entityId: EntityId): js.Promise[Ghost[T]] = js.native
  
  def getChangeVersion(): js.Promise[ChangeVersion] = js.native
  
  def put(entityId: EntityId, version: Double, data: T): js.Promise[Ghost[T]] = js.native
  
  def remove(entityId: EntityId): js.Promise[Ghost[T]] = js.native
  
  def setChangeVersion(version: ChangeVersion): js.Promise[Unit] = js.native
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
  
  @scala.inline
  implicit class GhostStoreMutableBuilder[Self <: GhostStore[_], T] (val x: Self with GhostStore[T]) extends AnyVal {
    
    @scala.inline
    def setEachGhost(value: js.Function1[/* ghost */ Ghost[T], Unit] => Unit): Self = StObject.set(x, "eachGhost", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: EntityId => js.Promise[Ghost[T]]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetChangeVersion(value: () => js.Promise[ChangeVersion]): Self = StObject.set(x, "getChangeVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPut(value: (EntityId, Double, T) => js.Promise[Ghost[T]]): Self = StObject.set(x, "put", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRemove(value: EntityId => js.Promise[Ghost[T]]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetChangeVersion(value: ChangeVersion => js.Promise[Unit]): Self = StObject.set(x, "setChangeVersion", js.Any.fromFunction1(value))
  }
}
