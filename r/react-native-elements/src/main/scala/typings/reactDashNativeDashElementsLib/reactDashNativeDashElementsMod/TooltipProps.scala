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
  var popover: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[js.Object]] = js.undefined
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

