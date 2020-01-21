package typings.reactNativeElements.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeProviderProps[T] extends js.Object {
  var children: ReactNode
  var theme: js.UndefOr[Theme[T]] = js.undefined
}

object ThemeProviderProps {
  @scala.inline
  def apply[T](children: ReactNode = null, theme: Theme[T] = null): ThemeProviderProps[T] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeProviderProps[T]]
  }
}

