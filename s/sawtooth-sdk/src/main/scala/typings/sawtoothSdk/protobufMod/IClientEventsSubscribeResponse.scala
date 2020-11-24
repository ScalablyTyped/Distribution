package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientEventsSubscribeResponse.Status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientEventsSubscribeResponse extends js.Object {
  
  /** ClientEventsSubscribeResponse responseMessage */
  var responseMessage: js.UndefOr[String | Null] = js.native
  
  /** ClientEventsSubscribeResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}
object IClientEventsSubscribeResponse {
  
  @scala.inline
  def apply(): IClientEventsSubscribeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientEventsSubscribeResponse]
  }
  
  @scala.inline
  implicit class IClientEventsSubscribeResponseOps[Self <: IClientEventsSubscribeResponse] (val x: Self) extends AnyVal {
    
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
    def setResponseMessage(value: String): Self = this.set("responseMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseMessage: Self = this.set("responseMessage", js.undefined)
    
    @scala.inline
    def setResponseMessageNull: Self = this.set("responseMessage", null)
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
  }
}
