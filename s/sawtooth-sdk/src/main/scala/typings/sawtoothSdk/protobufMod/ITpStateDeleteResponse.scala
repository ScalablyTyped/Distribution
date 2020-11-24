package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.TpStateDeleteResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITpStateDeleteResponse extends js.Object {
  
  /** TpStateDeleteResponse addresses */
  var addresses: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** TpStateDeleteResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}
object ITpStateDeleteResponse {
  
  @scala.inline
  def apply(): ITpStateDeleteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpStateDeleteResponse]
  }
  
  @scala.inline
  implicit class ITpStateDeleteResponseOps[Self <: ITpStateDeleteResponse] (val x: Self) extends AnyVal {
    
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
    def setAddressesVarargs(value: String*): Self = this.set("addresses", js.Array(value :_*))
    
    @scala.inline
    def setAddresses(value: js.Array[String]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddresses: Self = this.set("addresses", js.undefined)
    
    @scala.inline
    def setAddressesNull: Self = this.set("addresses", null)
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
  }
}
