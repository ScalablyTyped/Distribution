package typings.semanticUiReact.selectSelectMod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.FunctionComponent
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.dropdownDividerMod.DropdownDividerProps
import typings.semanticUiReact.dropdownHeaderMod.DropdownHeaderProps
import typings.semanticUiReact.dropdownItemMod.DropdownItemProps
import typings.semanticUiReact.dropdownMenuMod.DropdownMenuProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectComponent extends FunctionComponent[SelectProps] {
  var Divider: ComponentClass[DropdownDividerProps, ComponentState] = js.native
  var Header: ComponentClass[DropdownHeaderProps, ComponentState] = js.native
  var Item: ComponentClass[DropdownItemProps, ComponentState] = js.native
  var Menu: StatelessComponent[DropdownMenuProps] = js.native
}

