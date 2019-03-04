package typings
package pubnubLib.pubnubMod.PubnubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusEvent extends js.Object {
  var affectedChannelGroups: js.Array[java.lang.String]
   // see Pubnub.Operations
  var affectedChannels: js.Array[java.lang.String]
  var category: java.lang.String
  var currentTimetoken: scala.Double | java.lang.String
  var lastTimetoken: scala.Double | java.lang.String
   // see Pubnub.Categories
  var operation: java.lang.String
  var subscribedChannels: js.Array[java.lang.String]
}

object StatusEvent {
  @scala.inline
  def apply(
    affectedChannelGroups: js.Array[java.lang.String],
    affectedChannels: js.Array[java.lang.String],
    category: java.lang.String,
    currentTimetoken: scala.Double | java.lang.String,
    lastTimetoken: scala.Double | java.lang.String,
    operation: java.lang.String,
    subscribedChannels: js.Array[java.lang.String]
  ): StatusEvent = {
    val __obj = js.Dynamic.literal(affectedChannelGroups = affectedChannelGroups, affectedChannels = affectedChannels, category = category, currentTimetoken = currentTimetoken.asInstanceOf[js.Any], lastTimetoken = lastTimetoken.asInstanceOf[js.Any], operation = operation, subscribedChannels = subscribedChannels)
  
    __obj.asInstanceOf[StatusEvent]
  }
}

