package typings.simpleOauth2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessToken extends js.Object {
  /**
    * Immutable object containing the token object provided while constructing a new access token instance.
    * This property will usually have the schema as specified by RFC6750,
    * but the exact properties may vary between authorization servers.
    */
  var token: Token = js.native
  /**
    * Determines if the current access token is definitely expired or not
    * @param expirationWindowSeconds Window of time before the actual expiration to refresh the token. Defaults to 0.
    */
  def expired(): Boolean = js.native
  def expired(expirationWindowSeconds: Double): Boolean = js.native
  /** Refresh the access token */
  def refresh(): js.Promise[AccessToken] = js.native
  def refresh(params: js.Object): js.Promise[AccessToken] = js.native
  /** Revoke access or refresh token */
  def revoke(tokenType: TokenType): js.Promise[Unit] = js.native
  /** Revoke both the existing access and refresh tokens */
  def revokeAll(): js.Promise[Unit] = js.native
}

