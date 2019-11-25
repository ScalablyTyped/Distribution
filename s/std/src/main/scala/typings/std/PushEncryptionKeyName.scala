package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.p256dh
  - typings.std.stdStrings.auth
*/
trait PushEncryptionKeyName extends js.Object

object PushEncryptionKeyName {
  @scala.inline
  def auth: typings.std.stdStrings.auth = this.cast("auth")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def p256dh: typings.std.stdStrings.p256dh = this.cast("p256dh")
}

