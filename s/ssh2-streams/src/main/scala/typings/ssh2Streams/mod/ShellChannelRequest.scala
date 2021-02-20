package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.shell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShellChannelRequest extends ChannelRequest {
  
  var recipient: Double = js.native
  
  var request: shell = js.native
  
  var wantReply: Boolean = js.native
}
object ShellChannelRequest {
  
  @scala.inline
  def apply(recipient: Double, request: shell, wantReply: Boolean): ShellChannelRequest = {
    val __obj = js.Dynamic.literal(recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellChannelRequest]
  }
  
  @scala.inline
  implicit class ShellChannelRequestMutableBuilder[Self <: ShellChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecipient(value: Double): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: shell): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWantReply(value: Boolean): Self = StObject.set(x, "wantReply", value.asInstanceOf[js.Any])
  }
}
