package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageEvent extends StObject {
  
  /**
    * deprecated:
    */
  var actualChannel: String
  
  var channel: String
  
  var message: js.Any
  
  var publisher: String
  
  /**
    * deprecated:
    */
  var subscribedChannel: String
  
  var subscription: String
  
  var timetoken: String
}
object MessageEvent {
  
  inline def apply(
    actualChannel: String,
    channel: String,
    message: js.Any,
    publisher: String,
    subscribedChannel: String,
    subscription: String,
    timetoken: String
  ): MessageEvent = {
    val __obj = js.Dynamic.literal(actualChannel = actualChannel.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], subscribedChannel = subscribedChannel.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEvent]
  }
  
  extension [Self <: MessageEvent](x: Self) {
    
    inline def setActualChannel(value: String): Self = StObject.set(x, "actualChannel", value.asInstanceOf[js.Any])
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: js.Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setSubscribedChannel(value: String): Self = StObject.set(x, "subscribedChannel", value.asInstanceOf[js.Any])
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setTimetoken(value: String): Self = StObject.set(x, "timetoken", value.asInstanceOf[js.Any])
  }
}
