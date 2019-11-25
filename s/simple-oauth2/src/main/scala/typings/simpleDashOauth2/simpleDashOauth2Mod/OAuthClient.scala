package typings.simpleDashOauth2.simpleDashOauth2Mod

import typings.simpleDashOauth2.Anon_AuthorizeURL
import typings.simpleDashOauth2.Anon_Create
import typings.simpleDashOauth2.Anon_GetToken
import typings.simpleDashOauth2.Anon_GetTokenHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthClient[ClientIdName /* <: String */] extends js.Object {
  var accessToken: Anon_Create
  var authorizationCode: Anon_AuthorizeURL[ClientIdName]
  var clientCredentials: Anon_GetTokenHttpOptions
  var ownerPassword: Anon_GetToken
}

object OAuthClient {
  @scala.inline
  def apply[ClientIdName /* <: String */](
    accessToken: Anon_Create,
    authorizationCode: Anon_AuthorizeURL[ClientIdName],
    clientCredentials: Anon_GetTokenHttpOptions,
    ownerPassword: Anon_GetToken
  ): OAuthClient[ClientIdName] = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], authorizationCode = authorizationCode.asInstanceOf[js.Any], clientCredentials = clientCredentials.asInstanceOf[js.Any], ownerPassword = ownerPassword.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OAuthClient[ClientIdName]]
  }
}

