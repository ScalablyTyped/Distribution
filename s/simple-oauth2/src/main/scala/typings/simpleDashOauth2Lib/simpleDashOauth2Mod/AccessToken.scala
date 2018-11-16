package typings
package simpleDashOauth2Lib.simpleDashOauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessToken extends js.Object {
  var token: Token = js.native
  /** Check if the access token is expired or not */
  def expired(): scala.Boolean = js.native
  /** Refresh the access token */
  def refresh(): stdLib.Promise[AccessToken] = js.native
  /** Refresh the access token */
  def refresh(params: js.Object): stdLib.Promise[AccessToken] = js.native
  /** Revoke access or refresh token */
  def revoke(tokenType: TokenType): stdLib.Promise[scala.Unit] = js.native
  /** Revoke both the existing access and refresh tokens */
  def revokeAll(): stdLib.Promise[scala.Unit] = js.native
}

