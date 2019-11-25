package typings.reactDashNavigation.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashNavigation.reactDashNavigationStrings.willFocus
  - typings.reactDashNavigation.reactDashNavigationStrings.didFocus
  - typings.reactDashNavigation.reactDashNavigationStrings.willBlur
  - typings.reactDashNavigation.reactDashNavigationStrings.didBlur
  - typings.reactDashNavigation.reactDashNavigationStrings.action
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  def action: typings.reactDashNavigation.reactDashNavigationStrings.action = this.cast("action")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def didBlur: typings.reactDashNavigation.reactDashNavigationStrings.didBlur = this.cast("didBlur")
  @scala.inline
  def didFocus: typings.reactDashNavigation.reactDashNavigationStrings.didFocus = this.cast("didFocus")
  @scala.inline
  def willBlur: typings.reactDashNavigation.reactDashNavigationStrings.willBlur = this.cast("willBlur")
  @scala.inline
  def willFocus: typings.reactDashNavigation.reactDashNavigationStrings.willFocus = this.cast("willFocus")
}

