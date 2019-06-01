package typings
package spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepeatOptions extends DeviceOptions {
  var state: js.UndefOr[
    spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeLibStrings.track | spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeLibStrings.context | spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeLibStrings.off
  ] = js.undefined
}

object RepeatOptions {
  @scala.inline
  def apply(
    device_id: java.lang.String = null,
    state: spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeLibStrings.track | spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeLibStrings.context | spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeLibStrings.off = null
  ): RepeatOptions = {
    val __obj = js.Dynamic.literal()
    if (device_id != null) __obj.updateDynamic("device_id")(device_id)
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepeatOptions]
  }
}

