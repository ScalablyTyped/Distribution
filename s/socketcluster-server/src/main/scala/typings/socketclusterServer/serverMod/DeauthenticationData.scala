package typings.socketclusterServer.serverMod

import typings.socketclusterServer.serversocketMod.DeauthenticateData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeauthenticationData
  extends StObject
     with DeauthenticateData {
  
  var socket: typings.socketclusterServer.serversocketMod.^
}
object DeauthenticationData {
  
  inline def apply(socket: typings.socketclusterServer.serversocketMod.^): DeauthenticationData = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeauthenticationData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeauthenticationData] (val x: Self) extends AnyVal {
    
    inline def setSocket(value: typings.socketclusterServer.serversocketMod.^): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
  }
}
