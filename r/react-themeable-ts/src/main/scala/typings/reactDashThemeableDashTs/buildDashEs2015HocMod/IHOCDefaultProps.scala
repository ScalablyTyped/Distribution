package typings.reactDashThemeableDashTs.buildDashEs2015HocMod

import typings.reactDashThemeableDashTs.buildDashEs2015ThemeableMod.IStaticFnReturn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHOCDefaultProps extends IHOCDefaultNoThemeProps {
  var theme: js.UndefOr[js.Any] = js.undefined
}

object IHOCDefaultProps {
  @scala.inline
  def apply(t: IStaticFnReturn, theme: js.Any = null): IHOCDefaultProps = {
    val __obj = js.Dynamic.literal(t = t)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[IHOCDefaultProps]
  }
}

