package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.Message.MessageType
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMessage extends js.Object {
  
  /** Message content */
  var content: js.UndefOr[Uint8Array | Null] = js.native
  
  /** Message correlationId */
  var correlationId: js.UndefOr[String | Null] = js.native
  
  /** Message messageType */
  var messageType: js.UndefOr[MessageType | Null] = js.native
}
object IMessage {
  
  @scala.inline
  def apply(): IMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMessage]
  }
  
  @scala.inline
  implicit class IMessageOps[Self <: IMessage] (val x: Self) extends AnyVal {
    
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
    def setContent(value: Uint8Array): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setContentNull: Self = this.set("content", null)
    
    @scala.inline
    def setCorrelationId(value: String): Self = this.set("correlationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorrelationId: Self = this.set("correlationId", js.undefined)
    
    @scala.inline
    def setCorrelationIdNull: Self = this.set("correlationId", null)
    
    @scala.inline
    def setMessageType(value: MessageType): Self = this.set("messageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageType: Self = this.set("messageType", js.undefined)
    
    @scala.inline
    def setMessageTypeNull: Self = this.set("messageType", null)
  }
}
