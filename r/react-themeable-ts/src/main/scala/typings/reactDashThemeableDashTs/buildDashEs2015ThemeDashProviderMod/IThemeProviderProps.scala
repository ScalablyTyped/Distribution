package typings.reactDashThemeableDashTs.buildDashEs2015ThemeDashProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThemeProviderProps extends js.Object {
  var children: js.UndefOr[js.Any] = js.undefined
  var reactThemeable: js.Any
}

object IThemeProviderProps {
  @scala.inline
  def apply(reactThemeable: js.Any, children: js.Any = null): IThemeProviderProps = {
    val __obj = js.Dynamic.literal(reactThemeable = reactThemeable)
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[IThemeProviderProps]
  }
}

