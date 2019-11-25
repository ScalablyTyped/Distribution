package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.`portrait-primary`
  - typings.std.stdStrings.`portrait-secondary`
  - typings.std.stdStrings.`landscape-primary`
  - typings.std.stdStrings.`landscape-secondary`
*/
trait OrientationType extends js.Object

object OrientationType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `landscape-primary`: typings.std.stdStrings.`landscape-primary` = this.cast("landscape-primary")
  @scala.inline
  def `landscape-secondary`: typings.std.stdStrings.`landscape-secondary` = this.cast("landscape-secondary")
  @scala.inline
  def `portrait-primary`: typings.std.stdStrings.`portrait-primary` = this.cast("portrait-primary")
  @scala.inline
  def `portrait-secondary`: typings.std.stdStrings.`portrait-secondary` = this.cast("portrait-secondary")
}

