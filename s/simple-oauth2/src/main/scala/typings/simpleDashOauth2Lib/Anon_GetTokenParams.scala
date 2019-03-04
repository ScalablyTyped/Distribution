package typings
package simpleDashOauth2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetTokenParams extends js.Object {
  /** Returns the Access Token Object */
  def getToken(params: simpleDashOauth2Lib.simpleDashOauth2Mod.ClientCredentialTokenConfig): js.Promise[simpleDashOauth2Lib.simpleDashOauth2Mod.Token]
}

object Anon_GetTokenParams {
  @scala.inline
  def apply(
    getToken: js.Function1[
      simpleDashOauth2Lib.simpleDashOauth2Mod.ClientCredentialTokenConfig, 
      js.Promise[simpleDashOauth2Lib.simpleDashOauth2Mod.Token]
    ]
  ): Anon_GetTokenParams = {
    val __obj = js.Dynamic.literal(getToken = getToken)
  
    __obj.asInstanceOf[Anon_GetTokenParams]
  }
}

