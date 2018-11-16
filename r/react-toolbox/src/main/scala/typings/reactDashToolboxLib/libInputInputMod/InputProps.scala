package typings
package reactDashToolboxLib.libInputInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait InputProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
     * Children to pass through the component.
     */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
     * If true, component will be disabled.
     * @default false
     */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Give an error node to display under the field.
     */
  var error: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
     * Indicates if the label is floating in the input field or not.
     * @default true
     */
  var floating: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * The text string to use for hint text element.
     */
  var hint: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
     * Name of an icon to use as a label for the input.
     */
  var icon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
     * The text string to use for the floating label element.
     */
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
     * Specifies the maximum number of characters allowed in the component
     */
  var maxLength: js.UndefOr[scala.Double] = js.undefined
  /**
     * If true, a textarea element will be rendered. The textarea also grows and shrinks according to the number of lines.
     * @default false
     */
  var multiline: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Name for the input field.
     */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Callback function that is fired when component is blurred.
     */
  var onBlur: js.UndefOr[js.Function] = js.undefined
  /**
     * Callback function that is fired when the component's value changes
     */
  var onChange: js.UndefOr[js.Function] = js.undefined
  /**
     * Callback function that is fired when component is focused.
     */
  var onFocus: js.UndefOr[js.Function] = js.undefined
  /**
     * Callback function that is fired when a key is pressed down.
     */
  var onKeyDown: js.UndefOr[js.Function] = js.undefined
  /**
     * Callback function that is fired when a key is pressed.
     */
  var onKeyPress: js.UndefOr[js.Function] = js.undefined
  /**
     * Callback function that is fired when a key is released.
     */
  var onKeyUp: js.UndefOr[js.Function] = js.undefined
  /**
     * If true, the html input has a required attribute.
     * @default false
     */
  var required: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * The number of rows the multiline input field has.
     */
  var rows: js.UndefOr[scala.Double] = js.undefined
  /**
     * Classnames object defining the component style.
     */
  var theme: js.UndefOr[InputTheme] = js.undefined
  /**
     * Type of the input element. It can be a valid HTML5 input type.
     * @default "text"
     */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Current value of the input element.
     */
  var value: js.UndefOr[js.Any] = js.undefined
}

