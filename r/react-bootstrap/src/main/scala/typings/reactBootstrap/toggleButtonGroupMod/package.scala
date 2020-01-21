package typings.reactBootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object toggleButtonGroupMod {
  type ToggleButtonGroupProps = typings.reactBootstrap.toggleButtonGroupMod.BaseProps with (typings.reactBootstrap.toggleButtonGroupMod.RadioProps | typings.reactBootstrap.toggleButtonGroupMod.CheckboxProps) with (typings.reactBootstrap.mod.Omit[
    typings.reactBootstrap.buttonGroupMod.ButtonGroupProps, 
    typings.reactBootstrap.reactBootstrapStrings.onChange
  ]) with (typings.reactBootstrap.mod.Omit[
    typings.react.mod.HTMLProps[typings.reactBootstrap.toggleButtonGroupMod.ToggleButtonGroup], 
    typings.reactBootstrap.reactBootstrapStrings.defaultValue | typings.reactBootstrap.reactBootstrapStrings.`type` | typings.reactBootstrap.reactBootstrapStrings.value | typings.reactBootstrap.reactBootstrapStrings.onChange
  ])
}
