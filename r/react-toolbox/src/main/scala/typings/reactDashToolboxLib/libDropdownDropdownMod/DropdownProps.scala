package typings
package reactDashToolboxLib.libDropdownDropdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DropdownProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
     * If true the dropdown will preselect the first item if the supplied value matches none of the options' values.
     * @default true
     */
  var allowBlank: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * If true, the dropdown will open up or down depending on the position in the screen.
     * @default true
     */
  var auto: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Set the component as disabled.
     * @default false
     */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Give an error string to display under the field.
     */
  var error: js.UndefOr[java.lang.String] = js.undefined
  /**
     * The text string to use for the floating label element.
     */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Used for setting the label from source
     */
  var labelKey: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Name for the input field.
     */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Callback function that is fired when the component is blurred.
     */
  var onBlur: js.UndefOr[js.Function] = js.undefined
  /**
     * Callback function that is fired when the component's value changes.
     */
  var onChange: js.UndefOr[js.Function] = js.undefined
  /**
     * Callback function that is fired when the component is focused.
     */
  var onFocus: js.UndefOr[js.Function] = js.undefined
  /**
     * If true, the dropdown has a required attribute.
     * @default false
     */
  var required: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Array of data objects with the data to represent in the dropdown.
     */
  var source: coreDashJsLib.Array[_]
  /**
     * Callback function that returns a JSX template to represent the element.
     */
  var template: js.UndefOr[js.Function] = js.undefined
  /**
     * Classnames object defining the component style.
     */
  var theme: js.UndefOr[DropdownTheme] = js.undefined
  /**
     * Default value using JSON data.
     */
  var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
     * Used for setting the value from source
     */
  var valueKey: js.UndefOr[java.lang.String] = js.undefined
}

