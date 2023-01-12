package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.signal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignalChannelRequest
  extends StObject
     with ChannelRequest {
  
  var recipient: Double
  
  var request: signal
  
  var signal: String
}
object SignalChannelRequest {
  
  inline def apply(recipient: Double, signal: String): SignalChannelRequest = {
    val __obj = js.Dynamic.literal(recipient = recipient.asInstanceOf[js.Any], request = "signal", signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalChannelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignalChannelRequest] (val x: Self) extends AnyVal {
    
    inline def setRecipient(value: Double): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: signal): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
  }
}
