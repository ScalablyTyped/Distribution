package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * User Object (Public)
     * [](https://developer.spotify.com/web-api/object-model/#track-object-simplified)
     */

trait UserObjectPublic extends js.Object {
  var display_name: js.UndefOr[java.lang.String] = js.undefined
  var external_urls: ExternalUrlObject
  var followers: js.UndefOr[FollowersObject] = js.undefined
  var href: java.lang.String
  var id: java.lang.String
  var images: js.UndefOr[js.Array[ImageObject]] = js.undefined
  var `type`: spotifyDashApiLib.spotifyDashApiLibStrings.user
  var uri: java.lang.String
}

