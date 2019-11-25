package typings.scrollDashIntoDashView.__ScrollIntoView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** type will be 'complete' if the scroll completed or 'canceled' if the current scroll was canceled by a new scroll */
/* Rewritten from type alias, can be one of: 
  - typings.scrollDashIntoDashView.scrollDashIntoDashViewStrings.complete
  - typings.scrollDashIntoDashView.scrollDashIntoDashViewStrings.canceled
*/
trait callbackParameterType extends js.Object

object callbackParameterType {
  @scala.inline
  def canceled: typings.scrollDashIntoDashView.scrollDashIntoDashViewStrings.canceled = this.cast("canceled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typings.scrollDashIntoDashView.scrollDashIntoDashViewStrings.complete = this.cast("complete")
}

