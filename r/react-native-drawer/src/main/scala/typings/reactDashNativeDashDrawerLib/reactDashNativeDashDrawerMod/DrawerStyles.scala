package typings
package reactDashNativeDashDrawerLib.reactDashNativeDashDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerStyles extends NestedViewStyles {
  var drawer: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
}

object DrawerStyles {
  @scala.inline
  def apply(
    drawer: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    drawerOverlay: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    main: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    mainOverlay: reactDashNativeLib.reactDashNativeMod.ViewStyle = null
  ): DrawerStyles = {
    val __obj = js.Dynamic.literal()
    if (drawer != null) __obj.updateDynamic("drawer")(drawer)
    if (drawerOverlay != null) __obj.updateDynamic("drawerOverlay")(drawerOverlay)
    if (main != null) __obj.updateDynamic("main")(main)
    if (mainOverlay != null) __obj.updateDynamic("mainOverlay")(mainOverlay)
    __obj.asInstanceOf[DrawerStyles]
  }
}

