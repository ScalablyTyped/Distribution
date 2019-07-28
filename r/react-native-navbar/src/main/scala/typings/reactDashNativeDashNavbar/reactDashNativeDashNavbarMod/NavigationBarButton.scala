package typings.reactDashNativeDashNavbar.reactDashNativeDashNavbarMod

import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBarButton extends js.Object {
  var disable: js.UndefOr[Boolean] = js.undefined
  var handler: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[ViewStyle] = js.undefined
  var title: String
}

object NavigationBarButton {
  @scala.inline
  def apply(
    title: String,
    disable: js.UndefOr[Boolean] = js.undefined,
    handler: () => Unit = null,
    style: ViewStyle = null
  ): NavigationBarButton = {
    val __obj = js.Dynamic.literal(title = title)
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable)
    if (handler != null) __obj.updateDynamic("handler")(js.Any.fromFunction0(handler))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[NavigationBarButton]
  }
}

