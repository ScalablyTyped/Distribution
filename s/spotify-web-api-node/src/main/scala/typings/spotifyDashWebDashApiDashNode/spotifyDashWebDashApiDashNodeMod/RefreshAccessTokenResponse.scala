package typings.spotifyDashWebDashApiDashNode.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshAccessTokenResponse extends js.Object {
  var access_token: String
  var expires_in: Double
  var scope: String
  var token_type: String
}

object RefreshAccessTokenResponse {
  @scala.inline
  def apply(access_token: String, expires_in: Double, scope: String, token_type: String): RefreshAccessTokenResponse = {
    val __obj = js.Dynamic.literal(access_token = access_token, expires_in = expires_in, scope = scope, token_type = token_type)
  
    __obj.asInstanceOf[RefreshAccessTokenResponse]
  }
}

