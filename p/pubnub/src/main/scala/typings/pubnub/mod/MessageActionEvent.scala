package typings.pubnub.mod

import typings.pubnub.anon.DataEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageActionEvent extends StObject {
  
  var channel: String
  
  var message: DataEvent
  
  var publisher: String
  
  var subscription: js.UndefOr[String] = js.undefined
  
  var timetoken: String
}
object MessageActionEvent {
  
  inline def apply(channel: String, message: DataEvent, publisher: String, timetoken: String): MessageActionEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageActionEvent]
  }
  
  extension [Self <: MessageActionEvent](x: Self) {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: DataEvent): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    inline def setTimetoken(value: String): Self = StObject.set(x, "timetoken", value.asInstanceOf[js.Any])
  }
}
