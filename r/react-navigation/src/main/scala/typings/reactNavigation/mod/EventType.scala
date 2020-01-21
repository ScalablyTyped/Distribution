package typings.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNavigation.reactNavigationStrings.willFocus
  - typings.reactNavigation.reactNavigationStrings.didFocus
  - typings.reactNavigation.reactNavigationStrings.willBlur
  - typings.reactNavigation.reactNavigationStrings.didBlur
  - typings.reactNavigation.reactNavigationStrings.action
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  def action: typings.reactNavigation.reactNavigationStrings.action = this.cast("action")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def didBlur: typings.reactNavigation.reactNavigationStrings.didBlur = this.cast("didBlur")
  @scala.inline
  def didFocus: typings.reactNavigation.reactNavigationStrings.didFocus = this.cast("didFocus")
  @scala.inline
  def willBlur: typings.reactNavigation.reactNavigationStrings.willBlur = this.cast("willBlur")
  @scala.inline
  def willFocus: typings.reactNavigation.reactNavigationStrings.willFocus = this.cast("willFocus")
}

