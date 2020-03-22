package typings.reactBulmaComponents.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.reactBulmaComponents.reactBulmaComponentsStrings.div
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Navbar extends ForwardRefExoticComponent[PropsWithoutRef[NavbarProps] with RefAttributes[_]] {
  var Brand: ForwardRefExoticComponent[PropsWithoutRef[NavbarBrandProps] with RefAttributes[div]] = js.native
  var Burger: ForwardRefExoticComponent[PropsWithoutRef[NavbarBurgerProps] with RefAttributes[div]] = js.native
  var Container: ForwardRefExoticComponent[PropsWithoutRef[NavbarContainerProps] with RefAttributes[_]] = js.native
  var Divider: ForwardRefExoticComponent[PropsWithoutRef[NavbarDividerProps] with RefAttributes[div]] = js.native
  var Dropdown: ForwardRefExoticComponent[PropsWithoutRef[NavbarDropdownProps] with RefAttributes[_]] = js.native
  var Item: ForwardRefExoticComponent[PropsWithoutRef[NavbarItemProps] with RefAttributes[_]] = js.native
  var Link: ForwardRefExoticComponent[PropsWithoutRef[NavbarLinkProps] with RefAttributes[_]] = js.native
  var Menu: ForwardRefExoticComponent[PropsWithoutRef[NavbarMenuProps] with RefAttributes[div]] = js.native
}

@JSImport("react-bulma-components", "Navbar")
@js.native
object Navbar extends TopLevel[Navbar]

