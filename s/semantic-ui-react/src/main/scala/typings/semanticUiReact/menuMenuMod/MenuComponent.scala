package typings.semanticUiReact.menuMenuMod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.menuHeaderMod.MenuHeaderProps
import typings.semanticUiReact.menuItemMod.MenuItemProps
import typings.semanticUiReact.menuMenuMenuMod.MenuMenuProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuComponent extends ComponentClass[MenuProps, ComponentState] {
  var Header: ComponentClass[MenuHeaderProps, ComponentState] = js.native
  var Item: ComponentClass[MenuItemProps, ComponentState] = js.native
  var Menu: StatelessComponent[MenuMenuProps] = js.native
}

