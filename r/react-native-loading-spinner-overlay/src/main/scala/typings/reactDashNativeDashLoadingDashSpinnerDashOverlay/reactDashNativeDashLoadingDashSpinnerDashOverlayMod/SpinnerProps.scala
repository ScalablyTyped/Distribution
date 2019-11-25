package typings.reactDashNativeDashLoadingDashSpinnerDashOverlay.reactDashNativeDashLoadingDashSpinnerDashOverlayMod

import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNativeDashLoadingDashSpinnerDashOverlay.reactDashNativeDashLoadingDashSpinnerDashOverlayStrings.fade
import typings.reactDashNativeDashLoadingDashSpinnerDashOverlay.reactDashNativeDashLoadingDashSpinnerDashOverlayStrings.large
import typings.reactDashNativeDashLoadingDashSpinnerDashOverlay.reactDashNativeDashLoadingDashSpinnerDashOverlayStrings.none
import typings.reactDashNativeDashLoadingDashSpinnerDashOverlay.reactDashNativeDashLoadingDashSpinnerDashOverlayStrings.normal
import typings.reactDashNativeDashLoadingDashSpinnerDashOverlay.reactDashNativeDashLoadingDashSpinnerDashOverlayStrings.slide
import typings.reactDashNativeDashLoadingDashSpinnerDashOverlay.reactDashNativeDashLoadingDashSpinnerDashOverlayStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerProps extends js.Object {
  var animation: js.UndefOr[none | slide | fade] = js.undefined
  var cancelable: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var overlayColor: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[normal | small | large] = js.undefined
  var textContent: js.UndefOr[String] = js.undefined
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object SpinnerProps {
  @scala.inline
  def apply(
    animation: none | slide | fade = null,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    overlayColor: String = null,
    size: normal | small | large = null,
    textContent: String = null,
    textStyle: StyleProp[TextStyle] = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): SpinnerProps = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (overlayColor != null) __obj.updateDynamic("overlayColor")(overlayColor.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (textContent != null) __obj.updateDynamic("textContent")(textContent.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpinnerProps]
  }
}

