package typings.reactNavigationStack.vendorTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNavigationStack.reactNavigationStackStrings.willFocus
  - typings.reactNavigationStack.reactNavigationStackStrings.didFocus
  - typings.reactNavigationStack.reactNavigationStackStrings.willBlur
  - typings.reactNavigationStack.reactNavigationStackStrings.didBlur
*/
trait NavigationStackEventName extends js.Object

object NavigationStackEventName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def didBlur: typings.reactNavigationStack.reactNavigationStackStrings.didBlur = this.cast("didBlur")
  @scala.inline
  def didFocus: typings.reactNavigationStack.reactNavigationStackStrings.didFocus = this.cast("didFocus")
  @scala.inline
  def willBlur: typings.reactNavigationStack.reactNavigationStackStrings.willBlur = this.cast("willBlur")
  @scala.inline
  def willFocus: typings.reactNavigationStack.reactNavigationStackStrings.willFocus = this.cast("willFocus")
}

