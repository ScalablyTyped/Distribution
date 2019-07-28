package typings.spotifyDashWebDashApiDashNode.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Track extends js.Object {
  var positions: js.UndefOr[js.Array[Double]] = js.undefined
  var uri: String
}

object Track {
  @scala.inline
  def apply(uri: String, positions: js.Array[Double] = null): Track = {
    val __obj = js.Dynamic.literal(uri = uri)
    if (positions != null) __obj.updateDynamic("positions")(positions)
    __obj.asInstanceOf[Track]
  }
}

