package typings
package spotifyDashWebDashApiDashJsLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simplified Album Object
  * [album object (simplified)](https://developer.spotify.com/web-api/object-model/#album-object-simplified)
  */
trait AlbumObjectSimplified extends js.Object {
  var album_type: java.lang.String
  var available_markets: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var external_urls: ExternalUrlObject
  var href: java.lang.String
  var id: java.lang.String
  var images: js.Array[ImageObject]
  var name: java.lang.String
  var `type`: spotifyDashWebDashApiDashJsLib.spotifyDashWebDashApiDashJsLibStrings.album
  var uri: java.lang.String
}

object AlbumObjectSimplified {
  @scala.inline
  def apply(
    album_type: java.lang.String,
    external_urls: ExternalUrlObject,
    href: java.lang.String,
    id: java.lang.String,
    images: js.Array[ImageObject],
    name: java.lang.String,
    `type`: spotifyDashWebDashApiDashJsLib.spotifyDashWebDashApiDashJsLibStrings.album,
    uri: java.lang.String,
    available_markets: js.Array[java.lang.String] = null
  ): AlbumObjectSimplified = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("album_type")(album_type)
    __obj.updateDynamic("external_urls")(external_urls)
    __obj.updateDynamic("href")(href)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("images")(images)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("uri")(uri)
    if (available_markets != null) __obj.updateDynamic("available_markets")(available_markets)
    __obj.asInstanceOf[AlbumObjectSimplified]
  }
}

