package typings.reactAlert.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactAlert.reactAlertStrings.fade
  - typings.reactAlert.reactAlertStrings.scale
*/
trait AlertTransition extends js.Object

object AlertTransition {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fade: typings.reactAlert.reactAlertStrings.fade = this.cast("fade")
  @scala.inline
  def scale: typings.reactAlert.reactAlertStrings.scale = this.cast("scale")
}

