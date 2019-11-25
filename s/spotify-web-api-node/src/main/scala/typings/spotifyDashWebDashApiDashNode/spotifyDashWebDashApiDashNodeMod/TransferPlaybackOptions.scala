package typings.spotifyDashWebDashApiDashNode.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferPlaybackOptions extends js.Object {
  var device_ids: js.Array[String]
  var play: js.UndefOr[Boolean] = js.undefined
}

object TransferPlaybackOptions {
  @scala.inline
  def apply(device_ids: js.Array[String], play: js.UndefOr[Boolean] = js.undefined): TransferPlaybackOptions = {
    val __obj = js.Dynamic.literal(device_ids = device_ids.asInstanceOf[js.Any])
    if (!js.isUndefined(play)) __obj.updateDynamic("play")(play.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferPlaybackOptions]
  }
}

