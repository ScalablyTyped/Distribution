package typings
package pubnubLib.pubnubMod.PubnubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// setState
trait SetStateParameters extends js.Object {
  var channelGroups: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var channels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var state: js.UndefOr[js.Any] = js.undefined
}

object SetStateParameters {
  @scala.inline
  def apply(
    channelGroups: js.Array[java.lang.String] = null,
    channels: js.Array[java.lang.String] = null,
    state: js.Any = null
  ): SetStateParameters = {
    val __obj = js.Dynamic.literal()
    if (channelGroups != null) __obj.updateDynamic("channelGroups")(channelGroups)
    if (channels != null) __obj.updateDynamic("channels")(channels)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[SetStateParameters]
  }
}

