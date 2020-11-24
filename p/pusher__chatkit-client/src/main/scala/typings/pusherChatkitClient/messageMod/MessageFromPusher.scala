package typings.pusherChatkitClient.messageMod

import typings.pusherChatkitClient.userMod.PusherUser
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageFromPusher extends js.Object {
  
  var createdAt: Date = js.native
  
  var id: String = js.native
  
  var parts: js.Array[MessagePart] = js.native
  
  var sender: PusherUser = js.native
}
object MessageFromPusher {
  
  @scala.inline
  def apply(createdAt: Date, id: String, parts: js.Array[MessagePart], sender: PusherUser): MessageFromPusher = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageFromPusher]
  }
  
  @scala.inline
  implicit class MessageFromPusherOps[Self <: MessageFromPusher] (val x: Self) extends AnyVal {
    
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
    def setCreatedAt(value: Date): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartsVarargs(value: MessagePart*): Self = this.set("parts", js.Array(value :_*))
    
    @scala.inline
    def setParts(value: js.Array[MessagePart]): Self = this.set("parts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: PusherUser): Self = this.set("sender", value.asInstanceOf[js.Any])
  }
}
