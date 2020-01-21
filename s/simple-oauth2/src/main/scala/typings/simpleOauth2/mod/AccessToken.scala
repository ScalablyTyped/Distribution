package typings.simpleOauth2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessToken extends js.Object {
  var token: Token = js.native
  /** Check if the access token is expired or not */
  def expired(): Boolean = js.native
  /** Refresh the access token */
  def refresh(): js.Promise[AccessToken] = js.native
  def refresh(params: js.Object): js.Promise[AccessToken] = js.native
  /** Revoke access or refresh token */
  def revoke(tokenType: TokenType): js.Promise[Unit] = js.native
  /** Revoke both the existing access and refresh tokens */
  def revokeAll(): js.Promise[Unit] = js.native
}

