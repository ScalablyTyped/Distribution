package typings.semanticUiReact.dropdownDropdownMod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.dropdownDividerMod.DropdownDividerProps
import typings.semanticUiReact.dropdownHeaderMod.DropdownHeaderProps
import typings.semanticUiReact.dropdownItemMod.DropdownItemProps
import typings.semanticUiReact.dropdownMenuMod.DropdownMenuProps
import typings.semanticUiReact.dropdownSearchInputMod.DropdownSearchInputProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropdownComponent extends ComponentClass[DropdownProps, ComponentState] {
  
  var Divider: ComponentClass[DropdownDividerProps, ComponentState] = js.native
  
  var Header: ComponentClass[DropdownHeaderProps, ComponentState] = js.native
  
  var Item: ComponentClass[DropdownItemProps, ComponentState] = js.native
  
  var Menu: StatelessComponent[DropdownMenuProps] = js.native
  
  var SearchInput: ComponentClass[DropdownSearchInputProps, ComponentState] = js.native
}
