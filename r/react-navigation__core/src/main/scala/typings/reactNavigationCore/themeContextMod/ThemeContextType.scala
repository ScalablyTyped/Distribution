package typings.reactNavigationCore.themeContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNavigationCore.reactNavigationCoreStrings.light
  - typings.reactNavigationCore.reactNavigationCoreStrings.dark
*/
trait ThemeContextType extends js.Object

object ThemeContextType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dark: typings.reactNavigationCore.reactNavigationCoreStrings.dark = this.cast("dark")
  @scala.inline
  def light: typings.reactNavigationCore.reactNavigationCoreStrings.light = this.cast("light")
}

