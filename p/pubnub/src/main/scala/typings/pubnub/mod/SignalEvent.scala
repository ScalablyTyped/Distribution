package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignalEvent extends StObject {
  
  var channel: String
  
  var message: js.Any
  
  var publisher: String
  
  var subscription: String
  
  var timetoken: String
}
object SignalEvent {
  
  @scala.inline
  def apply(channel: String, message: js.Any, publisher: String, subscription: String, timetoken: String): SignalEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalEvent]
  }
  
  @scala.inline
  implicit class SignalEventMutableBuilder[Self <: SignalEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: js.Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimetoken(value: String): Self = StObject.set(x, "timetoken", value.asInstanceOf[js.Any])
  }
}
