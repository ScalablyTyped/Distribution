package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.subsystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubsystemChannelRequest
  extends StObject
     with ChannelRequest {
  
  var recipient: Double
  
  var request: subsystem
  
  var subsystem: String
  
  var wantReply: Boolean
}
object SubsystemChannelRequest {
  
  inline def apply(recipient: Double, subsystem: String, wantReply: Boolean): SubsystemChannelRequest = {
    val __obj = js.Dynamic.literal(recipient = recipient.asInstanceOf[js.Any], request = "subsystem", subsystem = subsystem.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubsystemChannelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubsystemChannelRequest] (val x: Self) extends AnyVal {
    
    inline def setRecipient(value: Double): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: subsystem): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setSubsystem(value: String): Self = StObject.set(x, "subsystem", value.asInstanceOf[js.Any])
    
    inline def setWantReply(value: Boolean): Self = StObject.set(x, "wantReply", value.asInstanceOf[js.Any])
  }
}
