package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusEvent extends StObject {
  
  var affectedChannelGroups: js.Array[String]
  
  // see Pubnub.Operations
  var affectedChannels: js.Array[String]
  
  var category: String
  
  var currentTimetoken: Double | String
  
  var lastTimetoken: Double | String
  
  // see Pubnub.Categories
  var operation: String
  
  var subscribedChannels: js.Array[String]
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
  implicit class StatusEventMutableBuilder[Self <: StatusEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAffectedChannelGroups(value: js.Array[String]): Self = StObject.set(x, "affectedChannelGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffectedChannelGroupsVarargs(value: String*): Self = StObject.set(x, "affectedChannelGroups", js.Array(value :_*))
    
    @scala.inline
    def setAffectedChannels(value: js.Array[String]): Self = StObject.set(x, "affectedChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffectedChannelsVarargs(value: String*): Self = StObject.set(x, "affectedChannels", js.Array(value :_*))
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTimetoken(value: Double | String): Self = StObject.set(x, "currentTimetoken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTimetoken(value: Double | String): Self = StObject.set(x, "lastTimetoken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribedChannels(value: js.Array[String]): Self = StObject.set(x, "subscribedChannels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribedChannelsVarargs(value: String*): Self = StObject.set(x, "subscribedChannels", js.Array(value :_*))
  }
}
