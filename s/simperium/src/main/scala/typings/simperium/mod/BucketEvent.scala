package typings.simperium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketEvent[T]
  extends StObject
     with SimperiumEvent {
  
  def error(err: js.Error, change: Change[T]): Unit
  
  def index(cv: ChangeVersion): Unit
  
  def indexing(): Unit
  
  def remove(entityId: EntityId): Unit
  
  def update(entityId: EntityId, updatedEntity: T, remoteInfo: RemoteInfo[T]): Unit
}
object BucketEvent {
  
  inline def apply[T](
    error: (js.Error, Change[T]) => Unit,
    index: ChangeVersion => Unit,
    indexing: () => Unit,
    remove: EntityId => Unit,
    update: (EntityId, T, RemoteInfo[T]) => Unit
  ): BucketEvent[T] = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction2(error), index = js.Any.fromFunction1(index), indexing = js.Any.fromFunction0(indexing), remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction3(update))
    __obj.asInstanceOf[BucketEvent[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BucketEvent[?], T] (val x: Self & BucketEvent[T]) extends AnyVal {
    
    inline def setError(value: (js.Error, Change[T]) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
    
    inline def setIndex(value: ChangeVersion => Unit): Self = StObject.set(x, "index", js.Any.fromFunction1(value))
    
    inline def setIndexing(value: () => Unit): Self = StObject.set(x, "indexing", js.Any.fromFunction0(value))
    
    inline def setRemove(value: EntityId => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setUpdate(value: (EntityId, T, RemoteInfo[T]) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
  }
}
