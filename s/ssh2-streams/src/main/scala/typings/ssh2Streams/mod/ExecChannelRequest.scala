package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.exec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecChannelRequest
  extends StObject
     with ChannelRequest {
  
  var command: String
  
  var recipient: Double
  
  var request: exec
  
  var wantReply: Boolean
}
object ExecChannelRequest {
  
  inline def apply(command: String, recipient: Double, wantReply: Boolean): ExecChannelRequest = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = "exec", wantReply = wantReply.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecChannelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecChannelRequest] (val x: Self) extends AnyVal {
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setRecipient(value: Double): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: exec): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setWantReply(value: Boolean): Self = StObject.set(x, "wantReply", value.asInstanceOf[js.Any])
  }
}
