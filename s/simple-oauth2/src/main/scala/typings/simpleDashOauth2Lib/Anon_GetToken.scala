package typings
package simpleDashOauth2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetToken extends js.Object {
  /** Returns the Access Token Object */
  def getToken(params: simpleDashOauth2Lib.simpleDashOauth2Mod.PasswordTokenConfig): js.Promise[simpleDashOauth2Lib.simpleDashOauth2Mod.Token]
}

object Anon_GetToken {
  @scala.inline
  def apply(
    getToken: js.Function1[
      simpleDashOauth2Lib.simpleDashOauth2Mod.PasswordTokenConfig, 
      js.Promise[simpleDashOauth2Lib.simpleDashOauth2Mod.Token]
    ]
  ): Anon_GetToken = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getToken")(getToken)
    __obj.asInstanceOf[Anon_GetToken]
  }
}

