package typings.spotifyWebPlaybackSdk.Spotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var height: js.UndefOr[Double | Null] = js.undefined
  var url: String
  var width: js.UndefOr[Double | Null] = js.undefined
}

object Image {
  @scala.inline
  def apply(
    url: String,
    height: js.UndefOr[Null | Double] = js.undefined,
    width: js.UndefOr[Null | Double] = js.undefined
  ): Image = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

