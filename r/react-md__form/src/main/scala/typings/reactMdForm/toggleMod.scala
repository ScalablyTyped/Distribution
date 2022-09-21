package typings.reactMdForm

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdForm.asyncSwitchMod.AsyncSwitchProps
import typings.reactMdForm.checkboxMod.CheckboxProps
import typings.reactMdForm.inputToggleIconMod.InputToggleIconProps
import typings.reactMdForm.inputToggleMod.Props
import typings.reactMdForm.radioMod.RadioProps
import typings.reactMdForm.switchMod.SwitchProps
import typings.reactMdForm.switchTrackMod.SwitchTrackProps
import typings.reactMdForm.toggleContainerMod.ToggleContainerProps
import typings.reactMdForm.useCheckedMod.ChangeEventHandler
import typings.reactMdForm.useCheckedMod.SetChecked
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleMod {
  
  @JSImport("@react-md/form/types/toggle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/form/types/toggle", "AsyncSwitch")
  @js.native
  val AsyncSwitch: ForwardRefExoticComponent[AsyncSwitchProps & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form/types/toggle", "Checkbox")
  @js.native
  val Checkbox: ForwardRefExoticComponent[CheckboxProps & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form/types/toggle", "InputToggle")
  @js.native
  val InputToggle: ForwardRefExoticComponent[Props & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form/types/toggle", "InputToggleIcon")
  @js.native
  val InputToggleIcon: ForwardRefExoticComponent[InputToggleIconProps & RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/form/types/toggle", "Radio")
  @js.native
  val Radio: ForwardRefExoticComponent[RadioProps & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form/types/toggle", "Switch")
  @js.native
  val Switch: ForwardRefExoticComponent[SwitchProps & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form/types/toggle", "SwitchTrack")
  @js.native
  val SwitchTrack: ForwardRefExoticComponent[SwitchTrackProps & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form/types/toggle", "ToggleContainer")
  @js.native
  val ToggleContainer: ForwardRefExoticComponent[ToggleContainerProps & RefAttributes[HTMLDivElement]] = js.native
  
  inline def useChecked(defaultChecked: js.Function0[Boolean]): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = ^.asInstanceOf[js.Dynamic].applyDynamic("useChecked")(defaultChecked.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[Boolean, ChangeEventHandler, SetChecked]]
  inline def useChecked(defaultChecked: js.Function0[Boolean], onChange: ChangeEventHandler): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = (^.asInstanceOf[js.Dynamic].applyDynamic("useChecked")(defaultChecked.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Boolean, ChangeEventHandler, SetChecked]]
  inline def useChecked(defaultChecked: Boolean): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = ^.asInstanceOf[js.Dynamic].applyDynamic("useChecked")(defaultChecked.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[Boolean, ChangeEventHandler, SetChecked]]
  inline def useChecked(defaultChecked: Boolean, onChange: ChangeEventHandler): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = (^.asInstanceOf[js.Dynamic].applyDynamic("useChecked")(defaultChecked.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Boolean, ChangeEventHandler, SetChecked]]
}
