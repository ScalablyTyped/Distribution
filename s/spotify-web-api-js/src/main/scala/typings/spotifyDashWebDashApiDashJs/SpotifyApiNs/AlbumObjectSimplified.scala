package typings.spotifyDashWebDashApiDashJs.SpotifyApiNs

import typings.spotifyDashWebDashApiDashJs.spotifyDashWebDashApiDashJsStrings.album
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simplified Album Object
  * [album object (simplified)](https://developer.spotify.com/web-api/object-model/#album-object-simplified)
  */
trait AlbumObjectSimplified extends js.Object {
  var album_type: String
  var available_markets: js.UndefOr[js.Array[String]] = js.undefined
  var external_urls: ExternalUrlObject
  var href: String
  var id: String
  var images: js.Array[ImageObject]
  var name: String
  var `type`: album
  var uri: String
}

object AlbumObjectSimplified {
  @scala.inline
  def apply(
    album_type: String,
    external_urls: ExternalUrlObject,
    href: String,
    id: String,
    images: js.Array[ImageObject],
    name: String,
    `type`: album,
    uri: String,
    available_markets: js.Array[String] = null
  ): AlbumObjectSimplified = {
    val __obj = js.Dynamic.literal(album_type = album_type, external_urls = external_urls, href = href, id = id, images = images, name = name, uri = uri)
    __obj.updateDynamic("type")(`type`)
    if (available_markets != null) __obj.updateDynamic("available_markets")(available_markets)
    __obj.asInstanceOf[AlbumObjectSimplified]
  }
}

