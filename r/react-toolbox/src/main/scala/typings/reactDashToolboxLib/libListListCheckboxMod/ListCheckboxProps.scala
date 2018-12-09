package typings
package reactDashToolboxLib.libListListCheckboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListCheckboxProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
     * Main text of the item. Required.
     */
  var caption: js.UndefOr[java.lang.String] = js.undefined
  /**
     * If true the checkbox appears checked by default.
     * @default false
     */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * If true, the item is displayed as disabled and it's not clickable.
     * @default false
     */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Secondary text to display under the caption.
     */
  var legend: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Name for the checkbox input item.
     */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Callback called when the input element is blurred.
     */
  var onBlur: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
     * Callback called when the input element is changed.
     */
  var onChange: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
     * Callback called when the input element is focused.
     */
  var onFocus: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
     * Classnames object defining the component style.
     */
  var theme: js.UndefOr[ListCheckboxTheme] = js.undefined
}

