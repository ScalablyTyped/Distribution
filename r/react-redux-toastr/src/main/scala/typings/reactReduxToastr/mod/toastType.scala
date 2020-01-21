package typings.reactReduxToastr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactReduxToastr.reactReduxToastrStrings.success
  - typings.reactReduxToastr.reactReduxToastrStrings.info
  - typings.reactReduxToastr.reactReduxToastrStrings.warning
  - typings.reactReduxToastr.reactReduxToastrStrings.light
  - typings.reactReduxToastr.reactReduxToastrStrings.error
  - typings.reactReduxToastr.reactReduxToastrStrings.confirm
  - typings.reactReduxToastr.reactReduxToastrStrings.message
*/
trait toastType extends js.Object

object toastType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def confirm: typings.reactReduxToastr.reactReduxToastrStrings.confirm = this.cast("confirm")
  @scala.inline
  def error: typings.reactReduxToastr.reactReduxToastrStrings.error = this.cast("error")
  @scala.inline
  def info: typings.reactReduxToastr.reactReduxToastrStrings.info = this.cast("info")
  @scala.inline
  def light: typings.reactReduxToastr.reactReduxToastrStrings.light = this.cast("light")
  @scala.inline
  def message: typings.reactReduxToastr.reactReduxToastrStrings.message = this.cast("message")
  @scala.inline
  def success: typings.reactReduxToastr.reactReduxToastrStrings.success = this.cast("success")
  @scala.inline
  def warning: typings.reactReduxToastr.reactReduxToastrStrings.warning = this.cast("warning")
}

