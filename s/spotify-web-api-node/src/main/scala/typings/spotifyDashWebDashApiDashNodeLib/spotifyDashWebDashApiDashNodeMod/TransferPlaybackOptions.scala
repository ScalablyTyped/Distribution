package typings
package spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferPlaybackOptions extends js.Object {
  var device_ids: js.Array[java.lang.String]
  var play: js.UndefOr[scala.Boolean] = js.undefined
}

object TransferPlaybackOptions {
  @scala.inline
  def apply(device_ids: js.Array[java.lang.String], play: js.UndefOr[scala.Boolean] = js.undefined): TransferPlaybackOptions = {
    val __obj = js.Dynamic.literal(device_ids = device_ids)
    if (!js.isUndefined(play)) __obj.updateDynamic("play")(play)
    __obj.asInstanceOf[TransferPlaybackOptions]
  }
}

