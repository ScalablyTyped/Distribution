package typings.simperium.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketStore[T, Q] extends js.Object {
  
  def find(query: Q, callback: EntitiesCallback[BucketObject[T], Error | Null]): Unit = js.native
  
  def get(entityId: EntityId, callback: EntityCallback[BucketObject[T], Error | Null]): Unit = js.native
  
  def remove(entityId: EntityId, callback: js.Function0[Unit]): Unit = js.native
  
  def update(
    entityId: EntityId,
    entity: T,
    isIndexing: Boolean,
    callback: EntityCallback[BucketObject[T], Error | Null]
  ): Unit = js.native
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
  implicit class BucketStoreOps[Self <: BucketStore[_, _], T, Q] (val x: Self with (BucketStore[T, Q])) extends AnyVal {
    
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
    def setFind(value: (Q, EntitiesCallback[BucketObject[T], Error | Null]) => Unit): Self = this.set("find", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGet(value: (EntityId, EntityCallback[BucketObject[T], Error | Null]) => Unit): Self = this.set("get", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemove(value: (EntityId, js.Function0[Unit]) => Unit): Self = this.set("remove", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdate(value: (EntityId, T, Boolean, EntityCallback[BucketObject[T], Error | Null]) => Unit): Self = this.set("update", js.Any.fromFunction4(value))
  }
}
