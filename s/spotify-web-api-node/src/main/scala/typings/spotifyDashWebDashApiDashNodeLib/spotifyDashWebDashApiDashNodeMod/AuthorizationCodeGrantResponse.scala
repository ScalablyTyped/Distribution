package typings
package spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationCodeGrantResponse extends js.Object {
  var access_token: java.lang.String
  var expires_in: scala.Double
  var refresh_token: java.lang.String
  var scope: java.lang.String
  var token_type: java.lang.String
}

object AuthorizationCodeGrantResponse {
  @scala.inline
  def apply(
    access_token: java.lang.String,
    expires_in: scala.Double,
    refresh_token: java.lang.String,
    scope: java.lang.String,
    token_type: java.lang.String
  ): AuthorizationCodeGrantResponse = {
    val __obj = js.Dynamic.literal(access_token = access_token, expires_in = expires_in, refresh_token = refresh_token, scope = scope, token_type = token_type)
  
    __obj.asInstanceOf[AuthorizationCodeGrantResponse]
  }
}

