package typings.socketclusterServer.serverMod

import typings.socketclusterServer.serversocketMod.ConnectAbortData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionAbortData
  extends StObject
     with ConnectAbortData {
  
  var socket: typings.socketclusterServer.serversocketMod.^
}
object ConnectionAbortData {
  
  inline def apply(code: Double, reason: String, socket: typings.socketclusterServer.serversocketMod.^): ConnectionAbortData = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionAbortData]
  }
  
  extension [Self <: ConnectionAbortData](x: Self) {
    
    inline def setSocket(value: typings.socketclusterServer.serversocketMod.^): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
  }
}
