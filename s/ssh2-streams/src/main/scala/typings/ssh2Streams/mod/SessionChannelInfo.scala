package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.session
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionChannelInfo
  extends StObject
     with ChannelOpenInfo {
  
  var packetSize: Double
  
  var sender: Double
  
  var `type`: session
  
  var window: Double
}
object SessionChannelInfo {
  
  inline def apply(packetSize: Double, sender: Double, window: Double): SessionChannelInfo = {
    val __obj = js.Dynamic.literal(packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("session")
    __obj.asInstanceOf[SessionChannelInfo]
  }
  
  extension [Self <: SessionChannelInfo](x: Self) {
    
    inline def setPacketSize(value: Double): Self = StObject.set(x, "packetSize", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Double): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setType(value: session): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWindow(value: Double): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
  }
}
