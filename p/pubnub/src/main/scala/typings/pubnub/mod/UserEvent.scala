package typings.pubnub.mod

import typings.pubnub.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * deprecated: For objects v2, use objects.the ObjectsEvent
  */
trait UserEvent extends StObject {
  
  var channel: String
  
  var message: Data
  
  var publisher: String
  
  var subscription: String
  
  var timetoken: String
}
object UserEvent {
  
  inline def apply(channel: String, message: Data, publisher: String, subscription: String, timetoken: String): UserEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserEvent]
  }
  
  extension [Self <: UserEvent](x: Self) {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: Data): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setTimetoken(value: String): Self = StObject.set(x, "timetoken", value.asInstanceOf[js.Any])
  }
}
