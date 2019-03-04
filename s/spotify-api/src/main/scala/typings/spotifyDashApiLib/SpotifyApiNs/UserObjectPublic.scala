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

object UserObjectPublic {
  @scala.inline
  def apply(
    external_urls: ExternalUrlObject,
    href: java.lang.String,
    id: java.lang.String,
    `type`: spotifyDashApiLib.spotifyDashApiLibStrings.user,
    uri: java.lang.String,
    display_name: java.lang.String = null,
    followers: FollowersObject = null,
    images: js.Array[ImageObject] = null
  ): UserObjectPublic = {
    val __obj = js.Dynamic.literal(external_urls = external_urls, href = href, id = id, uri = uri)
    __obj.updateDynamic("type")(`type`)
    if (display_name != null) __obj.updateDynamic("display_name")(display_name)
    if (followers != null) __obj.updateDynamic("followers")(followers)
    if (images != null) __obj.updateDynamic("images")(images)
    __obj.asInstanceOf[UserObjectPublic]
  }
}

