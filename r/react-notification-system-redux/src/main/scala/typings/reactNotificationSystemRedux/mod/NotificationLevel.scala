package typings.reactNotificationSystemRedux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.error
  - typings.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.warning
  - typings.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.info
  - typings.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.success
*/
trait NotificationLevel extends js.Object

object NotificationLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.error = this.cast("error")
  @scala.inline
  def info: typings.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.info = this.cast("info")
  @scala.inline
  def success: typings.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.success = this.cast("success")
  @scala.inline
  def warning: typings.reactNotificationSystemRedux.reactNotificationSystemReduxStrings.warning = this.cast("warning")
}

