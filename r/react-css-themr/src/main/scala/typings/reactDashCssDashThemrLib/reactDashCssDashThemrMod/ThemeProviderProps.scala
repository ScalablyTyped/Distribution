package typings
package reactDashCssDashThemrLib.reactDashCssDashThemrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeProviderProps extends js.Object {
  var innerRef: js.UndefOr[js.Function] = js.undefined
  var theme: TReactCSSThemrTheme
}

object ThemeProviderProps {
  @scala.inline
  def apply(theme: TReactCSSThemrTheme, innerRef: js.Function = null): ThemeProviderProps = {
    val __obj = js.Dynamic.literal(theme = theme)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef)
    __obj.asInstanceOf[ThemeProviderProps]
  }
}

