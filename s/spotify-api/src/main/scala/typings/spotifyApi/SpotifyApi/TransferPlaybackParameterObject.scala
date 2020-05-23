package typings.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferPlaybackParameterObject extends js.Object {
  var play: js.UndefOr[Boolean] = js.undefined
}

object TransferPlaybackParameterObject {
  @scala.inline
  def apply(play: js.UndefOr[Boolean] = js.undefined): TransferPlaybackParameterObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(play)) __obj.updateDynamic("play")(play.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferPlaybackParameterObject]
  }
}

