package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`exit-status`
import org.scalablytyped.runtime.StObject
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
  implicit class ExitStatusChannelRequestMutableBuilder[Self <: ExitStatusChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient(value: Double): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: `exit-status`): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
