package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`x11-req`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X11ChannelRequest
  extends StObject
     with ChannelRequest {
  
  var cookie: String
  
  var protocol: String
  
  var recipient: Double
  
  var request: `x11-req`
  
  var screen: Double
  
  var single: Boolean
  
  var wantReply: Boolean
}
object X11ChannelRequest {
  
  inline def apply(
    cookie: String,
    protocol: String,
    recipient: Double,
    screen: Double,
    single: Boolean,
    wantReply: Boolean
  ): X11ChannelRequest = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = "x11-req", screen = screen.asInstanceOf[js.Any], single = single.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any])
    __obj.asInstanceOf[X11ChannelRequest]
  }
  
  extension [Self <: X11ChannelRequest](x: Self) {
    
    inline def setCookie(value: String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setRecipient(value: Double): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: `x11-req`): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setScreen(value: Double): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
    
    inline def setSingle(value: Boolean): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
    
    inline def setWantReply(value: Boolean): Self = StObject.set(x, "wantReply", value.asInstanceOf[js.Any])
  }
}
