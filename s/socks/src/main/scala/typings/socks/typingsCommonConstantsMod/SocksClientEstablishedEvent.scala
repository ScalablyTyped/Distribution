package typings.socks.typingsCommonConstantsMod

import typings.node.netMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocksClientEstablishedEvent extends StObject {
  
  var remoteHost: js.UndefOr[SocksRemoteHost] = js.undefined
  
  var socket: Socket
}
object SocksClientEstablishedEvent {
  
  inline def apply(socket: Socket): SocksClientEstablishedEvent = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocksClientEstablishedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SocksClientEstablishedEvent] (val x: Self) extends AnyVal {
    
    inline def setRemoteHost(value: SocksRemoteHost): Self = StObject.set(x, "remoteHost", value.asInstanceOf[js.Any])
    
    inline def setRemoteHostUndefined: Self = StObject.set(x, "remoteHost", js.undefined)
    
    inline def setSocket(value: Socket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
  }
}
