package typings.simpleOauth2.anon

import typings.simpleOauth2.mod.AccessToken
import typings.simpleOauth2.mod.Token
import typings.simpleOauth2.mod.WreckHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Create extends js.Object {
  /** Creates an OAuth2.AccessToken instance */
  def create(tokenToUse: Token): AccessToken = js.native
  def create(tokenToUse: Token, httpOptions: WreckHttpOptions): AccessToken = js.native
}

