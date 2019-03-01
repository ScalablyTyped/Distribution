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
    getDefaults: js.Function0[_] = null,
    setDefaults: js.Function1[/* defaults */ js.UndefOr[js.Any], scala.Unit] = null
  ): IApplicationMenu = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IMenu)
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    if (getDefaults != null) __obj.updateDynamic("getDefaults")(getDefaults)
    if (setDefaults != null) __obj.updateDynamic("setDefaults")(setDefaults)
    __obj.asInstanceOf[IApplicationMenu]
  }
}

