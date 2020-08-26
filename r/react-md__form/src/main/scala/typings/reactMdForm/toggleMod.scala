package typings.reactMdForm

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdForm.anon.InputTogglePropstypecheck
import typings.reactMdForm.anon.InputTogglePropstyperadio
import typings.reactMdForm.asyncSwitchMod.AsyncSwitchProps
import typings.reactMdForm.checkboxMod.CheckboxProps
import typings.reactMdForm.radioMod.RadioProps
import typings.reactMdForm.switchMod.SwitchProps
import typings.reactMdForm.toggleContainerMod.ToggleContainerProps
import typings.reactMdForm.useCheckedMod.ChangeEventHandler
import typings.reactMdForm.useCheckedMod.SetChecked
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/form/types/toggle", JSImport.Namespace)
@js.native
object toggleMod extends js.Object {
  /**
    * This component will create an async switch that will show a loading indicator
    * and prevent the switch from being toggled while the loading state is true.
    */
  val AsyncSwitch: ForwardRefExoticComponent[AsyncSwitchProps with RefAttributes[HTMLInputElement]] = js.native
  /**
    * The `Checkbox` component is just a wrapper for the `InputToggle` that
    * defaults to reasonable defaults for a checkbox input.
    */
  val Checkbox: ForwardRefExoticComponent[CheckboxProps with RefAttributes[HTMLInputElement]] = js.native
  val InputToggle: ForwardRefExoticComponent[InputTogglePropstyperadio | InputTogglePropstypecheck] = js.native
  /**
    * The `Radio` component is just a wrapper for the `InputToggle` that
    * defaults to reasonable defaults for a radio input.
    */
  val Radio: ForwardRefExoticComponent[RadioProps with RefAttributes[HTMLInputElement]] = js.native
  val Switch: ForwardRefExoticComponent[SwitchProps with RefAttributes[HTMLInputElement]] = js.native
  /**
    * The `ToggleContainer` component should generally be used around a
    * custom `"checkbox"`, `"radio"`, or `"switch"` component to help with
    * additional styles. This is mostly an internal component so I'm not
    * sure useful it will be though.
    */
  val ToggleContainer: ForwardRefExoticComponent[ToggleContainerProps with RefAttributes[HTMLDivElement]] = js.native
  def useChecked(defaultChecked: js.Function0[Boolean]): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
  def useChecked(defaultChecked: js.Function0[Boolean], onChange: ChangeEventHandler): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
  def useChecked(defaultChecked: Boolean): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
  def useChecked(defaultChecked: Boolean, onChange: ChangeEventHandler): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
}

