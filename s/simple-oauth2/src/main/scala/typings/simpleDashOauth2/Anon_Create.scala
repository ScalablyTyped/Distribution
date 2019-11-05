package typings.simpleDashOauth2

import typings.simpleDashOauth2.simpleDashOauth2Mod.AccessToken
import typings.simpleDashOauth2.simpleDashOauth2Mod.Token
import typings.simpleDashOauth2.simpleDashOauth2Mod.WreckHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Create extends js.Object {
  /** Creates an OAuth2.AccessToken instance */
  def create(tokenToUse: Token): AccessToken = js.native
  def create(tokenToUse: Token, httpOptions: WreckHttpOptions): AccessToken = js.native
}

