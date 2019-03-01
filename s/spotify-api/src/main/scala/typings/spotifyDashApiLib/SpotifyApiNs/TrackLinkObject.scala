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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("external_urls")(external_urls)
    __obj.updateDynamic("href")(href)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[TrackLinkObject]
  }
}

