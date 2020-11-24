package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusEvent extends js.Object {
  
  var affectedChannelGroups: js.Array[String] = js.native
  
   // see Pubnub.Operations
  var affectedChannels: js.Array[String] = js.native
  
  var category: String = js.native
  
  var currentTimetoken: Double | String = js.native
  
  var lastTimetoken: Double | String = js.native
  
   // see Pubnub.Categories
  var operation: String = js.native
  
  var subscribedChannels: js.Array[String] = js.native
}
object StatusEvent {
  
  @scala.inline
  def apply(
    affectedChannelGroups: js.Array[String],
    affectedChannels: js.Array[String],
    category: String,
    currentTimetoken: Double | String,
    lastTimetoken: Double | String,
    operation: String,
    subscribedChannels: js.Array[String]
  ): StatusEvent = {
    val __obj = js.Dynamic.literal(affectedChannelGroups = affectedChannelGroups.asInstanceOf[js.Any], affectedChannels = affectedChannels.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], currentTimetoken = currentTimetoken.asInstanceOf[js.Any], lastTimetoken = lastTimetoken.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], subscribedChannels = subscribedChannels.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusEvent]
  }
  
  @scala.inline
  implicit class StatusEventOps[Self <: StatusEvent] (val x: Self) extends AnyVal {
    
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
    def setAffectedChannelGroupsVarargs(value: String*): Self = this.set("affectedChannelGroups", js.Array(value :_*))
    
    @scala.inline
    def setAffectedChannelGroups(value: js.Array[String]): Self = this.set("affectedChannelGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffectedChannelsVarargs(value: String*): Self = this.set("affectedChannels", js.Array(value :_*))
    
    @scala.inline
    def setAffectedChannels(value: js.Array[String]): Self = this.set("affectedChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTimetoken(value: Double | String): Self = this.set("currentTimetoken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTimetoken(value: Double | String): Self = this.set("lastTimetoken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: String): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribedChannelsVarargs(value: String*): Self = this.set("subscribedChannels", js.Array(value :_*))
    
    @scala.inline
    def setSubscribedChannels(value: js.Array[String]): Self = this.set("subscribedChannels", value.asInstanceOf[js.Any])
  }
}
