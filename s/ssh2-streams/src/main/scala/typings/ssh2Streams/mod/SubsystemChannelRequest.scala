package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.subsystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubsystemChannelRequest extends ChannelRequest {
  
  var recipient: Double = js.native
  
  var request: subsystem = js.native
  
  var subsystem: String = js.native
  
  var wantReply: Boolean = js.native
}
object SubsystemChannelRequest {
  
  @scala.inline
  def apply(recipient: Double, request: subsystem, subsystem: String, wantReply: Boolean): SubsystemChannelRequest = {
    val __obj = js.Dynamic.literal(recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], subsystem = subsystem.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubsystemChannelRequest]
  }
  
  @scala.inline
  implicit class SubsystemChannelRequestOps[Self <: SubsystemChannelRequest] (val x: Self) extends AnyVal {
    
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
    def setRecipient(value: Double): Self = this.set("recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: subsystem): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubsystem(value: String): Self = this.set("subsystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWantReply(value: Boolean): Self = this.set("wantReply", value.asInstanceOf[js.Any])
  }
}
