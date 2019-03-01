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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("affectedChannelGroups")(affectedChannelGroups)
    __obj.updateDynamic("affectedChannels")(affectedChannels)
    __obj.updateDynamic("category")(category)
    __obj.updateDynamic("currentTimetoken")(currentTimetoken.asInstanceOf[js.Any])
    __obj.updateDynamic("lastTimetoken")(lastTimetoken.asInstanceOf[js.Any])
    __obj.updateDynamic("operation")(operation)
    __obj.updateDynamic("subscribedChannels")(subscribedChannels)
    __obj.asInstanceOf[StatusEvent]
  }
}

