package typings
package spotifyDashWebDashApiDashJsLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * User Object (Private)
  * [](https://developer.spotify.com/web-api/object-model/#track-object-simplified)
  */
trait UserObjectPrivate extends UserObjectPublic {
  var birthdate: java.lang.String
  var country: java.lang.String
  var email: java.lang.String
  var product: java.lang.String
}

object UserObjectPrivate {
  @scala.inline
  def apply(
    birthdate: java.lang.String,
    country: java.lang.String,
    email: java.lang.String,
    external_urls: ExternalUrlObject,
    href: java.lang.String,
    id: java.lang.String,
    product: java.lang.String,
    `type`: spotifyDashWebDashApiDashJsLib.spotifyDashWebDashApiDashJsLibStrings.user,
    uri: java.lang.String,
    display_name: java.lang.String = null,
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

