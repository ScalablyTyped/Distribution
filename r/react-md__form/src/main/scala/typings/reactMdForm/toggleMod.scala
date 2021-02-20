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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleMod {
  
  @JSImport("@react-md/form/types/toggle", "AsyncSwitch")
  @js.native
  val AsyncSwitch: ForwardRefExoticComponent[AsyncSwitchProps with RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form/types/toggle", "Checkbox")
  @js.native
  val Checkbox: ForwardRefExoticComponent[CheckboxProps with RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form/types/toggle", "InputToggle")
  @js.native
  val InputToggle: ForwardRefExoticComponent[InputTogglePropstyperadio | InputTogglePropstypecheck] = js.native
  
  @JSImport("@react-md/form/types/toggle", "Radio")
  @js.native
  val Radio: ForwardRefExoticComponent[RadioProps with RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form/types/toggle", "Switch")
  @js.native
  val Switch: ForwardRefExoticComponent[SwitchProps with RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form/types/toggle", "ToggleContainer")
  @js.native
  val ToggleContainer: ForwardRefExoticComponent[ToggleContainerProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/form/types/toggle", "useChecked")
  @js.native
  def useChecked(defaultChecked: js.Function0[Boolean]): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
  @JSImport("@react-md/form/types/toggle", "useChecked")
  @js.native
  def useChecked(defaultChecked: js.Function0[Boolean], onChange: ChangeEventHandler): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
  @JSImport("@react-md/form/types/toggle", "useChecked")
  @js.native
  def useChecked(defaultChecked: Boolean): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
  @JSImport("@react-md/form/types/toggle", "useChecked")
  @js.native
  def useChecked(defaultChecked: Boolean, onChange: ChangeEventHandler): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
}
