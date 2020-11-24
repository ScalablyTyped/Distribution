package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageEventInit extends EventInit {
  
  var key: js.UndefOr[java.lang.String | Null] = js.native
  
  var newValue: js.UndefOr[java.lang.String | Null] = js.native
  
  var oldValue: js.UndefOr[java.lang.String | Null] = js.native
  
  var storageArea: js.UndefOr[Storage | Null] = js.native
  
  var url: js.UndefOr[java.lang.String] = js.native
}
object StorageEventInit {
  
  @scala.inline
  def apply(): StorageEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageEventInit]
  }
  
  @scala.inline
  implicit class StorageEventInitOps[Self <: StorageEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKey(value: java.lang.String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setKeyNull: Self = this.set("key", null)
    
    @scala.inline
    def setNewValue(value: java.lang.String): Self = this.set("newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewValue: Self = this.set("newValue", js.undefined)
    
    @scala.inline
    def setNewValueNull: Self = this.set("newValue", null)
    
    @scala.inline
    def setOldValue(value: java.lang.String): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldValue: Self = this.set("oldValue", js.undefined)
    
    @scala.inline
    def setOldValueNull: Self = this.set("oldValue", null)
    
    @scala.inline
    def setStorageArea(value: Storage): Self = this.set("storageArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageArea: Self = this.set("storageArea", js.undefined)
    
    @scala.inline
    def setStorageAreaNull: Self = this.set("storageArea", null)
    
    @scala.inline
    def setUrl(value: java.lang.String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
