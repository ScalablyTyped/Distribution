package typings
package reactDashNativeDashPopupDashDialogLib.reactDashNativeDashPopupDashDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayProps extends js.Object {
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var pointerEvents: js.UndefOr[java.lang.String] = js.undefined
  var showOverlay: js.UndefOr[scala.Boolean] = js.undefined
  var useNativeDriver: js.UndefOr[scala.Boolean] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  def onPress(event: reactDashNativeLib.reactDashNativeMod.GestureResponderEvent): scala.Unit
}

object OverlayProps {
  @scala.inline
  def apply(
    onPress: js.Function1[reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, scala.Unit],
    animationDuration: scala.Int | scala.Double = null,
    backgroundColor: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    pointerEvents: java.lang.String = null,
    showOverlay: js.UndefOr[scala.Boolean] = js.undefined,
    useNativeDriver: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): OverlayProps = {
    val __obj = js.Dynamic.literal(onPress = onPress)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents)
    if (!js.isUndefined(showOverlay)) __obj.updateDynamic("showOverlay")(showOverlay)
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[OverlayProps]
  }
}

