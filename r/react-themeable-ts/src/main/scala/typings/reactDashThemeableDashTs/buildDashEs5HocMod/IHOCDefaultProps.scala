package typings.reactDashThemeableDashTs.buildDashEs5HocMod

import typings.reactDashThemeableDashTs.buildDashEs5ThemeableMod.IStaticFnReturn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHOCDefaultProps extends IHOCDefaultNoThemeProps {
  var theme: js.UndefOr[js.Any] = js.undefined
}

object IHOCDefaultProps {
  @scala.inline
  def apply(t: IStaticFnReturn, theme: js.Any = null): IHOCDefaultProps = {
    val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHOCDefaultProps]
  }
}

