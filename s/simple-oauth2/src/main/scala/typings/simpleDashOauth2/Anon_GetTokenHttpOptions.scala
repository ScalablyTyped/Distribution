package typings.simpleDashOauth2

import typings.simpleDashOauth2.simpleDashOauth2Mod.ClientCredentialTokenConfig
import typings.simpleDashOauth2.simpleDashOauth2Mod.Token
import typings.simpleDashOauth2.simpleDashOauth2Mod.WreckHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_GetTokenHttpOptions extends js.Object {
  /** Returns the Access Token Object */
  def getToken(params: ClientCredentialTokenConfig): js.Promise[Token] = js.native
  def getToken(params: ClientCredentialTokenConfig, httpOptions: WreckHttpOptions): js.Promise[Token] = js.native
}

