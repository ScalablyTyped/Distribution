package typings
package reactDashToolboxLib.libRadioRadioButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioButtonProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
    * If true, the input element will be selected by default. Transferred from the parent.
    * @default false
    */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * If true, the item will be displayed as disabled.
    * @default false
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Label for the radio button.
    */
  var label: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Name for the input element.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Callback function that will be invoked when the input is blurred.
    */
  var onBlur: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
    * Callback function that will be invoked when the value changes.
    */
  var onChange: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
    * Callback function that will be invoked when the input is focused.
    */
  var onFocus: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[RadioButtonTheme with reactDashToolboxLib.libRadioBaseMod.RadioTheme] = js.undefined
  /**
    * Value for the radio button.
    */
  var value: js.UndefOr[js.Any] = js.undefined
}

