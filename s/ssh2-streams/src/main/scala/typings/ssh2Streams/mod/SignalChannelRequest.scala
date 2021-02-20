package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.signal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignalChannelRequest extends ChannelRequest {
  
  var recipient: Double = js.native
  
  var request: signal = js.native
  
  var signal: String = js.native
}
object SignalChannelRequest {
  
  @scala.inline
  def apply(recipient: Double, request: signal, signal: String): SignalChannelRequest = {
    val __obj = js.Dynamic.literal(recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalChannelRequest]
  }
  
  @scala.inline
  implicit class SignalChannelRequestMutableBuilder[Self <: SignalChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecipient(value: Double): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: signal): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
  }
}
