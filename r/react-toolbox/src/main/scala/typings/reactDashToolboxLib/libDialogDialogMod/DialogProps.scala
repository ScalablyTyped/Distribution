package typings
package reactDashToolboxLib.libDialogDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DialogProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
     * A array of objects representing the buttons for the dialog navigation area. The properties will be transferred to the buttons.
     */
  var actions: js.UndefOr[coreDashJsLib.Array[DialogActionProps]] = js.undefined
  /**
     * If true, the dialog will be active.
     * @default false
     */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Children to pass through the component.
     */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
     * Callback called when the ESC key is pressed with the overlay active.
     */
  var onEscKeyDown: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
     * Callback to be invoked when the dialog overlay is clicked.
     */
  var onOverlayClick: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
     * Callback called when the mouse button is pressed on the overlay.
     */
  var onOverlayMouseDown: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
     * Callback called when the mouse is moving over the overlay.
     */
  var onOverlayMouseMove: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
     * Callback called when the mouse button is released over the overlay.
     */
  var onOverlayMouseUp: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
     * Classnames object defining the component style.
     */
  var theme: js.UndefOr[DialogTheme] = js.undefined
  /**
     * The text string to use as standar title of the dialog.
     */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Used to determine the size of the dialog. It can be small, normal or large.
     * @default "normal"
     */
  var `type`: js.UndefOr[
    reactDashToolboxLib.reactDashToolboxLibStrings.small | reactDashToolboxLib.reactDashToolboxLibStrings.normal | reactDashToolboxLib.reactDashToolboxLibStrings.large | java.lang.String
  ] = js.undefined
}

