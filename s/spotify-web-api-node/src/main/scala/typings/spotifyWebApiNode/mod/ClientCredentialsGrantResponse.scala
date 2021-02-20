package typings.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response returned when using Client Credentials authentication flow
  * https://developer.spotify.com/documentation/general/guides/authorization-guide/#example-4
  */
@js.native
trait ClientCredentialsGrantResponse extends StObject {
  
  var access_token: String = js.native
  
  var expires_in: Double = js.native
  
  var token_type: String = js.native
}
object ClientCredentialsGrantResponse {
  
  @scala.inline
  def apply(access_token: String, expires_in: Double, token_type: String): ClientCredentialsGrantResponse = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCredentialsGrantResponse]
  }
  
  @scala.inline
  implicit class ClientCredentialsGrantResponseMutableBuilder[Self <: ClientCredentialsGrantResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
  }
}
