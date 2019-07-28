package typings.spotifyDashApi.SpotifyApiNs

import typings.spotifyDashApi.spotifyDashApiStrings.user
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
    val __obj = js.Dynamic.literal(birthdate = birthdate, country = country, email = email, external_urls = external_urls, href = href, id = id, product = product, uri = uri)
    __obj.updateDynamic("type")(`type`)
    if (display_name != null) __obj.updateDynamic("display_name")(display_name)
    if (followers != null) __obj.updateDynamic("followers")(followers)
    if (images != null) __obj.updateDynamic("images")(images)
    __obj.asInstanceOf[UserObjectPrivate]
  }
}

