package typings.reactToastNotifications.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactToastNotifications.reactToastNotificationsStrings.entering
  - typings.reactToastNotifications.reactToastNotificationsStrings.entered
  - typings.reactToastNotifications.reactToastNotificationsStrings.exiting
  - typings.reactToastNotifications.reactToastNotificationsStrings.exited
*/
trait TransitionState extends js.Object

object TransitionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def entered: typings.reactToastNotifications.reactToastNotificationsStrings.entered = this.cast("entered")
  @scala.inline
  def entering: typings.reactToastNotifications.reactToastNotificationsStrings.entering = this.cast("entering")
  @scala.inline
  def exited: typings.reactToastNotifications.reactToastNotificationsStrings.exited = this.cast("exited")
  @scala.inline
  def exiting: typings.reactToastNotifications.reactToastNotificationsStrings.exiting = this.cast("exiting")
}

