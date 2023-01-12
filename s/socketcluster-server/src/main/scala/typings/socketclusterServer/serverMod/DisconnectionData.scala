package typings.socketclusterServer.serverMod

import typings.socketclusterServer.serversocketMod.DisconnectData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisconnectionData
  extends StObject
     with DisconnectData {
  
  var socket: typings.socketclusterServer.serversocketMod.^
}
object DisconnectionData {
  
  inline def apply(code: Double, reason: String, socket: typings.socketclusterServer.serversocketMod.^): DisconnectionData = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisconnectionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisconnectionData] (val x: Self) extends AnyVal {
    
    inline def setSocket(value: typings.socketclusterServer.serversocketMod.^): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
  }
}
