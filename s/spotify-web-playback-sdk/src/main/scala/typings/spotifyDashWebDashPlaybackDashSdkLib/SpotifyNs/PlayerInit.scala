package typings
package spotifyDashWebDashPlaybackDashSdkLib.SpotifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerInit extends js.Object {
  var name: java.lang.String
  var volume: js.UndefOr[scala.Double] = js.undefined
  def getOAuthToken(cb: js.Function1[/* token */ java.lang.String, scala.Unit]): scala.Unit
}

object PlayerInit {
  @scala.inline
  def apply(
    getOAuthToken: js.Function1[js.Function1[/* token */ java.lang.String, scala.Unit], scala.Unit],
    name: java.lang.String,
    volume: scala.Int | scala.Double = null
  ): PlayerInit = {
    val __obj = js.Dynamic.literal(getOAuthToken = getOAuthToken, name = name)
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerInit]
  }
}

