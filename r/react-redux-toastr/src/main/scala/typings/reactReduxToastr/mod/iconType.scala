package typings.reactReduxToastr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactReduxToastr.reactReduxToastrStrings.success
  - typings.reactReduxToastr.reactReduxToastrStrings.info
  - typings.reactReduxToastr.reactReduxToastrStrings.warning
  - typings.reactReduxToastr.reactReduxToastrStrings.error
*/
trait iconType extends js.Object

object iconType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.reactReduxToastr.reactReduxToastrStrings.error = this.cast("error")
  @scala.inline
  def info: typings.reactReduxToastr.reactReduxToastrStrings.info = this.cast("info")
  @scala.inline
  def success: typings.reactReduxToastr.reactReduxToastrStrings.success = this.cast("success")
  @scala.inline
  def warning: typings.reactReduxToastr.reactReduxToastrStrings.warning = this.cast("warning")
}

