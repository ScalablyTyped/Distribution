package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// hereNow
trait HereNowParameters extends js.Object {
  var channelGroups: js.UndefOr[js.Array[String]] = js.undefined
  var channels: js.UndefOr[js.Array[String]] = js.undefined
  var includeState: js.UndefOr[Boolean] = js.undefined
  var includeUUIDs: js.UndefOr[Boolean] = js.undefined
}

object HereNowParameters {
  @scala.inline
  def apply(
    channelGroups: js.Array[String] = null,
    channels: js.Array[String] = null,
    includeState: js.UndefOr[Boolean] = js.undefined,
    includeUUIDs: js.UndefOr[Boolean] = js.undefined
  ): HereNowParameters = {
    val __obj = js.Dynamic.literal()
    if (channelGroups != null) __obj.updateDynamic("channelGroups")(channelGroups.asInstanceOf[js.Any])
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (!js.isUndefined(includeState)) __obj.updateDynamic("includeState")(includeState.asInstanceOf[js.Any])
    if (!js.isUndefined(includeUUIDs)) __obj.updateDynamic("includeUUIDs")(includeUUIDs.asInstanceOf[js.Any])
    __obj.asInstanceOf[HereNowParameters]
  }
}

