package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`exit-signal`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExitSignalChannelRequest extends ChannelRequest {
  
  var coredump: Boolean = js.native
  
  var description: String = js.native
  
  var recipient: Double = js.native
  
  var request: `exit-signal` = js.native
  
  var signal: String = js.native
}
object ExitSignalChannelRequest {
  
  @scala.inline
  def apply(coredump: Boolean, description: String, recipient: Double, request: `exit-signal`, signal: String): ExitSignalChannelRequest = {
    val __obj = js.Dynamic.literal(coredump = coredump.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExitSignalChannelRequest]
  }
  
  @scala.inline
  implicit class ExitSignalChannelRequestOps[Self <: ExitSignalChannelRequest] (val x: Self) extends AnyVal {
    
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
    def setCoredump(value: Boolean): Self = this.set("coredump", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient(value: Double): Self = this.set("recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: `exit-signal`): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignal(value: String): Self = this.set("signal", value.asInstanceOf[js.Any])
  }
}
