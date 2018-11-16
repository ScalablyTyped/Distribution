package typings
package reactDashToolboxLib.libSnackbarSnackbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SnackbarProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
     * Label for the action component inside the Snackbar.
     */
  var action: js.UndefOr[java.lang.String] = js.undefined
  /**
     * If true, the snackbar will be active.
     * @default true
     */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Children to pass through the component.
     */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
     * Text to display in the content.
     */
  var label: js.UndefOr[java.lang.String | reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  /**
     * Callback function when finish the set timeout.
     */
  var onTimeout: js.UndefOr[js.Function] = js.undefined
  /**
     * Classnames object defining the component style.
     */
  var theme: js.UndefOr[SnackbarTheme] = js.undefined
  /**
     * Amount of time in milliseconds after the Snackbar will be automatically hidden.
     */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /**
     * Indicates the action type. Can be accept, warning or cancel
     */
  var `type`: js.UndefOr[
    reactDashToolboxLib.reactDashToolboxLibStrings.accept | reactDashToolboxLib.reactDashToolboxLibStrings.cancel | reactDashToolboxLib.reactDashToolboxLibStrings.warning
  ] = js.undefined
}

