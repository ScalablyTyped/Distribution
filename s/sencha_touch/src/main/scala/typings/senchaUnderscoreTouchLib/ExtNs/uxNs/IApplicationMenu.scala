package typings
package senchaUnderscoreTouchLib.ExtNs.uxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApplicationMenu
  extends senchaUnderscoreTouchLib.ExtNs.IMenu

object IApplicationMenu {
  @scala.inline
  def apply(
    IMenu: senchaUnderscoreTouchLib.ExtNs.IMenu = null,
    defaults: js.Any = null,
    getDefaults: () => _ = null,
    setDefaults: /* defaults */ js.UndefOr[js.Any] => scala.Unit = null
  ): IApplicationMenu = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IMenu)
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    if (getDefaults != null) __obj.updateDynamic("getDefaults")(js.Any.fromFunction0(getDefaults))
    if (setDefaults != null) __obj.updateDynamic("setDefaults")(js.Any.fromFunction1(setDefaults))
    __obj.asInstanceOf[IApplicationMenu]
  }
}

