package typings
package reactDashNativeDashLoadingDashSpinnerDashOverlayLib.reactDashNativeDashLoadingDashSpinnerDashOverlayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerProps extends js.Object {
  var animation: js.UndefOr[
    reactDashNativeDashLoadingDashSpinnerDashOverlayLib.reactDashNativeDashLoadingDashSpinnerDashOverlayLibStrings.none | reactDashNativeDashLoadingDashSpinnerDashOverlayLib.reactDashNativeDashLoadingDashSpinnerDashOverlayLibStrings.slide | reactDashNativeDashLoadingDashSpinnerDashOverlayLib.reactDashNativeDashLoadingDashSpinnerDashOverlayLibStrings.fade
  ] = js.undefined
  var cancelable: js.UndefOr[scala.Boolean] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var overlayColor: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[
    reactDashNativeDashLoadingDashSpinnerDashOverlayLib.reactDashNativeDashLoadingDashSpinnerDashOverlayLibStrings.normal | reactDashNativeDashLoadingDashSpinnerDashOverlayLib.reactDashNativeDashLoadingDashSpinnerDashOverlayLibStrings.small | reactDashNativeDashLoadingDashSpinnerDashOverlayLib.reactDashNativeDashLoadingDashSpinnerDashOverlayLibStrings.large
  ] = js.undefined
  var textContent: js.UndefOr[java.lang.String] = js.undefined
  var textStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object SpinnerProps {
  @scala.inline
  def apply(
    animation: reactDashNativeDashLoadingDashSpinnerDashOverlayLib.reactDashNativeDashLoadingDashSpinnerDashOverlayLibStrings.none | reactDashNativeDashLoadingDashSpinnerDashOverlayLib.reactDashNativeDashLoadingDashSpinnerDashOverlayLibStrings.slide | reactDashNativeDashLoadingDashSpinnerDashOverlayLib.reactDashNativeDashLoadingDashSpinnerDashOverlayLibStrings.fade = null,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    overlayColor: java.lang.String = null,
    size: reactDashNativeDashLoadingDashSpinnerDashOverlayLib.reactDashNativeDashLoadingDashSpinnerDashOverlayLibStrings.normal | reactDashNativeDashLoadingDashSpinnerDashOverlayLib.reactDashNativeDashLoadingDashSpinnerDashOverlayLibStrings.small | reactDashNativeDashLoadingDashSpinnerDashOverlayLib.reactDashNativeDashLoadingDashSpinnerDashOverlayLibStrings.large = null,
    textContent: java.lang.String = null,
    textStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): SpinnerProps = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (color != null) __obj.updateDynamic("color")(color)
    if (overlayColor != null) __obj.updateDynamic("overlayColor")(overlayColor)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (textContent != null) __obj.updateDynamic("textContent")(textContent)
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[SpinnerProps]
  }
}

