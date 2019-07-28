package typings.reactDashNativeDashDrawer.reactDashNativeDashDrawerMod

import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerStyles extends NestedViewStyles {
  var drawer: js.UndefOr[ViewStyle] = js.undefined
}

object DrawerStyles {
  @scala.inline
  def apply(
    drawer: ViewStyle = null,
    drawerOverlay: ViewStyle = null,
    main: ViewStyle = null,
    mainOverlay: ViewStyle = null
  ): DrawerStyles = {
    val __obj = js.Dynamic.literal()
    if (drawer != null) __obj.updateDynamic("drawer")(drawer)
    if (drawerOverlay != null) __obj.updateDynamic("drawerOverlay")(drawerOverlay)
    if (main != null) __obj.updateDynamic("main")(main)
    if (mainOverlay != null) __obj.updateDynamic("mainOverlay")(mainOverlay)
    __obj.asInstanceOf[DrawerStyles]
  }
}

