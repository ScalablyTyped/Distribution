package typings.simpleDashOauth2

import typings.simpleDashOauth2.simpleDashOauth2Mod.AccessToken
import typings.simpleDashOauth2.simpleDashOauth2Mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Create extends js.Object {
  /** Creates an OAuth2.AccessToken instance */
  def create(tokenToUse: Token): AccessToken
}

object Anon_Create {
  @scala.inline
  def apply(create: Token => AccessToken): Anon_Create = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
  
    __obj.asInstanceOf[Anon_Create]
  }
}

