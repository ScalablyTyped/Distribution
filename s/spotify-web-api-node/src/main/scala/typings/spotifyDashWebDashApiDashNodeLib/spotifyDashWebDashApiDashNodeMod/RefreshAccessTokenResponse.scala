package typings
package spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshAccessTokenResponse extends js.Object {
  var access_token: java.lang.String
  var expires_in: scala.Double
  var scope: java.lang.String
  var token_type: java.lang.String
}

object RefreshAccessTokenResponse {
  @scala.inline
  def apply(
    access_token: java.lang.String,
    expires_in: scala.Double,
    scope: java.lang.String,
    token_type: java.lang.String
  ): RefreshAccessTokenResponse = {
    val __obj = js.Dynamic.literal(access_token = access_token, expires_in = expires_in, scope = scope, token_type = token_type)
  
    __obj.asInstanceOf[RefreshAccessTokenResponse]
  }
}

