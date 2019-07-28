package typings.reactDashBootstrap

import typings.react.reactMod.HTMLProps
import typings.reactDashBootstrap.libButtonGroupMod.ButtonGroupProps
import typings.reactDashBootstrap.reactDashBootstrapMod.Omit
import typings.reactDashBootstrap.reactDashBootstrapStrings.`type`
import typings.reactDashBootstrap.reactDashBootstrapStrings.defaultValue
import typings.reactDashBootstrap.reactDashBootstrapStrings.onChange
import typings.reactDashBootstrap.reactDashBootstrapStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libToggleButtonGroupMod {
  type ToggleButtonGroupProps = BaseProps with (RadioProps | CheckboxProps) with (Omit[ButtonGroupProps, onChange]) with (Omit[HTMLProps[ToggleButtonGroup], defaultValue | `type` | value | onChange])
}
