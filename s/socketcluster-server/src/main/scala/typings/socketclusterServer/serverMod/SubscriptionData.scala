package typings.socketclusterServer.serverMod

import typings.socketclusterServer.serversocketMod.SubscribeData
import typings.socketclusterServer.serversocketMod.SubscriptionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionData
  extends StObject
     with SubscribeData {
  
  var socket: typings.socketclusterServer.serversocketMod.^
}
object SubscriptionData {
  
  inline def apply(
    channel: String,
    socket: typings.socketclusterServer.serversocketMod.^,
    subscriptionOptions: SubscriptionOptions
  ): SubscriptionData = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any], subscriptionOptions = subscriptionOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionData]
  }
  
  extension [Self <: SubscriptionData](x: Self) {
    
    inline def setSocket(value: typings.socketclusterServer.serversocketMod.^): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
  }
}
