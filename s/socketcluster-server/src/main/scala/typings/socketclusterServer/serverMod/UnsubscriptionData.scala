package typings.socketclusterServer.serverMod

import typings.socketclusterServer.serversocketMod.UnsubscribeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnsubscriptionData
  extends StObject
     with UnsubscribeData {
  
  var socket: typings.socketclusterServer.serversocketMod.^
}
object UnsubscriptionData {
  
  inline def apply(channel: String, socket: typings.socketclusterServer.serversocketMod.^): UnsubscriptionData = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsubscriptionData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnsubscriptionData] (val x: Self) extends AnyVal {
    
    inline def setSocket(value: typings.socketclusterServer.serversocketMod.^): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
  }
}
