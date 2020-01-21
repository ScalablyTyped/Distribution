package typings.reactPlayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YouTubeConfig extends js.Object {
  var embedOptions: js.UndefOr[js.Object] = js.undefined
  var playerVars: js.UndefOr[js.Object] = js.undefined
  var preload: js.UndefOr[Boolean] = js.undefined
}

object YouTubeConfig {
  @scala.inline
  def apply(
    embedOptions: js.Object = null,
    playerVars: js.Object = null,
    preload: js.UndefOr[Boolean] = js.undefined
  ): YouTubeConfig = {
    val __obj = js.Dynamic.literal()
    if (embedOptions != null) __obj.updateDynamic("embedOptions")(embedOptions.asInstanceOf[js.Any])
    if (playerVars != null) __obj.updateDynamic("playerVars")(playerVars.asInstanceOf[js.Any])
    if (!js.isUndefined(preload)) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    __obj.asInstanceOf[YouTubeConfig]
  }
}

