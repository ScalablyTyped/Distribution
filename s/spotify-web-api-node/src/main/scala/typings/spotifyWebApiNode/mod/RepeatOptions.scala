package typings.spotifyWebApiNode.mod

import typings.spotifyWebApiNode.spotifyWebApiNodeStrings.context
import typings.spotifyWebApiNode.spotifyWebApiNodeStrings.off
import typings.spotifyWebApiNode.spotifyWebApiNodeStrings.track
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepeatOptions extends DeviceOptions {
  var state: js.UndefOr[track | context | off] = js.undefined
}

object RepeatOptions {
  @scala.inline
  def apply(device_id: String = null, state: track | context | off = null): RepeatOptions = {
    val __obj = js.Dynamic.literal()
    if (device_id != null) __obj.updateDynamic("device_id")(device_id.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepeatOptions]
  }
}

