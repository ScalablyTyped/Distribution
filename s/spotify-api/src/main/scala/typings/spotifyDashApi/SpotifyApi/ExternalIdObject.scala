package typings.spotifyDashApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * External Id object
  * [](https://developer.spotify.com/web-api/object-model/)
  *
  * Note that there might be other types available, it couldn't be found in the docs.
  */
trait ExternalIdObject extends js.Object {
  var ean: js.UndefOr[String] = js.undefined
  var isrc: js.UndefOr[String] = js.undefined
  var upc: js.UndefOr[String] = js.undefined
}

object ExternalIdObject {
  @scala.inline
  def apply(ean: String = null, isrc: String = null, upc: String = null): ExternalIdObject = {
    val __obj = js.Dynamic.literal()
    if (ean != null) __obj.updateDynamic("ean")(ean)
    if (isrc != null) __obj.updateDynamic("isrc")(isrc)
    if (upc != null) __obj.updateDynamic("upc")(upc)
    __obj.asInstanceOf[ExternalIdObject]
  }
}

