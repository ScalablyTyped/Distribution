package typings.pubnub.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusEvent extends js.Object {
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
    val __obj = js.Dynamic.literal(affectedChannelGroups = affectedChannelGroups, affectedChannels = affectedChannels, category = category, currentTimetoken = currentTimetoken.asInstanceOf[js.Any], lastTimetoken = lastTimetoken.asInstanceOf[js.Any], operation = operation, subscribedChannels = subscribedChannels)
  
    __obj.asInstanceOf[StatusEvent]
  }
}

