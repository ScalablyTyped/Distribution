package typings
package reactDashThemeableDashTsLib.buildDashEs5HocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHOCDefaultProps extends IHOCDefaultNoThemeProps {
  var theme: js.UndefOr[js.Any] = js.undefined
}

object IHOCDefaultProps {
  @scala.inline
  def apply(t: reactDashThemeableDashTsLib.buildDashEs5ThemeableMod.IStaticFnReturn, theme: js.Any = null): IHOCDefaultProps = {
    val __obj = js.Dynamic.literal(t = t)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IHOCDefaultProps]
  }
}

