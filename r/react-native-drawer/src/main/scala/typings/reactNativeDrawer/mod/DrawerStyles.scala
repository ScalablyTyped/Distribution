package typings.reactNativeDrawer.mod

import typings.reactNative.mod.ViewStyle
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
    if (drawer != null) __obj.updateDynamic("drawer")(drawer.asInstanceOf[js.Any])
    if (drawerOverlay != null) __obj.updateDynamic("drawerOverlay")(drawerOverlay.asInstanceOf[js.Any])
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    if (mainOverlay != null) __obj.updateDynamic("mainOverlay")(mainOverlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerStyles]
  }
}

