package typings
package spotifyDashWebDashApiDashNodeLib.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientCredentialsGrantResponse extends js.Object {
  var access_token: java.lang.String
  var expires_in: scala.Double
  var token_type: java.lang.String
}

object ClientCredentialsGrantResponse {
  @scala.inline
  def apply(access_token: java.lang.String, expires_in: scala.Double, token_type: java.lang.String): ClientCredentialsGrantResponse = {
    val __obj = js.Dynamic.literal(access_token = access_token, expires_in = expires_in, token_type = token_type)
  
    __obj.asInstanceOf[ClientCredentialsGrantResponse]
  }
}

