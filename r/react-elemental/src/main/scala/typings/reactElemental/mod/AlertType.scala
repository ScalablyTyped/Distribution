package typings.reactElemental.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactElemental.reactElementalStrings.info
  - typings.reactElemental.reactElementalStrings.success
  - typings.reactElemental.reactElementalStrings.warn
  - typings.reactElemental.reactElementalStrings.error
*/
trait AlertType extends js.Object

object AlertType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.reactElemental.reactElementalStrings.error = this.cast("error")
  @scala.inline
  def info: typings.reactElemental.reactElementalStrings.info = this.cast("info")
  @scala.inline
  def success: typings.reactElemental.reactElementalStrings.success = this.cast("success")
  @scala.inline
  def warn: typings.reactElemental.reactElementalStrings.warn = this.cast("warn")
}

