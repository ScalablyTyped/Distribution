package typings.pusherJs

import typings.pusherJs.typesSrcCoreConnectionConnectionMod.default
import typings.pusherJs.typesSrcCoreConnectionProtocolActionMod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreConnectionHandshakeHandshakePayloadMod {
  
  trait HandshakePayload
    extends StObject
       with Action {
    
    var connection: js.UndefOr[default] = js.undefined
    
    var transport: typings.pusherJs.typesSrcCoreTransportsTransportConnectionMod.default
  }
  object HandshakePayload {
    
    inline def apply(action: String, transport: typings.pusherJs.typesSrcCoreTransportsTransportConnectionMod.default): HandshakePayload = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandshakePayload]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HandshakePayload] (val x: Self) extends AnyVal {
      
      inline def setConnection(value: default): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
      
      inline def setTransport(value: typings.pusherJs.typesSrcCoreTransportsTransportConnectionMod.default): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
}
