package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`exit-signal`
import org.scalablytyped.runtime.StObject
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
  implicit class ExitSignalChannelRequestMutableBuilder[Self <: ExitSignalChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoredump(value: Boolean): Self = StObject.set(x, "coredump", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient(value: Double): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: `exit-signal`): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
  }
}
