package typings.simperium.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketStore[T, Q] extends StObject {
  
  def find(query: Q, callback: EntitiesCallback[BucketObject[T], Error | Null]): Unit
  
  def get(entityId: EntityId, callback: EntityCallback[BucketObject[T], Error | Null]): Unit
  
  def remove(entityId: EntityId, callback: js.Function0[Unit]): Unit
  
  def update(
    entityId: EntityId,
    entity: T,
    isIndexing: Boolean,
    callback: EntityCallback[BucketObject[T], Error | Null]
  ): Unit
}
object BucketStore {
  
  @scala.inline
  def apply[T, Q](
    find: (Q, EntitiesCallback[BucketObject[T], Error | Null]) => Unit,
    get: (EntityId, EntityCallback[BucketObject[T], Error | Null]) => Unit,
    remove: (EntityId, js.Function0[Unit]) => Unit,
    update: (EntityId, T, Boolean, EntityCallback[BucketObject[T], Error | Null]) => Unit
  ): BucketStore[T, Q] = {
    val __obj = js.Dynamic.literal(find = js.Any.fromFunction2(find), get = js.Any.fromFunction2(get), remove = js.Any.fromFunction2(remove), update = js.Any.fromFunction4(update))
    __obj.asInstanceOf[BucketStore[T, Q]]
  }
  
  @scala.inline
  implicit class BucketStoreMutableBuilder[Self <: BucketStore[?, ?], T, Q] (val x: Self & (BucketStore[T, Q])) extends AnyVal {
    
    @scala.inline
    def setFind(value: (Q, EntitiesCallback[BucketObject[T], Error | Null]) => Unit): Self = StObject.set(x, "find", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGet(value: (EntityId, EntityCallback[BucketObject[T], Error | Null]) => Unit): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemove(value: (EntityId, js.Function0[Unit]) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdate(value: (EntityId, T, Boolean, EntityCallback[BucketObject[T], Error | Null]) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction4(value))
  }
}
