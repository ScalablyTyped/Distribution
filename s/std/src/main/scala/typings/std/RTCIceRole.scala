package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.controlled
  - typings.std.stdStrings.controlling
  - typings.std.stdStrings.unknown
*/
trait RTCIceRole extends js.Object

object RTCIceRole {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def controlled: typings.std.stdStrings.controlled = this.cast("controlled")
  @scala.inline
  def controlling: typings.std.stdStrings.controlling = this.cast("controlling")
  @scala.inline
  def unknown: typings.std.stdStrings.unknown = this.cast("unknown")
}

