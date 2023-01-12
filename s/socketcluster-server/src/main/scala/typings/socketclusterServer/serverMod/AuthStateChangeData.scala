package typings.socketclusterServer.serverMod

import typings.socketclusterServer.serversocketMod.StateChangeData
import typings.socketclusterServer.socketclusterServerStrings.authenticated
import typings.socketclusterServer.socketclusterServerStrings.unauthenticated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthStateChangeData
  extends StObject
     with StateChangeData {
  
  var socket: typings.socketclusterServer.serversocketMod.^
}
object AuthStateChangeData {
  
  inline def apply(
    newState: authenticated | unauthenticated,
    oldState: authenticated | unauthenticated,
    socket: typings.socketclusterServer.serversocketMod.^
  ): AuthStateChangeData = {
    val __obj = js.Dynamic.literal(newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthStateChangeData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthStateChangeData] (val x: Self) extends AnyVal {
    
    inline def setSocket(value: typings.socketclusterServer.serversocketMod.^): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
  }
}
