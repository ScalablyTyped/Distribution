package typings.pubnub.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// unsubscribe
trait UnsubscribeParameters extends js.Object {
  var channelGroups: js.UndefOr[js.Array[String]] = js.undefined
  var channels: js.UndefOr[js.Array[String]] = js.undefined
}

object UnsubscribeParameters {
  @scala.inline
  def apply(channelGroups: js.Array[String] = null, channels: js.Array[String] = null): UnsubscribeParameters = {
    val __obj = js.Dynamic.literal()
    if (channelGroups != null) __obj.updateDynamic("channelGroups")(channelGroups.asInstanceOf[js.Any])
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsubscribeParameters]
  }
}

