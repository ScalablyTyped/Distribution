package typings.reactNativeElements.anon

import typings.react.mod.ReactElement
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.mod.RecursivePartial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.TooltipProps>> */
trait RecursivePartialPartialTo extends js.Object {
  var backgroundColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var containerStyle: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  var height: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var highlightColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var onClose: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var onOpen: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  var overlayColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var pointerColor: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  var popover: js.UndefOr[RecursivePartial[js.UndefOr[ReactElement]]] = js.undefined
  var toggleOnPress: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var width: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  var withOverlay: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  var withPointer: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
}

object RecursivePartialPartialTo {
  @scala.inline
  def apply(
    backgroundColor: RecursivePartial[js.UndefOr[String]] = null,
    containerStyle: RecursivePartial[js.UndefOr[StyleProp[ViewStyle]]] = null,
    height: RecursivePartial[js.UndefOr[Double]] = null,
    highlightColor: RecursivePartial[js.UndefOr[String]] = null,
    onClose: RecursivePartial[js.UndefOr[js.Function0[Unit]]] = null,
    onOpen: RecursivePartial[js.UndefOr[js.Function0[Unit]]] = null,
    overlayColor: RecursivePartial[js.UndefOr[String]] = null,
    pointerColor: RecursivePartial[js.UndefOr[String]] = null,
    popover: RecursivePartial[js.UndefOr[ReactElement]] = null,
    toggleOnPress: RecursivePartial[js.UndefOr[Boolean]] = null,
    width: RecursivePartial[js.UndefOr[Double]] = null,
    withOverlay: RecursivePartial[js.UndefOr[Boolean]] = null,
    withPointer: RecursivePartial[js.UndefOr[Boolean]] = null
  ): RecursivePartialPartialTo = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (highlightColor != null) __obj.updateDynamic("highlightColor")(highlightColor.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(onClose.asInstanceOf[js.Any])
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen.asInstanceOf[js.Any])
    if (overlayColor != null) __obj.updateDynamic("overlayColor")(overlayColor.asInstanceOf[js.Any])
    if (pointerColor != null) __obj.updateDynamic("pointerColor")(pointerColor.asInstanceOf[js.Any])
    if (popover != null) __obj.updateDynamic("popover")(popover.asInstanceOf[js.Any])
    if (toggleOnPress != null) __obj.updateDynamic("toggleOnPress")(toggleOnPress.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (withOverlay != null) __obj.updateDynamic("withOverlay")(withOverlay.asInstanceOf[js.Any])
    if (withPointer != null) __obj.updateDynamic("withPointer")(withPointer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecursivePartialPartialTo]
  }
}

