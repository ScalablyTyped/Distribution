package typings.pubnub.mod

import typings.pubnub.pubnubStrings.`state-change`
import typings.pubnub.pubnubStrings.join
import typings.pubnub.pubnubStrings.leave
import typings.pubnub.pubnubStrings.timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PresenceEvent extends js.Object {
  
  var action: join | leave | `state-change` | timeout = js.native
  
  /**
    * deprecated:
    */
  var actualChannel: String = js.native
  
  var channel: String = js.native
  
  var occupancy: Double = js.native
  
  var state: js.UndefOr[js.Any] = js.native
  
  /**
    * deprecated:
    */
  var subscribedChannel: String = js.native
  
  var subscription: String = js.native
  
  var timestamp: Double = js.native
  
  var timetoken: String = js.native
  
  var uuid: String = js.native
}
object PresenceEvent {
  
  @scala.inline
  def apply(
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
  implicit class PresenceEventOps[Self <: PresenceEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: join | leave | `state-change` | timeout): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualChannel(value: String): Self = this.set("actualChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccupancy(value: Double): Self = this.set("occupancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribedChannel(value: String): Self = this.set("subscribedChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscription(value: String): Self = this.set("subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimetoken(value: String): Self = this.set("timetoken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: js.Any): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
