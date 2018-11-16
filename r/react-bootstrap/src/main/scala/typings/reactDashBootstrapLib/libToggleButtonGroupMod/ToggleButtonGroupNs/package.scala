package typings
package reactDashBootstrapLib.libToggleButtonGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ToggleButtonGroupNs {
  type ToggleButtonGroupProps = BaseProps with (RadioProps | CheckboxProps) with (reactDashBootstrapLib.reactDashBootstrapMod.Omit[
    reactDashBootstrapLib.libButtonGroupMod.ButtonGroupNs.ButtonGroupProps, 
    reactDashBootstrapLib.reactDashBootstrapLibStrings.onChange
  ]) with (reactDashBootstrapLib.reactDashBootstrapMod.Omit[
    reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libToggleButtonGroupMod.ToggleButtonGroup], 
    reactDashBootstrapLib.reactDashBootstrapLibStrings.defaultValue | reactDashBootstrapLib.reactDashBootstrapLibStrings.`type` | reactDashBootstrapLib.reactDashBootstrapLibStrings.value | reactDashBootstrapLib.reactDashBootstrapLibStrings.onChange
  ])
}
