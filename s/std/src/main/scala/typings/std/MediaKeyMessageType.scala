package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.`license-request`
  - typings.std.stdStrings.`license-renewal`
  - typings.std.stdStrings.`license-release`
  - typings.std.stdStrings.`individualization-request`
*/
trait MediaKeyMessageType extends js.Object

object MediaKeyMessageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `individualization-request`: typings.std.stdStrings.`individualization-request` = this.cast("individualization-request")
  @scala.inline
  def `license-release`: typings.std.stdStrings.`license-release` = this.cast("license-release")
  @scala.inline
  def `license-renewal`: typings.std.stdStrings.`license-renewal` = this.cast("license-renewal")
  @scala.inline
  def `license-request`: typings.std.stdStrings.`license-request` = this.cast("license-request")
}

