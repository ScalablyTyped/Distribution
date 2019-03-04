package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simplified Artist Object
  * [artist object (simplified)](https://developer.spotify.com/web-api/object-model/)
  */
trait ArtistObjectSimplified extends js.Object {
  var external_urls: ExternalUrlObject
  var href: java.lang.String
  var id: java.lang.String
  var name: java.lang.String
  var `type`: spotifyDashApiLib.spotifyDashApiLibStrings.artist
  var uri: java.lang.String
}

object ArtistObjectSimplified {
  @scala.inline
  def apply(
    external_urls: ExternalUrlObject,
    href: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    `type`: spotifyDashApiLib.spotifyDashApiLibStrings.artist,
    uri: java.lang.String
  ): ArtistObjectSimplified = {
    val __obj = js.Dynamic.literal(external_urls = external_urls, href = href, id = id, name = name, uri = uri)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ArtistObjectSimplified]
  }
}

