package typings.simpleOauth2.anon

import typings.simpleOauth2.mod.PasswordTokenConfig
import typings.simpleOauth2.mod.Token
import typings.simpleOauth2.mod.WreckHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetToken extends js.Object {
  /** Returns the Access Token Object */
  def getToken(params: PasswordTokenConfig): js.Promise[Token] = js.native
  def getToken(params: PasswordTokenConfig, httpOptions: WreckHttpOptions): js.Promise[Token] = js.native
}

