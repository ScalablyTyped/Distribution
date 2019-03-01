package typings
package spotifyDashWebDashApiDashJsLib.SpotifyApiNs

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
  var `type`: spotifyDashWebDashApiDashJsLib.spotifyDashWebDashApiDashJsLibStrings.artist
  var uri: java.lang.String
}

object ArtistObjectSimplified {
  @scala.inline
  def apply(
    external_urls: ExternalUrlObject,
    href: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    `type`: spotifyDashWebDashApiDashJsLib.spotifyDashWebDashApiDashJsLibStrings.artist,
    uri: java.lang.String
  ): ArtistObjectSimplified = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("external_urls")(external_urls)
    __obj.updateDynamic("href")(href)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[ArtistObjectSimplified]
  }
}

