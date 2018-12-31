package typings
package reactDashToolboxLib.libSwitchSwitchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
    * If true, the switch will be enabled.
    * @default false
    */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, component will be disabled.
    * @default false
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The text string to use for the floating label element.
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text string used as name of the input.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Callback function that is fired when when the switch is blurred.
    */
  var onBlur: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
    * Callback function that is fired when the component's value changes.
    */
  var onChange: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
    * Callback function that is fired when the switch is focused.
    */
  var onFocus: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[SwitchTheme] = js.undefined
}

