package typings.reactMdForm

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdForm.menuItemCheckboxMod.MenuItemCheckboxProps
import typings.reactMdForm.menuItemFileInputMod.MenuItemFileInputProps
import typings.reactMdForm.menuItemInputToggleMod.BaseMenuItemInputToggleProps
import typings.reactMdForm.menuItemInputToggleMod.StrictMenuItemInputToggleProps
import typings.reactMdForm.menuItemSwitchMod.MenuItemSwitchProps
import typings.reactMdForm.menuItemTextFieldMod.MenuItemTextFieldProps
import typings.std.HTMLInputElement
import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuMod {
  
  @JSImport("@react-md/form/types/menu", "MenuItemCheckbox")
  @js.native
  val MenuItemCheckbox: ForwardRefExoticComponent[MenuItemCheckboxProps & RefAttributes[HTMLLIElement]] = js.native
  
  @JSImport("@react-md/form/types/menu", "MenuItemFileInput")
  @js.native
  val MenuItemFileInput: ForwardRefExoticComponent[MenuItemFileInputProps & RefAttributes[HTMLLIElement]] = js.native
  
  @JSImport("@react-md/form/types/menu", "MenuItemInputToggle")
  @js.native
  val MenuItemInputToggle: ForwardRefExoticComponent[StrictMenuItemInputToggleProps & RefAttributes[HTMLLIElement]] = js.native
  
  @JSImport("@react-md/form/types/menu", "MenuItemRadio")
  @js.native
  val MenuItemRadio: ForwardRefExoticComponent[BaseMenuItemInputToggleProps & RefAttributes[HTMLLIElement]] = js.native
  
  @JSImport("@react-md/form/types/menu", "MenuItemSwitch")
  @js.native
  val MenuItemSwitch: ForwardRefExoticComponent[MenuItemSwitchProps & RefAttributes[HTMLLIElement]] = js.native
  
  @JSImport("@react-md/form/types/menu", "MenuItemTextField")
  @js.native
  val MenuItemTextField: ForwardRefExoticComponent[MenuItemTextFieldProps & RefAttributes[HTMLInputElement]] = js.native
}
