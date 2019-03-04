package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Image Object
  * [](https://developer.spotify.com/web-api/object-model/)
  */
trait ImageObject extends js.Object {
  var height: js.UndefOr[scala.Double] = js.undefined
  var url: java.lang.String
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ImageObject {
  @scala.inline
  def apply(
    url: java.lang.String,
    height: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): ImageObject = {
    val __obj = js.Dynamic.literal(url = url)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageObject]
  }
}

