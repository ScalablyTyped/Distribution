package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.TpProcessResponse.Status
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITpProcessResponse extends js.Object {
  
  /** TpProcessResponse extendedData */
  var extendedData: js.UndefOr[Uint8Array | Null] = js.native
  
  /** TpProcessResponse message */
  var message: js.UndefOr[String | Null] = js.native
  
  /** TpProcessResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}
object ITpProcessResponse {
  
  @scala.inline
  def apply(): ITpProcessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITpProcessResponse]
  }
  
  @scala.inline
  implicit class ITpProcessResponseOps[Self <: ITpProcessResponse] (val x: Self) extends AnyVal {
    
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
    def setExtendedData(value: Uint8Array): Self = this.set("extendedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtendedData: Self = this.set("extendedData", js.undefined)
    
    @scala.inline
    def setExtendedDataNull: Self = this.set("extendedData", null)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setMessageNull: Self = this.set("message", null)
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
  }
}
