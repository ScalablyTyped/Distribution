package typings.reactNativeElements

import typings.react.mod.ReactElement
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-elements.react-native-elements.TooltipProps> */
trait PartialTooltipProps extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var highlightColor: js.UndefOr[String] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  var overlayColor: js.UndefOr[String] = js.undefined
  var pointerColor: js.UndefOr[String] = js.undefined
  var popover: js.UndefOr[ReactElement] = js.undefined
  var toggleOnPress: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var withOverlay: js.UndefOr[Boolean] = js.undefined
  var withPointer: js.UndefOr[Boolean] = js.undefined
}

object PartialTooltipProps {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    containerStyle: StyleProp[ViewStyle] = null,
    height: Int | Double = null,
    highlightColor: String = null,
    onClose: () => Unit = null,
    onOpen: () => Unit = null,
    overlayColor: String = null,
    pointerColor: String = null,
    popover: ReactElement = null,
    toggleOnPress: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    withOverlay: js.UndefOr[Boolean] = js.undefined,
    withPointer: js.UndefOr[Boolean] = js.undefined
  ): PartialTooltipProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (highlightColor != null) __obj.updateDynamic("highlightColor")(highlightColor.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (overlayColor != null) __obj.updateDynamic("overlayColor")(overlayColor.asInstanceOf[js.Any])
    if (pointerColor != null) __obj.updateDynamic("pointerColor")(pointerColor.asInstanceOf[js.Any])
    if (popover != null) __obj.updateDynamic("popover")(popover.asInstanceOf[js.Any])
    if (!js.isUndefined(toggleOnPress)) __obj.updateDynamic("toggleOnPress")(toggleOnPress.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(withOverlay)) __obj.updateDynamic("withOverlay")(withOverlay.asInstanceOf[js.Any])
    if (!js.isUndefined(withPointer)) __obj.updateDynamic("withPointer")(withPointer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTooltipProps]
  }
}

