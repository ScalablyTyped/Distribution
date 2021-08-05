package typings.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelOpenConfirmationInfo extends StObject {
  
  var packetSize: Double
  
  var recipient: Double
  
  var sender: Double
  
  var window: Double
}
object ChannelOpenConfirmationInfo {
  
  inline def apply(packetSize: Double, recipient: Double, sender: Double, window: Double): ChannelOpenConfirmationInfo = {
    val __obj = js.Dynamic.literal(packetSize = packetSize.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelOpenConfirmationInfo]
  }
  
  extension [Self <: ChannelOpenConfirmationInfo](x: Self) {
    
    inline def setPacketSize(value: Double): Self = StObject.set(x, "packetSize", value.asInstanceOf[js.Any])
    
    inline def setRecipient(value: Double): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Double): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setWindow(value: Double): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
  }
}
