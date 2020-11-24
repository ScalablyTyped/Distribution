package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`exit-status`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExitStatusChannelRequest extends ChannelRequest {
  
  var code: Double = js.native
  
  var recipient: Double = js.native
  
  var request: `exit-status` = js.native
}
object ExitStatusChannelRequest {
  
  @scala.inline
  def apply(code: Double, recipient: Double, request: `exit-status`): ExitStatusChannelRequest = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExitStatusChannelRequest]
  }
  
  @scala.inline
  implicit class ExitStatusChannelRequestOps[Self <: ExitStatusChannelRequest] (val x: Self) extends AnyVal {
    
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient(value: Double): Self = this.set("recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: `exit-status`): Self = this.set("request", value.asInstanceOf[js.Any])
  }
}
