package typings.pubnub.pubnubMod

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
    if (channelGroups != null) __obj.updateDynamic("channelGroups")(channelGroups)
    if (channels != null) __obj.updateDynamic("channels")(channels)
    if (!js.isUndefined(includeState)) __obj.updateDynamic("includeState")(includeState)
    if (!js.isUndefined(includeUUIDs)) __obj.updateDynamic("includeUUIDs")(includeUUIDs)
    __obj.asInstanceOf[HereNowParameters]
  }
}

