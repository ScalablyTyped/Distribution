package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferPlaybackParameterObject extends js.Object {
  var play: js.UndefOr[scala.Boolean] = js.undefined
}

object TransferPlaybackParameterObject {
  @scala.inline
  def apply(play: js.UndefOr[scala.Boolean] = js.undefined): TransferPlaybackParameterObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(play)) __obj.updateDynamic("play")(play)
    __obj.asInstanceOf[TransferPlaybackParameterObject]
  }
}

