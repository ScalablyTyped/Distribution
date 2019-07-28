package typings.simpleDashOauth2

import typings.simpleDashOauth2.simpleDashOauth2Mod.PasswordTokenConfig
import typings.simpleDashOauth2.simpleDashOauth2Mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetToken extends js.Object {
  /** Returns the Access Token Object */
  def getToken(params: PasswordTokenConfig): js.Promise[Token]
}

object Anon_GetToken {
  @scala.inline
  def apply(getToken: PasswordTokenConfig => js.Promise[Token]): Anon_GetToken = {
    val __obj = js.Dynamic.literal(getToken = js.Any.fromFunction1(getToken))
  
    __obj.asInstanceOf[Anon_GetToken]
  }
}

