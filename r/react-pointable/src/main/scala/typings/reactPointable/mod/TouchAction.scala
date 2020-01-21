package typings.reactPointable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactPointable.reactPointableStrings.auto
  - typings.reactPointable.reactPointableStrings.none
  - typings.reactPointable.reactPointableStrings.`pan-x`
  - typings.reactPointable.reactPointableStrings.`pan-y`
  - typings.reactPointable.reactPointableStrings.manipulation
*/
trait TouchAction extends js.Object

object TouchAction {
  @scala.inline
  def auto: typings.reactPointable.reactPointableStrings.auto = this.cast("auto")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def manipulation: typings.reactPointable.reactPointableStrings.manipulation = this.cast("manipulation")
  @scala.inline
  def none: typings.reactPointable.reactPointableStrings.none = this.cast("none")
  @scala.inline
  def `pan-x`: typings.reactPointable.reactPointableStrings.`pan-x` = this.cast("pan-x")
  @scala.inline
  def `pan-y`: typings.reactPointable.reactPointableStrings.`pan-y` = this.cast("pan-y")
}

