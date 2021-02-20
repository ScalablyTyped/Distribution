package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.exec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecChannelRequest extends ChannelRequest {
  
  var command: String = js.native
  
  var recipient: Double = js.native
  
  var request: exec = js.native
  
  var wantReply: Boolean = js.native
}
object ExecChannelRequest {
  
  @scala.inline
  def apply(command: String, recipient: Double, request: exec, wantReply: Boolean): ExecChannelRequest = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecChannelRequest]
  }
  
  @scala.inline
  implicit class ExecChannelRequestMutableBuilder[Self <: ExecChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient(value: Double): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: exec): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWantReply(value: Boolean): Self = StObject.set(x, "wantReply", value.asInstanceOf[js.Any])
  }
}
