package typings.reactNativeModalPopover.anon

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeModalPopover.popoverGeometryMod.Placement
import typings.reactNativeModalPopover.popoverGeometryMod.Rect
import typings.reactNativeModalPopover.popoverGeometryMod.Size
import typings.reactNativeModalPopover.popoverMod.Orientation
import typings.reactNativeModalPopover.reactNativeModalPopoverStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-modal-popover.react-native-modal-popover/lib/Popover.PopoverProps> */
trait PartialPopoverProps extends js.Object {
  var arrowSize: js.UndefOr[Size] = js.undefined
  var arrowStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var backgroundStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var contentStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var displayArea: js.UndefOr[Rect] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[js.Function1[/* show */ Boolean, js.Function1[/* value */ Double, Double]]] = js.undefined
  var fromRect: js.UndefOr[Rect] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  var placement: js.UndefOr[Placement | auto] = js.undefined
  var popoverStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var supportedOrientations: js.UndefOr[js.Array[Orientation]] = js.undefined
  var useNativeDriver: js.UndefOr[Boolean] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object PartialPopoverProps {
  @scala.inline
  def apply(
    arrowSize: Size = null,
    arrowStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    backgroundStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    contentStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    displayArea: Rect = null,
    duration: js.UndefOr[Double] = js.undefined,
    easing: /* show */ Boolean => js.Function1[/* value */ Double, Double] = null,
    fromRect: Rect = null,
    onClose: () => Unit = null,
    onDismiss: () => Unit = null,
    placement: Placement | auto = null,
    popoverStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    supportedOrientations: js.Array[Orientation] = null,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): PartialPopoverProps = {
    val __obj = js.Dynamic.literal()
    if (arrowSize != null) __obj.updateDynamic("arrowSize")(arrowSize.asInstanceOf[js.Any])
    if (!js.isUndefined(arrowStyle)) __obj.updateDynamic("arrowStyle")(arrowStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(backgroundStyle)) __obj.updateDynamic("backgroundStyle")(backgroundStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(contentStyle)) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (displayArea != null) __obj.updateDynamic("displayArea")(displayArea.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1(easing))
    if (fromRect != null) __obj.updateDynamic("fromRect")(fromRect.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(popoverStyle)) __obj.updateDynamic("popoverStyle")(popoverStyle.asInstanceOf[js.Any])
    if (supportedOrientations != null) __obj.updateDynamic("supportedOrientations")(supportedOrientations.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPopoverProps]
  }
}

