package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * User Object (Private)
  * [](https://developer.spotify.com/web-api/object-model/#track-object-simplified)
  */
trait UserObjectPrivate
  extends StObject
     with UserObjectPublic {
  
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
    uri: String
  ): UserObjectPrivate = {
    val __obj = js.Dynamic.literal(birthdate = birthdate.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("user")
    __obj.asInstanceOf[UserObjectPrivate]
  }
  
  @scala.inline
  implicit class UserObjectPrivateMutableBuilder[Self <: UserObjectPrivate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBirthdate(value: String): Self = StObject.set(x, "birthdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
  }
}
