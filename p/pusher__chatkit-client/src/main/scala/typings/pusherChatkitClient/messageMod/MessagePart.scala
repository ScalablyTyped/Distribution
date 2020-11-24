package typings.pusherChatkitClient.messageMod

import typings.pusherChatkitClient.pusherChatkitClientStrings.`inline`
import typings.pusherChatkitClient.pusherChatkitClientStrings.attachment
import typings.pusherChatkitClient.pusherChatkitClientStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagePart extends js.Object {
  
  var partType: `inline` | url | attachment = js.native
  
  var payload: MessagePayload = js.native
}
object MessagePart {
  
  @scala.inline
  def apply(partType: `inline` | url | attachment, payload: MessagePayload): MessagePart = {
    val __obj = js.Dynamic.literal(partType = partType.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePart]
  }
  
  @scala.inline
  implicit class MessagePartOps[Self <: MessagePart] (val x: Self) extends AnyVal {
    
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
    def setPartType(value: `inline` | url | attachment): Self = this.set("partType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: MessagePayload): Self = this.set("payload", value.asInstanceOf[js.Any])
  }
}
