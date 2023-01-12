package typings.socketclusterServer.serverMod

import typings.socketclusterServer.serversocketMod.AuthenticateData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationData
  extends StObject
     with AuthenticateData {
  
  var socket: typings.socketclusterServer.serversocketMod.^
}
object AuthenticationData {
  
  inline def apply(socket: typings.socketclusterServer.serversocketMod.^): AuthenticationData = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticationData] (val x: Self) extends AnyVal {
    
    inline def setSocket(value: typings.socketclusterServer.serversocketMod.^): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
  }
}
