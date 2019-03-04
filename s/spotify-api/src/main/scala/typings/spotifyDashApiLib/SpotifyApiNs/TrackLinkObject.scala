package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Track Link Object
  * [](https://developer.spotify.com/web-api/object-model/#track-object-simplified)
  */
trait TrackLinkObject extends js.Object {
  var external_urls: ExternalUrlObject
  var href: java.lang.String
  var id: java.lang.String
  var `type`: spotifyDashApiLib.spotifyDashApiLibStrings.track
  var uri: java.lang.String
}

object TrackLinkObject {
  @scala.inline
  def apply(
    external_urls: ExternalUrlObject,
    href: java.lang.String,
    id: java.lang.String,
    `type`: spotifyDashApiLib.spotifyDashApiLibStrings.track,
    uri: java.lang.String
  ): TrackLinkObject = {
    val __obj = js.Dynamic.literal(external_urls = external_urls, href = href, id = id, uri = uri)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TrackLinkObject]
  }
}

