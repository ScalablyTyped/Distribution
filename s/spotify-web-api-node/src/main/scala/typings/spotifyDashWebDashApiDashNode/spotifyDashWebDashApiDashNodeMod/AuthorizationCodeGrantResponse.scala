package typings.spotifyDashWebDashApiDashNode.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationCodeGrantResponse extends js.Object {
  var access_token: String
  var expires_in: Double
  var refresh_token: String
  var scope: String
  var token_type: String
}

object AuthorizationCodeGrantResponse {
  @scala.inline
  def apply(access_token: String, expires_in: Double, refresh_token: String, scope: String, token_type: String): AuthorizationCodeGrantResponse = {
    val __obj = js.Dynamic.literal(access_token = access_token, expires_in = expires_in, refresh_token = refresh_token, scope = scope, token_type = token_type)
  
    __obj.asInstanceOf[AuthorizationCodeGrantResponse]
  }
}

