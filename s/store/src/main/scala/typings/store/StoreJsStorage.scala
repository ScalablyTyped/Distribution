package typings.store

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreJsStorage extends js.Object {
  
  def clearAll(): Unit = js.native
  
  def each(callback: js.Function2[/* val */ String, /* key */ String, _]): Unit = js.native
  
  var name: String = js.native
  
  def read(key: String): String | Null = js.native
  
  def remove(key: String): Unit = js.native
  
  def write(key: String, data: String): Unit = js.native
}
object StoreJsStorage {
  
  @scala.inline
  def apply(
    clearAll: () => Unit,
    each: js.Function2[/* val */ String, /* key */ String, _] => Unit,
    name: String,
    read: String => String | Null,
    remove: String => Unit,
    write: (String, String) => Unit
  ): StoreJsStorage = {
    val __obj = js.Dynamic.literal(clearAll = js.Any.fromFunction0(clearAll), each = js.Any.fromFunction1(each), name = name.asInstanceOf[js.Any], read = js.Any.fromFunction1(read), remove = js.Any.fromFunction1(remove), write = js.Any.fromFunction2(write))
    __obj.asInstanceOf[StoreJsStorage]
  }
  
  @scala.inline
  implicit class StoreJsStorageOps[Self <: StoreJsStorage] (val x: Self) extends AnyVal {
    
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
    def setClearAll(value: () => Unit): Self = this.set("clearAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEach(value: js.Function2[/* val */ String, /* key */ String, _] => Unit): Self = this.set("each", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead(value: String => String | Null): Self = this.set("read", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: String => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWrite(value: (String, String) => Unit): Self = this.set("write", js.Any.fromFunction2(value))
  }
}
