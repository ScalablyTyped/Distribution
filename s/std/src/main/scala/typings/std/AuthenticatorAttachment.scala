package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.platform
  - typings.std.stdStrings.`cross-platform`
*/
trait AuthenticatorAttachment extends js.Object

object AuthenticatorAttachment {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `cross-platform`: typings.std.stdStrings.`cross-platform` = this.cast("cross-platform")
  @scala.inline
  def platform: typings.std.stdStrings.platform = this.cast("platform")
}

