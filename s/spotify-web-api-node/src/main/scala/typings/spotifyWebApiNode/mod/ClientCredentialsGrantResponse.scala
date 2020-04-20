package typings.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response returned when using Client Credentials authentication flow
  * https://developer.spotify.com/documentation/general/guides/authorization-guide/#example-4
  */
trait ClientCredentialsGrantResponse extends js.Object {
  var access_token: String
  var expires_in: Double
  var token_type: String
}

object ClientCredentialsGrantResponse {
  @scala.inline
  def apply(access_token: String, expires_in: Double, token_type: String): ClientCredentialsGrantResponse = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCredentialsGrantResponse]
  }
}

