package typings.pubnub.mod

import typings.pubnub.anon.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * deprecated: For objects v2, use objects.the ObjectsEvent
  */
@js.native
trait SpaceEvent extends StObject {
  
  var channel: String = js.native
  
  var message: Event = js.native
  
  var publisher: String = js.native
  
  var subscription: String = js.native
  
  var timetoken: String = js.native
}
object SpaceEvent {
  
  @scala.inline
  def apply(channel: String, message: Event, publisher: String, subscription: String, timetoken: String): SpaceEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpaceEvent]
  }
  
  @scala.inline
  implicit class SpaceEventMutableBuilder[Self <: SpaceEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: Event): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimetoken(value: String): Self = StObject.set(x, "timetoken", value.asInstanceOf[js.Any])
  }
}
