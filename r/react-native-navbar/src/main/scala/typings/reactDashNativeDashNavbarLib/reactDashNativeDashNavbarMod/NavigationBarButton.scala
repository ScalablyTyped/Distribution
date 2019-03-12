package typings
package reactDashNativeDashNavbarLib.reactDashNativeDashNavbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBarButton extends js.Object {
  var disable: js.UndefOr[scala.Boolean] = js.undefined
  var handler: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var style: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  var title: java.lang.String
}

object NavigationBarButton {
  @scala.inline
  def apply(
    title: java.lang.String,
    disable: js.UndefOr[scala.Boolean] = js.undefined,
    handler: () => scala.Unit = null,
    style: reactDashNativeLib.reactDashNativeMod.ViewStyle = null
  ): NavigationBarButton = {
    val __obj = js.Dynamic.literal(title = title)
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable)
    if (handler != null) __obj.updateDynamic("handler")(js.Any.fromFunction0(handler))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[NavigationBarButton]
  }
}

