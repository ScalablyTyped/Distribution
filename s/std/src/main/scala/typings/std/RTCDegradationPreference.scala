package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.`maintain-framerate`
  - typings.std.stdStrings.`maintain-resolution`
  - typings.std.stdStrings.balanced
*/
trait RTCDegradationPreference extends js.Object

object RTCDegradationPreference {
  @scala.inline
  def balanced: typings.std.stdStrings.balanced = this.cast("balanced")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `maintain-framerate`: typings.std.stdStrings.`maintain-framerate` = this.cast("maintain-framerate")
  @scala.inline
  def `maintain-resolution`: typings.std.stdStrings.`maintain-resolution` = this.cast("maintain-resolution")
}

