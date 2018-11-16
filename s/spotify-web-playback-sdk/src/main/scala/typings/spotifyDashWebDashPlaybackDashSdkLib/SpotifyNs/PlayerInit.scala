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

