package typings.spotifyWebApiJs.SpotifyApi

import typings.spotifyWebApiJs.spotifyWebApiJsStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * User Object (Private)
  * [](https://developer.spotify.com/web-api/object-model/#track-object-simplified)
  */
trait UserObjectPrivate extends UserObjectPublic {
  var birthdate: String
  var country: String
  var email: String
  var product: String
}

object UserObjectPrivate {
  @scala.inline
  def apply(
    birthdate: String,
    country: String,
    email: String,
    external_urls: ExternalUrlObject,
    href: String,
    id: String,
    product: String,
    `type`: user,
    uri: String,
    display_name: String = null,
    followers: FollowersObject = null,
    images: js.Array[ImageObject] = null
  ): UserObjectPrivate = {
    val __obj = js.Dynamic.literal(birthdate = birthdate.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (display_name != null) __obj.updateDynamic("display_name")(display_name.asInstanceOf[js.Any])
    if (followers != null) __obj.updateDynamic("followers")(followers.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserObjectPrivate]
  }
}

