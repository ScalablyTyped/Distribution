package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.env
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvChannelRequest extends ChannelRequest {
  
  var key: String = js.native
  
  var recipient: Double = js.native
  
  var request: env = js.native
  
  var `val`: String = js.native
  
  var wantReply: Boolean = js.native
}
object EnvChannelRequest {
  
  @scala.inline
  def apply(key: String, recipient: Double, request: env, `val`: String, wantReply: Boolean): EnvChannelRequest = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvChannelRequest]
  }
  
  @scala.inline
  implicit class EnvChannelRequestOps[Self <: EnvChannelRequest] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient(value: Double): Self = this.set("recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: env): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVal(value: String): Self = this.set("val", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWantReply(value: Boolean): Self = this.set("wantReply", value.asInstanceOf[js.Any])
  }
}
