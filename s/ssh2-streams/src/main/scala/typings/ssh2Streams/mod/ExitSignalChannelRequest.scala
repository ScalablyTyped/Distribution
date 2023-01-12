package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`exit-signal`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExitSignalChannelRequest
  extends StObject
     with ChannelRequest {
  
  var coredump: Boolean
  
  var description: String
  
  var recipient: Double
  
  var request: `exit-signal`
  
  var signal: String
}
object ExitSignalChannelRequest {
  
  inline def apply(coredump: Boolean, description: String, recipient: Double, signal: String): ExitSignalChannelRequest = {
    val __obj = js.Dynamic.literal(coredump = coredump.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = "exit-signal", signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExitSignalChannelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExitSignalChannelRequest] (val x: Self) extends AnyVal {
    
    inline def setCoredump(value: Boolean): Self = StObject.set(x, "coredump", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setRecipient(value: Double): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: `exit-signal`): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
  }
}
