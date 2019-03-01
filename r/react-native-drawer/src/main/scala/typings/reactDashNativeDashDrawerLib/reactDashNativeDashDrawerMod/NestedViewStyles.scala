package typings
package reactDashNativeDashDrawerLib.reactDashNativeDashDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedViewStyles extends js.Object {
  var drawerOverlay: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  var main: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  var mainOverlay: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
}

object NestedViewStyles {
  @scala.inline
  def apply(
    drawerOverlay: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    main: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    mainOverlay: reactDashNativeLib.reactDashNativeMod.ViewStyle = null
  ): NestedViewStyles = {
    val __obj = js.Dynamic.literal()
    if (drawerOverlay != null) __obj.updateDynamic("drawerOverlay")(drawerOverlay)
    if (main != null) __obj.updateDynamic("main")(main)
    if (mainOverlay != null) __obj.updateDynamic("mainOverlay")(mainOverlay)
    __obj.asInstanceOf[NestedViewStyles]
  }
}

