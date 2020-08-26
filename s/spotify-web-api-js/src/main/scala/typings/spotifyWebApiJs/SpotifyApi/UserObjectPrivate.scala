package typings.spotifyWebApiJs.SpotifyApi

import typings.spotifyWebApiJs.spotifyWebApiJsStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * User Object (Private)
  * [](https://developer.spotify.com/web-api/object-model/#track-object-simplified)
  */
@js.native
trait UserObjectPrivate extends UserObjectPublic {
  var birthdate: String = js.native
  var country: String = js.native
  var email: String = js.native
  var product: String = js.native
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
    uri: String
  ): UserObjectPrivate = {
    val __obj = js.Dynamic.literal(birthdate = birthdate.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserObjectPrivate]
  }
  @scala.inline
  implicit class UserObjectPrivateOps[Self <: UserObjectPrivate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBirthdate(value: String): Self = this.set("birthdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setProduct(value: String): Self = this.set("product", value.asInstanceOf[js.Any])
  }
  
}

