package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITpReceiptAddDataRequest extends js.Object {
  
  /** TpReceiptAddDataRequest contextId */
  var contextId: js.UndefOr[String | Null] = js.native
  
  /** TpReceiptAddDataRequest data */
  var data: js.UndefOr[Uint8Array | Null] = js.native
}
object ITpReceiptAddDataRequest {
  
  @scala.inline
  def apply(): ITpReceiptAddDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpReceiptAddDataRequest]
  }
  
  @scala.inline
  implicit class ITpReceiptAddDataRequestOps[Self <: ITpReceiptAddDataRequest] (val x: Self) extends AnyVal {
    
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
    def setContextId(value: String): Self = this.set("contextId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextId: Self = this.set("contextId", js.undefined)
    
    @scala.inline
    def setContextIdNull: Self = this.set("contextId", null)
    
    @scala.inline
    def setData(value: Uint8Array): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDataNull: Self = this.set("data", null)
  }
}
