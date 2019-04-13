package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps extends js.Object {
  /**
    * sets backgroundColor of the tooltip and pointer.
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Passes style object to tooltip container
    */
  var containerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Tooltip container height. Necessary in order to render the container in the correct place. Pass height according to the size of the content rendered inside the container.
    * @default 40
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Color to highlight the item the tooltip is surrounding.
    */
  var highlightColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * function which gets called on closing the tooltip.
    */
  var onClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * function which gets called on opening the tooltip.
    */
  var onOpen: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Color of tooltip pointer, it defaults to the backgroundColor if none passed .
    */
  var pointerColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Component to be rendered as the display container.
    */
  var popover: js.UndefOr[reactLib.reactMod.ReactElement[js.Object]] = js.undefined
  /**
    * Flag to determine to toggle or not the tooltip on press.
    */
  var toggleOnPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Tooltip container width. Necessary in order to render the container in the correct place. Pass height according to the size of the content rendered inside the container.
    * @default 150
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
    *  Flag to determine whether or not dislay overlay shadow when tooltip is open.
    *
    * @default true
    */
  var withOverlay: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Flag to determine whether or not dislay pointer.
    */
  var withPointer: js.UndefOr[scala.Boolean] = js.undefined
}

object TooltipProps {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    containerStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    height: scala.Int | scala.Double = null,
    highlightColor: java.lang.String = null,
    onClose: () => scala.Unit = null,
    onOpen: () => scala.Unit = null,
    pointerColor: java.lang.String = null,
    popover: reactLib.reactMod.ReactElement[js.Object] = null,
    toggleOnPress: () => scala.Unit = null,
    width: scala.Int | scala.Double = null,
    withOverlay: js.UndefOr[scala.Boolean] = js.undefined,
    withPointer: js.UndefOr[scala.Boolean] = js.undefined
  ): TooltipProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (highlightColor != null) __obj.updateDynamic("highlightColor")(highlightColor)
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (pointerColor != null) __obj.updateDynamic("pointerColor")(pointerColor)
    if (popover != null) __obj.updateDynamic("popover")(popover)
    if (toggleOnPress != null) __obj.updateDynamic("toggleOnPress")(js.Any.fromFunction0(toggleOnPress))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(withOverlay)) __obj.updateDynamic("withOverlay")(withOverlay)
    if (!js.isUndefined(withPointer)) __obj.updateDynamic("withPointer")(withPointer)
    __obj.asInstanceOf[TooltipProps]
  }
}

