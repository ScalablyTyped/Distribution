package typings
package simpleDashOauth2Lib.simpleDashOauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OAuthClient[ClientIdName /* <: java.lang.String */] extends js.Object {
  var accessToken: simpleDashOauth2Lib.Anon_Create
  var authorizationCode: simpleDashOauth2Lib.Anon_AuthorizeURL[ClientIdName]
  var clientCredentials: simpleDashOauth2Lib.Anon_GetToken
  var ownerPassword: simpleDashOauth2Lib.Anon_GetTokenParams
}

