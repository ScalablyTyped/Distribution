package typings.simpleDashOauth2

import typings.simpleDashOauth2.simpleDashOauth2Mod.ClientCredentialTokenConfig
import typings.simpleDashOauth2.simpleDashOauth2Mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetTokenParams extends js.Object {
  /** Returns the Access Token Object */
  def getToken(params: ClientCredentialTokenConfig): js.Promise[Token]
}

object Anon_GetTokenParams {
  @scala.inline
  def apply(getToken: ClientCredentialTokenConfig => js.Promise[Token]): Anon_GetTokenParams = {
    val __obj = js.Dynamic.literal(getToken = js.Any.fromFunction1(getToken))
  
    __obj.asInstanceOf[Anon_GetTokenParams]
  }
}

