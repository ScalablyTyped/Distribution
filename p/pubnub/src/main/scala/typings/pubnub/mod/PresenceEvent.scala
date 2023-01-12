package typings.pubnub.mod

import typings.pubnub.pubnubStrings.`state-change`
import typings.pubnub.pubnubStrings.join
import typings.pubnub.pubnubStrings.leave
import typings.pubnub.pubnubStrings.timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PresenceEvent extends StObject {
  
  var action: join | leave | `state-change` | timeout
  
  /**
    * deprecated:
    */
  var actualChannel: String
  
  var channel: String
  
  var occupancy: Double
  
  var state: js.UndefOr[Any] = js.undefined
  
  /**
    * deprecated:
    */
  var subscribedChannel: String
  
  var subscription: String
  
  var timestamp: Double
  
  var timetoken: String
  
  var uuid: String
}
object PresenceEvent {
  
  inline def apply(
    action: join | leave | `state-change` | timeout,
    actualChannel: String,
    channel: String,
    occupancy: Double,
    subscribedChannel: String,
    subscription: String,
    timestamp: Double,
    timetoken: String,
    uuid: String
  ): PresenceEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], actualChannel = actualChannel.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], occupancy = occupancy.asInstanceOf[js.Any], subscribedChannel = subscribedChannel.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresenceEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PresenceEvent] (val x: Self) extends AnyVal {
    
    inline def setAction(value: join | leave | `state-change` | timeout): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActualChannel(value: String): Self = StObject.set(x, "actualChannel", value.asInstanceOf[js.Any])
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setOccupancy(value: Double): Self = StObject.set(x, "occupancy", value.asInstanceOf[js.Any])
    
    inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSubscribedChannel(value: String): Self = StObject.set(x, "subscribedChannel", value.asInstanceOf[js.Any])
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimetoken(value: String): Self = StObject.set(x, "timetoken", value.asInstanceOf[js.Any])
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
