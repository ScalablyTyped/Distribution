package typings.simperium.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketEvent[T] extends SimperiumEvent {
  
  def error(err: Error, change: Change[T]): Unit = js.native
  
  def index(cv: ChangeVersion): Unit = js.native
  
  def indexing(): Unit = js.native
  
  def remove(entityId: EntityId): Unit = js.native
  
  def update(entityId: EntityId, updatedEntity: T, remoteInfo: RemoteInfo[T]): Unit = js.native
}
object BucketEvent {
  
  @scala.inline
  def apply[T](
    error: (Error, Change[T]) => Unit,
    index: ChangeVersion => Unit,
    indexing: () => Unit,
    remove: EntityId => Unit,
    update: (EntityId, T, RemoteInfo[T]) => Unit
  ): BucketEvent[T] = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction2(error), index = js.Any.fromFunction1(index), indexing = js.Any.fromFunction0(indexing), remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction3(update))
    __obj.asInstanceOf[BucketEvent[T]]
  }
  
  @scala.inline
  implicit class BucketEventOps[Self <: BucketEvent[_], T] (val x: Self with BucketEvent[T]) extends AnyVal {
    
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
    def setError(value: (Error, Change[T]) => Unit): Self = this.set("error", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIndex(value: ChangeVersion => Unit): Self = this.set("index", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIndexing(value: () => Unit): Self = this.set("indexing", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: EntityId => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: (EntityId, T, RemoteInfo[T]) => Unit): Self = this.set("update", js.Any.fromFunction3(value))
  }
}
