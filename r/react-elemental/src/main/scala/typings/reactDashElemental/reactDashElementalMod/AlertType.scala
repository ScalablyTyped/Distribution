package typings.reactDashElemental.reactDashElementalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashElemental.reactDashElementalStrings.info
  - typings.reactDashElemental.reactDashElementalStrings.success
  - typings.reactDashElemental.reactDashElementalStrings.warn
  - typings.reactDashElemental.reactDashElementalStrings.error
*/
trait AlertType extends js.Object

object AlertType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.reactDashElemental.reactDashElementalStrings.error = this.cast("error")
  @scala.inline
  def info: typings.reactDashElemental.reactDashElementalStrings.info = this.cast("info")
  @scala.inline
  def success: typings.reactDashElemental.reactDashElementalStrings.success = this.cast("success")
  @scala.inline
  def warn: typings.reactDashElemental.reactDashElementalStrings.warn = this.cast("warn")
}

