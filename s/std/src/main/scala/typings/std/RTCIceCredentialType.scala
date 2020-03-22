package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.oauth
  - typings.std.stdStrings.password
*/
trait RTCIceCredentialType extends js.Object

object RTCIceCredentialType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def oauth: typings.std.stdStrings.oauth = this.cast("oauth")
  @scala.inline
  def password: typings.std.stdStrings.password = this.cast("password")
}

