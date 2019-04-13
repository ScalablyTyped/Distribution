package typings
package reactDashBootstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libToggleButtonGroupMod {
  type ToggleButtonGroupProps = BaseProps with (RadioProps | CheckboxProps) with (reactDashBootstrapLib.reactDashBootstrapMod.Omit[
    reactDashBootstrapLib.libButtonGroupMod.ButtonGroupProps, 
    reactDashBootstrapLib.reactDashBootstrapLibStrings.onChange
  ]) with (reactDashBootstrapLib.reactDashBootstrapMod.Omit[
    reactLib.reactMod.HTMLProps[ToggleButtonGroup], 
    reactDashBootstrapLib.reactDashBootstrapLibStrings.defaultValue | reactDashBootstrapLib.reactDashBootstrapLibStrings.`type` | reactDashBootstrapLib.reactDashBootstrapLibStrings.value | reactDashBootstrapLib.reactDashBootstrapLibStrings.onChange
  ])
}
