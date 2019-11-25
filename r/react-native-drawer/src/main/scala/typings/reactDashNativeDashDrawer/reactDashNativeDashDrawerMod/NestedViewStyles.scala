package typings.reactDashNativeDashDrawer.reactDashNativeDashDrawerMod

import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedViewStyles extends js.Object {
  var drawerOverlay: js.UndefOr[ViewStyle] = js.undefined
  var main: js.UndefOr[ViewStyle] = js.undefined
  var mainOverlay: js.UndefOr[ViewStyle] = js.undefined
}

object NestedViewStyles {
  @scala.inline
  def apply(drawerOverlay: ViewStyle = null, main: ViewStyle = null, mainOverlay: ViewStyle = null): NestedViewStyles = {
    val __obj = js.Dynamic.literal()
    if (drawerOverlay != null) __obj.updateDynamic("drawerOverlay")(drawerOverlay.asInstanceOf[js.Any])
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    if (mainOverlay != null) __obj.updateDynamic("mainOverlay")(mainOverlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestedViewStyles]
  }
}

