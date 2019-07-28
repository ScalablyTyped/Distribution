package typings.reactDashNativeDashModalDashPopover.libPopoverMod

import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNativeDashModalDashPopover.libPopoverGeometryMod.Placement
import typings.reactDashNativeDashModalDashPopover.libPopoverGeometryMod.Rect
import typings.reactDashNativeDashModalDashPopover.libPopoverGeometryMod.Size
import typings.reactDashNativeDashModalDashPopover.reactDashNativeDashModalDashPopoverStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverProps extends js.Object {
  var arrowSize: js.UndefOr[Size] = js.undefined
  var arrowStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var backgroundStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var displayArea: js.UndefOr[Rect] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* show */ Boolean, js.Function1[/* value */ Double, Double]]] = js.undefined
  var fromRect: Rect
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  var placement: js.UndefOr[Placement | auto] = js.undefined
  var popoverStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var supportedOrientations: js.UndefOr[js.Array[Orientation]] = js.undefined
  var useNativeDriver: js.UndefOr[Boolean] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object PopoverProps {
  @scala.inline
  def apply(
    fromRect: Rect,
    arrowSize: Size = null,
    arrowStyle: StyleProp[ViewStyle] = null,
    backgroundStyle: StyleProp[ViewStyle] = null,
    contentStyle: StyleProp[ViewStyle] = null,
    displayArea: Rect = null,
    duration: Int | Double = null,
    easing: /* show */ Boolean => js.Function1[/* value */ Double, Double] = null,
    onClose: () => Unit = null,
    onDismiss: () => Unit = null,
    placement: Placement | auto = null,
    popoverStyle: StyleProp[ViewStyle] = null,
    supportedOrientations: js.Array[Orientation] = null,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
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

