package typings.simperium.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
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
  implicit class BucketEventMutableBuilder[Self <: BucketEvent[_], T] (val x: Self with BucketEvent[T]) extends AnyVal {
    
    @scala.inline
    def setError(value: (Error, Change[T]) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIndex(value: ChangeVersion => Unit): Self = StObject.set(x, "index", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIndexing(value: () => Unit): Self = StObject.set(x, "indexing", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: EntityId => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: (EntityId, T, RemoteInfo[T]) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
  }
}
