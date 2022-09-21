package typings.pusherJs

import typings.pusherJs.actionMod.Action
import typings.pusherJs.connectionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handshakePayloadMod {
  
  trait HandshakePayload
    extends StObject
       with Action {
    
    var connection: js.UndefOr[default] = js.undefined
    
    var transport: typings.pusherJs.transportConnectionMod.default
  }
  object HandshakePayload {
    
    inline def apply(action: String, transport: typings.pusherJs.transportConnectionMod.default): HandshakePayload = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandshakePayload]
    }
    
    extension [Self <: HandshakePayload](x: Self) {
      
      inline def setConnection(value: default): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
      
      inline def setTransport(value: typings.pusherJs.transportConnectionMod.default): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
}
