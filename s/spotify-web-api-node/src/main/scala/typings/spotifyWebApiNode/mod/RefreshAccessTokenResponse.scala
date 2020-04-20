package typings.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response returned when requesting new access token (via refresh token)
  * https://developer.spotify.com/documentation/general/guides/authorization-guide/#4-requesting-a-refreshed-access-token-spotify-returns-a-new-access-token-to-your-app
  */
trait RefreshAccessTokenResponse extends js.Object {
  var access_token: String
  var expires_in: Double
  var scope: String
  var token_type: String
}

object RefreshAccessTokenResponse {
  @scala.inline
  def apply(access_token: String, expires_in: Double, scope: String, token_type: String): RefreshAccessTokenResponse = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshAccessTokenResponse]
  }
}

