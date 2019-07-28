package typings.simpleDashOauth2.simpleDashOauth2Mod

import typings.simpleDashOauth2.Anon_AuthorizeURL
import typings.simpleDashOauth2.Anon_Create
import typings.simpleDashOauth2.Anon_GetToken
import typings.simpleDashOauth2.Anon_GetTokenParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthClient[ClientIdName /* <: String */] extends js.Object {
  var accessToken: Anon_Create
  var authorizationCode: Anon_AuthorizeURL[ClientIdName]
  var clientCredentials: Anon_GetTokenParams
  var ownerPassword: Anon_GetToken
}

object OAuthClient {
  @scala.inline
  def apply[ClientIdName /* <: String */](
    accessToken: Anon_Create,
    authorizationCode: Anon_AuthorizeURL[ClientIdName],
    clientCredentials: Anon_GetTokenParams,
    ownerPassword: Anon_GetToken
  ): OAuthClient[ClientIdName] = {
    val __obj = js.Dynamic.literal(accessToken = accessToken, authorizationCode = authorizationCode, clientCredentials = clientCredentials, ownerPassword = ownerPassword)
  
    __obj.asInstanceOf[OAuthClient[ClientIdName]]
  }
}

