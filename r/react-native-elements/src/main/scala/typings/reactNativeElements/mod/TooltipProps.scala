package typings.reactNativeElements.mod

import typings.react.mod.ReactElement
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps extends js.Object {
  /**
    * sets backgroundColor of the tooltip and pointer.
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /**
    * Passes style object to tooltip container
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Tooltip container height. Necessary in order to render the container in the correct place. Pass height according to the size of the content rendered inside the container.
    * @default 40
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Color to highlight the item the tooltip is surrounding.
    */
  var highlightColor: js.UndefOr[String] = js.undefined
  /**
    * function which gets called on closing the tooltip.
    */
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * function which gets called on opening the tooltip.
    */
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    *  Color of overlay shadow when tooltip is open.
    *
    * @default 'rgba(250, 250, 250, 0.70)'
    */
  var overlayColor: js.UndefOr[String] = js.undefined
  /**
    * Color of tooltip pointer, it defaults to the backgroundColor if none passed .
    */
  var pointerColor: js.UndefOr[String] = js.undefined
  /**
    * Component to be rendered as the display container.
    */
  var popover: js.UndefOr[ReactElement] = js.undefined
  /**
    * Flag to determine to toggle or not the tooltip on press.
    */
  var toggleOnPress: js.UndefOr[Boolean] = js.undefined
  /**
    * Tooltip container width. Necessary in order to render the container in the correct place. Pass height according to the size of the content rendered inside the container.
    * @default 150
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    *  Flag to determine whether or not dislay overlay shadow when tooltip is open.
    *
    * @default true
    */
  var withOverlay: js.UndefOr[Boolean] = js.undefined
  /**
    * Flag to determine whether or not dislay pointer.
    */
  var withPointer: js.UndefOr[Boolean] = js.undefined
}

object TooltipProps {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    containerStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    highlightColor: String = null,
    onClose: () => Unit = null,
    onOpen: () => Unit = null,
    overlayColor: String = null,
    pointerColor: String = null,
    popover: ReactElement = null,
    toggleOnPress: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    withOverlay: js.UndefOr[Boolean] = js.undefined,
    withPointer: js.UndefOr[Boolean] = js.undefined
  ): TooltipProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(containerStyle)) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (highlightColor != null) __obj.updateDynamic("highlightColor")(highlightColor.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (overlayColor != null) __obj.updateDynamic("overlayColor")(overlayColor.asInstanceOf[js.Any])
    if (pointerColor != null) __obj.updateDynamic("pointerColor")(pointerColor.asInstanceOf[js.Any])
    if (popover != null) __obj.updateDynamic("popover")(popover.asInstanceOf[js.Any])
    if (!js.isUndefined(toggleOnPress)) __obj.updateDynamic("toggleOnPress")(toggleOnPress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(withOverlay)) __obj.updateDynamic("withOverlay")(withOverlay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(withPointer)) __obj.updateDynamic("withPointer")(withPointer.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
}

