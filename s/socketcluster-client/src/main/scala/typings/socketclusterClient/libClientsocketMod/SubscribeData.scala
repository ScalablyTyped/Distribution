package typings.socketclusterClient.libClientsocketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscribeData extends StObject {
  
  var channel: String
  
  var subscriptionOptions: SubscribeOptions
}
object SubscribeData {
  
  inline def apply(channel: String, subscriptionOptions: SubscribeOptions): SubscribeData = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], subscriptionOptions = subscriptionOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeData]
  }
  
  extension [Self <: SubscribeData](x: Self) {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionOptions(value: SubscribeOptions): Self = StObject.set(x, "subscriptionOptions", value.asInstanceOf[js.Any])
  }
}
