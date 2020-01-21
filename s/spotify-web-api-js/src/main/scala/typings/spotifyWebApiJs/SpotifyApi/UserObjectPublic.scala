package typings.spotifyWebApiJs.SpotifyApi

import typings.spotifyWebApiJs.spotifyWebApiJsStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * User Object (Public)
  * [](https://developer.spotify.com/web-api/object-model/#track-object-simplified)
  */
trait UserObjectPublic extends js.Object {
  var display_name: js.UndefOr[String] = js.undefined
  var external_urls: ExternalUrlObject
  var followers: js.UndefOr[FollowersObject] = js.undefined
  var href: String
  var id: String
  var images: js.UndefOr[js.Array[ImageObject]] = js.undefined
  var `type`: user
  var uri: String
}

object UserObjectPublic {
  @scala.inline
  def apply(
    external_urls: ExternalUrlObject,
    href: String,
    id: String,
    `type`: user,
    uri: String,
    display_name: String = null,
    followers: FollowersObject = null,
    images: js.Array[ImageObject] = null
  ): UserObjectPublic = {
    val __obj = js.Dynamic.literal(external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (display_name != null) __obj.updateDynamic("display_name")(display_name.asInstanceOf[js.Any])
    if (followers != null) __obj.updateDynamic("followers")(followers.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserObjectPublic]
  }
}

