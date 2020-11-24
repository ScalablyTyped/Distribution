package typings.simperium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GhostStore[T] extends js.Object {
  
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
  implicit class GhostStoreOps[Self <: GhostStore[_], T] (val x: Self with GhostStore[T]) extends AnyVal {
    
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
    def setEachGhost(value: js.Function1[/* ghost */ Ghost[T], Unit] => Unit): Self = this.set("eachGhost", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: EntityId => js.Promise[Ghost[T]]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetChangeVersion(value: () => js.Promise[ChangeVersion]): Self = this.set("getChangeVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPut(value: (EntityId, Double, T) => js.Promise[Ghost[T]]): Self = this.set("put", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRemove(value: EntityId => js.Promise[Ghost[T]]): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetChangeVersion(value: ChangeVersion => js.Promise[Unit]): Self = this.set("setChangeVersion", js.Any.fromFunction1(value))
  }
}
