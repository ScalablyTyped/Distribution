package typings.reactToastify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactToastify.reactToastifyStrings.info
  - typings.reactToastify.reactToastifyStrings.success
  - typings.reactToastify.reactToastifyStrings.warning
  - typings.reactToastify.reactToastifyStrings.error
  - typings.reactToastify.reactToastifyStrings.default
*/
trait TypeOptions extends js.Object

object TypeOptions {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typings.reactToastify.reactToastifyStrings.default = this.cast("default")
  @scala.inline
  def error: typings.reactToastify.reactToastifyStrings.error = this.cast("error")
  @scala.inline
  def info: typings.reactToastify.reactToastifyStrings.info = this.cast("info")
  @scala.inline
  def success: typings.reactToastify.reactToastifyStrings.success = this.cast("success")
  @scala.inline
  def warning: typings.reactToastify.reactToastifyStrings.warning = this.cast("warning")
}

