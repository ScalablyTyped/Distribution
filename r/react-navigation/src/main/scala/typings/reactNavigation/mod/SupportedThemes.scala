package typings.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNavigation.reactNavigationStrings.light
  - typings.reactNavigation.reactNavigationStrings.dark
*/
trait SupportedThemes extends js.Object

object SupportedThemes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dark: typings.reactNavigation.reactNavigationStrings.dark = this.cast("dark")
  @scala.inline
  def light: typings.reactNavigation.reactNavigationStrings.light = this.cast("light")
}

