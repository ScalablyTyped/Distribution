package typings
package simpleDashOauth2Lib.simpleDashOauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthClient[ClientIdName /* <: java.lang.String */] extends js.Object {
  var accessToken: simpleDashOauth2Lib.Anon_Create
  var authorizationCode: simpleDashOauth2Lib.Anon_AuthorizeURL[ClientIdName]
  var clientCredentials: simpleDashOauth2Lib.Anon_GetTokenParams
  var ownerPassword: simpleDashOauth2Lib.Anon_GetToken
}

object OAuthClient {
  @scala.inline
  def apply[ClientIdName /* <: java.lang.String */](
    accessToken: simpleDashOauth2Lib.Anon_Create,
    authorizationCode: simpleDashOauth2Lib.Anon_AuthorizeURL[ClientIdName],
    clientCredentials: simpleDashOauth2Lib.Anon_GetTokenParams,
    ownerPassword: simpleDashOauth2Lib.Anon_GetToken
  ): OAuthClient[ClientIdName] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessToken")(accessToken)
    __obj.updateDynamic("authorizationCode")(authorizationCode)
    __obj.updateDynamic("clientCredentials")(clientCredentials)
    __obj.updateDynamic("ownerPassword")(ownerPassword)
    __obj.asInstanceOf[OAuthClient[ClientIdName]]
  }
}

