package typings.spotifyDashWebDashApiDashJs.SpotifyApi

import typings.spotifyDashWebDashApiDashJs.spotifyDashWebDashApiDashJsStrings.track
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
    val __obj = js.Dynamic.literal(external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackLinkObject]
  }
}

