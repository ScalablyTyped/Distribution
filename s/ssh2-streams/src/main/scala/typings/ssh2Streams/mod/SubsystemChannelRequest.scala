package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.subsystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubsystemChannelRequest extends ChannelRequest {
  
  var recipient: Double = js.native
  
  var request: subsystem = js.native
  
  var subsystem: String = js.native
  
  var wantReply: Boolean = js.native
}
object SubsystemChannelRequest {
  
  @scala.inline
  def apply(recipient: Double, request: subsystem, subsystem: String, wantReply: Boolean): SubsystemChannelRequest = {
    val __obj = js.Dynamic.literal(recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], subsystem = subsystem.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubsystemChannelRequest]
  }
  
  @scala.inline
  implicit class SubsystemChannelRequestMutableBuilder[Self <: SubsystemChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecipient(value: Double): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: subsystem): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubsystem(value: String): Self = StObject.set(x, "subsystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWantReply(value: Boolean): Self = StObject.set(x, "wantReply", value.asInstanceOf[js.Any])
  }
}
