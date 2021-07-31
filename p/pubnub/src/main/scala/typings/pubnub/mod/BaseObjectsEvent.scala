package typings.pubnub.mod

import typings.pubnub.anon.EventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseObjectsEvent extends StObject {
  
  var channel: String
  
  var message: EventType
  
  var publisher: js.UndefOr[String] = js.undefined
  
  var subscription: String | Null
  
  var timetoken: Double
}
object BaseObjectsEvent {
  
  @scala.inline
  def apply(channel: String, message: EventType, timetoken: Double): BaseObjectsEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any], subscription = null)
    __obj.asInstanceOf[BaseObjectsEvent]
  }
  
  @scala.inline
  implicit class BaseObjectsEventMutableBuilder[Self <: BaseObjectsEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: EventType): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    @scala.inline
    def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
    
    @scala.inline
    def setTimetoken(value: Double): Self = StObject.set(x, "timetoken", value.asInstanceOf[js.Any])
  }
}
