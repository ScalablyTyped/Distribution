package typings.spotifyDashWebDashPlaybackDashSdk.SpotifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerInit extends js.Object {
  var name: String
  var volume: js.UndefOr[Double] = js.undefined
  def getOAuthToken(cb: js.Function1[/* token */ String, Unit]): Unit
}

object PlayerInit {
  @scala.inline
  def apply(
    getOAuthToken: js.Function1[/* token */ String, Unit] => Unit,
    name: String,
    volume: Int | Double = null
  ): PlayerInit = {
    val __obj = js.Dynamic.literal(getOAuthToken = js.Any.fromFunction1(getOAuthToken), name = name)
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerInit]
  }
}

