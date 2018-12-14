package typings
package reactDashToolboxLib.libCheckboxCheckboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CheckboxProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props
     with /**
   * Additional properties passed to inner input element.
   */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
     * Value for the checkbox, can be true or false.
     * @default false
     */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Children to pass through the component.
     */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
     * If true, the checkbox shown as disabled and cannot be modified.
     * @default false
     */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Text label to attach next to the checkbox element.
     */
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
     * The name of the field to set in the input checkbox.
     */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Callback called when the checkbox is blurred.
     */
  var onBlur: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
     * Callback called when the checkbox value is changed.
     */
  var onChange: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
     * Classnames object defining the component style.
     */
  var theme: js.UndefOr[CheckboxTheme] = js.undefined
}

