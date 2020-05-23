package typings.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Image Object
  * [](https://developer.spotify.com/web-api/object-model/)
  */
trait ImageObject extends js.Object {
  /**
    * The image height in pixels. If unknown: `null` or not returned.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The source URL of the image.
    */
  var url: String
  /**
    * The image width in pixels. If unknown: null or not returned.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ImageObject {
  @scala.inline
  def apply(url: String, height: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined): ImageObject = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageObject]
  }
}

