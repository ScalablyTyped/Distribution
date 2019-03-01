package typings
package pubnubLib.pubnubMod.PubnubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// getState
trait GetStateParameters extends js.Object {
  var channelGroups: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var channels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var uuid: js.UndefOr[java.lang.String] = js.undefined
}

object GetStateParameters {
  @scala.inline
  def apply(
    channelGroups: js.Array[java.lang.String] = null,
    channels: js.Array[java.lang.String] = null,
    uuid: java.lang.String = null
  ): GetStateParameters = {
    val __obj = js.Dynamic.literal()
    if (channelGroups != null) __obj.updateDynamic("channelGroups")(channelGroups)
    if (channels != null) __obj.updateDynamic("channels")(channels)
    if (uuid != null) __obj.updateDynamic("uuid")(uuid)
    __obj.asInstanceOf[GetStateParameters]
  }
}

