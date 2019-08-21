package typings.spotifyDashWebDashApiDashNode.spotifyDashWebDashApiDashNodeMod

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
    val __obj = js.Dynamic.literal(access_token = access_token, expires_in = expires_in, token_type = token_type)
  
    __obj.asInstanceOf[ClientCredentialsGrantResponse]
  }
}

