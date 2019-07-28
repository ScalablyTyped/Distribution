package typings.spotifyDashWebDashApiDashNode.spotifyDashWebDashApiDashNodeMod

import typings.spotifyDashWebDashApiDashNode.spotifyDashWebDashApiDashNodeStrings.context
import typings.spotifyDashWebDashApiDashNode.spotifyDashWebDashApiDashNodeStrings.off
import typings.spotifyDashWebDashApiDashNode.spotifyDashWebDashApiDashNodeStrings.track
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
    if (device_id != null) __obj.updateDynamic("device_id")(device_id)
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepeatOptions]
  }
}

