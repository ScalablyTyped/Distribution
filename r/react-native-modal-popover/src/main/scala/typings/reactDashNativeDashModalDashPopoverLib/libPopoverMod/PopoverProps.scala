package typings
package reactDashNativeDashModalDashPopoverLib.libPopoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverProps extends js.Object {
  var arrowSize: js.UndefOr[reactDashNativeDashModalDashPopoverLib.libPopoverGeometryMod.Size] = js.undefined
  var arrowStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var backgroundStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var contentStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var displayArea: js.UndefOr[reactDashNativeDashModalDashPopoverLib.libPopoverGeometryMod.Rect] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[
    js.Function1[/* show */ scala.Boolean, js.Function1[/* value */ scala.Double, scala.Double]]
  ] = js.undefined
  var fromRect: reactDashNativeDashModalDashPopoverLib.libPopoverGeometryMod.Rect
  var onClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onDismiss: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var placement: js.UndefOr[
    reactDashNativeDashModalDashPopoverLib.libPopoverGeometryMod.Placement | reactDashNativeDashModalDashPopoverLib.reactDashNativeDashModalDashPopoverLibStrings.auto
  ] = js.undefined
  var popoverStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var supportedOrientations: js.UndefOr[js.Array[Orientation]] = js.undefined
  var useNativeDriver: js.UndefOr[scala.Boolean] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object PopoverProps {
  @scala.inline
  def apply(
    fromRect: reactDashNativeDashModalDashPopoverLib.libPopoverGeometryMod.Rect,
    arrowSize: reactDashNativeDashModalDashPopoverLib.libPopoverGeometryMod.Size = null,
    arrowStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    backgroundStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    contentStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    displayArea: reactDashNativeDashModalDashPopoverLib.libPopoverGeometryMod.Rect = null,
    duration: scala.Int | scala.Double = null,
    easing: /* show */ scala.Boolean => js.Function1[/* value */ scala.Double, scala.Double] = null,
    onClose: () => scala.Unit = null,
    onDismiss: () => scala.Unit = null,
    placement: reactDashNativeDashModalDashPopoverLib.libPopoverGeometryMod.Placement | reactDashNativeDashModalDashPopoverLib.reactDashNativeDashModalDashPopoverLibStrings.auto = null,
    popoverStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    supportedOrientations: js.Array[Orientation] = null,
    useNativeDriver: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): PopoverProps = {
    val __obj = js.Dynamic.literal(fromRect = fromRect)
    if (arrowSize != null) __obj.updateDynamic("arrowSize")(arrowSize)
    if (arrowStyle != null) __obj.updateDynamic("arrowStyle")(arrowStyle.asInstanceOf[js.Any])
    if (backgroundStyle != null) __obj.updateDynamic("backgroundStyle")(backgroundStyle.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (displayArea != null) __obj.updateDynamic("displayArea")(displayArea)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (popoverStyle != null) __obj.updateDynamic("popoverStyle")(popoverStyle.asInstanceOf[js.Any])
    if (supportedOrientations != null) __obj.updateDynamic("supportedOrientations")(supportedOrientations)
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[PopoverProps]
  }
}

