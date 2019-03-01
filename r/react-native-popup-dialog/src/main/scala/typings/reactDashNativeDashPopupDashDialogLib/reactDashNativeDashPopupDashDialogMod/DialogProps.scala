package typings
package reactDashNativeDashPopupDashDialogLib.reactDashNativeDashPopupDashDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogProps extends js.Object {
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  var containerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var dialogAnimation: js.UndefOr[FadeAnimation | ScaleAnimation | SlideAnimation] = js.undefined
  var dialogStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var dialogTitle: js.UndefOr[js.Any] = js.undefined
  var footer: js.UndefOr[js.Any] = js.undefined
  var hasOverlay: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var onDismiss: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onHardwareBackPress: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  var onShow: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onTouchOutside: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var overlayBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var overlayOpacity: js.UndefOr[scala.Double] = js.undefined
  var overlayPointerEvents: js.UndefOr[OverlayPointerEventTypes] = js.undefined
  var rounded: js.UndefOr[scala.Boolean] = js.undefined
  var useNativeDriver: js.UndefOr[scala.Boolean] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object DialogProps {
  @scala.inline
  def apply(
    animationDuration: scala.Int | scala.Double = null,
    containerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    dialogAnimation: FadeAnimation | ScaleAnimation | SlideAnimation = null,
    dialogStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    dialogTitle: js.Any = null,
    footer: js.Any = null,
    hasOverlay: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    onDismiss: js.Function0[scala.Unit] = null,
    onHardwareBackPress: js.Function0[scala.Boolean] = null,
    onShow: js.Function0[scala.Unit] = null,
    onTouchOutside: js.Function0[scala.Unit] = null,
    overlayBackgroundColor: java.lang.String = null,
    overlayOpacity: scala.Int | scala.Double = null,
    overlayPointerEvents: OverlayPointerEventTypes = null,
    rounded: js.UndefOr[scala.Boolean] = js.undefined,
    useNativeDriver: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): DialogProps = {
    val __obj = js.Dynamic.literal()
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (dialogAnimation != null) __obj.updateDynamic("dialogAnimation")(dialogAnimation.asInstanceOf[js.Any])
    if (dialogStyle != null) __obj.updateDynamic("dialogStyle")(dialogStyle.asInstanceOf[js.Any])
    if (dialogTitle != null) __obj.updateDynamic("dialogTitle")(dialogTitle)
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (!js.isUndefined(hasOverlay)) __obj.updateDynamic("hasOverlay")(hasOverlay)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(onDismiss)
    if (onHardwareBackPress != null) __obj.updateDynamic("onHardwareBackPress")(onHardwareBackPress)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    if (onTouchOutside != null) __obj.updateDynamic("onTouchOutside")(onTouchOutside)
    if (overlayBackgroundColor != null) __obj.updateDynamic("overlayBackgroundColor")(overlayBackgroundColor)
    if (overlayOpacity != null) __obj.updateDynamic("overlayOpacity")(overlayOpacity.asInstanceOf[js.Any])
    if (overlayPointerEvents != null) __obj.updateDynamic("overlayPointerEvents")(overlayPointerEvents)
    if (!js.isUndefined(rounded)) __obj.updateDynamic("rounded")(rounded)
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogProps]
  }
}

