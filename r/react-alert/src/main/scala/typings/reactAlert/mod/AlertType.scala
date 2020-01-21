package typings.reactAlert.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactAlert.reactAlertStrings.info
  - typings.reactAlert.reactAlertStrings.success
  - typings.reactAlert.reactAlertStrings.error
*/
trait AlertType extends js.Object

object AlertType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.reactAlert.reactAlertStrings.error = this.cast("error")
  @scala.inline
  def info: typings.reactAlert.reactAlertStrings.info = this.cast("info")
  @scala.inline
  def success: typings.reactAlert.reactAlertStrings.success = this.cast("success")
}

