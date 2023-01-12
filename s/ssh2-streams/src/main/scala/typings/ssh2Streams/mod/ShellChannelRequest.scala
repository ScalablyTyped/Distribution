package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.shell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShellChannelRequest
  extends StObject
     with ChannelRequest {
  
  var recipient: Double
  
  var request: shell
  
  var wantReply: Boolean
}
object ShellChannelRequest {
  
  inline def apply(recipient: Double, wantReply: Boolean): ShellChannelRequest = {
    val __obj = js.Dynamic.literal(recipient = recipient.asInstanceOf[js.Any], request = "shell", wantReply = wantReply.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellChannelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShellChannelRequest] (val x: Self) extends AnyVal {
    
    inline def setRecipient(value: Double): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: shell): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setWantReply(value: Boolean): Self = StObject.set(x, "wantReply", value.asInstanceOf[js.Any])
  }
}
