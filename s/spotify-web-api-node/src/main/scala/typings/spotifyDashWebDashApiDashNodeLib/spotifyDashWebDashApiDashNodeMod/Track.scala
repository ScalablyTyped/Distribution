package typings
package spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Track extends js.Object {
  var positions: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var uri: java.lang.String
}

object Track {
  @scala.inline
  def apply(uri: java.lang.String, positions: js.Array[scala.Double] = null): Track = {
    val __obj = js.Dynamic.literal(uri = uri)
    if (positions != null) __obj.updateDynamic("positions")(positions)
    __obj.asInstanceOf[Track]
  }
}

