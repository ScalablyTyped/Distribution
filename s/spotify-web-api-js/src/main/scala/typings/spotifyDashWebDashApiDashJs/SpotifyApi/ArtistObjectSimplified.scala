package typings.spotifyDashWebDashApiDashJs.SpotifyApi

import typings.spotifyDashWebDashApiDashJs.spotifyDashWebDashApiDashJsStrings.artist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simplified Artist Object
  * [artist object (simplified)](https://developer.spotify.com/web-api/object-model/)
  */
trait ArtistObjectSimplified extends js.Object {
  var external_urls: ExternalUrlObject
  var href: String
  var id: String
  var name: String
  var `type`: artist
  var uri: String
}

object ArtistObjectSimplified {
  @scala.inline
  def apply(
    external_urls: ExternalUrlObject,
    href: String,
    id: String,
    name: String,
    `type`: artist,
    uri: String
  ): ArtistObjectSimplified = {
    val __obj = js.Dynamic.literal(external_urls = external_urls, href = href, id = id, name = name, uri = uri)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ArtistObjectSimplified]
  }
}

