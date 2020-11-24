package typings.reduxLocalstorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageAdapter[A] extends js.Object {
  
  var `0`: A = js.native
  
  def del(key: String, callback: AdapterCallback): Unit = js.native
  
  def get(key: String, callback: AdapterCallback): Unit = js.native
  
  def put(key: String, value: js.Any, callback: AdapterCallback): Unit = js.native
}
object StorageAdapter {
  
  @scala.inline
  def apply[A](
    `0`: A,
    del: (String, AdapterCallback) => Unit,
    get: (String, AdapterCallback) => Unit,
    put: (String, js.Any, AdapterCallback) => Unit
  ): StorageAdapter[A] = {
    val __obj = js.Dynamic.literal(del = js.Any.fromFunction2(del), get = js.Any.fromFunction2(get), put = js.Any.fromFunction3(put))
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageAdapter[A]]
  }
  
  @scala.inline
  implicit class StorageAdapterOps[Self <: StorageAdapter[_], A] (val x: Self with StorageAdapter[A]) extends AnyVal {
    
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
    def set0(value: A): Self = this.set("0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDel(value: (String, AdapterCallback) => Unit): Self = this.set("del", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGet(value: (String, AdapterCallback) => Unit): Self = this.set("get", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPut(value: (String, js.Any, AdapterCallback) => Unit): Self = this.set("put", js.Any.fromFunction3(value))
  }
}
