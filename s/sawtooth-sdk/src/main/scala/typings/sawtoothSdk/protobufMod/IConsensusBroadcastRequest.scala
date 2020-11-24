package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConsensusBroadcastRequest extends js.Object {
  
  /** ConsensusBroadcastRequest message */
  var message: js.UndefOr[IConsensusPeerMessage | Null] = js.native
}
object IConsensusBroadcastRequest {
  
  @scala.inline
  def apply(): IConsensusBroadcastRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusBroadcastRequest]
  }
  
  @scala.inline
  implicit class IConsensusBroadcastRequestOps[Self <: IConsensusBroadcastRequest] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: IConsensusPeerMessage): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setMessageNull: Self = this.set("message", null)
  }
}
