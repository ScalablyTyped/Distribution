package typings.reactDashNativeDashElements.reactDashNativeDashElementsMod

import typings.react.reactMod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeProviderProps[T] extends js.Object {
  var children: ReactChild
  var theme: js.UndefOr[Theme[T]] = js.undefined
}

object ThemeProviderProps {
  @scala.inline
  def apply[T](children: ReactChild, theme: Theme[T] = null): ThemeProviderProps[T] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[ThemeProviderProps[T]]
  }
}

