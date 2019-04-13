package typings
package pubnubLib.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// subscribe
trait SubscribeParameters extends js.Object {
  var channelGroups: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var channels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var timetoken: js.UndefOr[scala.Double] = js.undefined
  var withPresence: js.UndefOr[scala.Boolean] = js.undefined
}

object SubscribeParameters {
  @scala.inline
  def apply(
    channelGroups: js.Array[java.lang.String] = null,
    channels: js.Array[java.lang.String] = null,
    timetoken: scala.Int | scala.Double = null,
    withPresence: js.UndefOr[scala.Boolean] = js.undefined
  ): SubscribeParameters = {
    val __obj = js.Dynamic.literal()
    if (channelGroups != null) __obj.updateDynamic("channelGroups")(channelGroups)
    if (channels != null) __obj.updateDynamic("channels")(channels)
    if (timetoken != null) __obj.updateDynamic("timetoken")(timetoken.asInstanceOf[js.Any])
    if (!js.isUndefined(withPresence)) __obj.updateDynamic("withPresence")(withPresence)
    __obj.asInstanceOf[SubscribeParameters]
  }
}

