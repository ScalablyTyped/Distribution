package typings.spotifyDashApi.SpotifyApiNs

import typings.spotifyDashApi.spotifyDashApiStrings.track
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Track Link Object
  * [](https://developer.spotify.com/web-api/object-model/#track-object-simplified)
  */
trait TrackLinkObject extends js.Object {
  var external_urls: ExternalUrlObject
  var href: String
  var id: String
  var `type`: track
  var uri: String
}

object TrackLinkObject {
  @scala.inline
  def apply(external_urls: ExternalUrlObject, href: String, id: String, `type`: track, uri: String): TrackLinkObject = {
    val __obj = js.Dynamic.literal(external_urls = external_urls, href = href, id = id, uri = uri)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TrackLinkObject]
  }
}

