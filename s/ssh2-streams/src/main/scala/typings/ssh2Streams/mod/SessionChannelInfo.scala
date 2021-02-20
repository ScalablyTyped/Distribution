package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.session
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionChannelInfo extends ChannelOpenInfo {
  
  var packetSize: Double = js.native
  
  var sender: Double = js.native
  
  var `type`: session = js.native
  
  var window: Double = js.native
}
object SessionChannelInfo {
  
  @scala.inline
  def apply(packetSize: Double, sender: Double, `type`: session, window: Double): SessionChannelInfo = {
    val __obj = js.Dynamic.literal(packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionChannelInfo]
  }
  
  @scala.inline
  implicit class SessionChannelInfoMutableBuilder[Self <: SessionChannelInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPacketSize(value: Double): Self = StObject.set(x, "packetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: Double): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: session): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindow(value: Double): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
  }
}
