package typings.reactBulmaComponents.anon

import typings.react.mod.ReactElement
import typings.reactBulmaComponents.componentsMod.BulmaComponent
import typings.reactBulmaComponents.componentsMod.ElementProps
import typings.reactBulmaComponents.navbarMod.NavbarBurgerProps
import typings.reactBulmaComponents.navbarMod.NavbarContainerProps
import typings.reactBulmaComponents.navbarMod.NavbarDropdownProps
import typings.reactBulmaComponents.navbarMod.NavbarItemProps
import typings.reactBulmaComponents.navbarMod.NavbarLinkProps
import typings.reactBulmaComponents.reactBulmaComponentsStrings.a
import typings.reactBulmaComponents.reactBulmaComponentsStrings.div
import typings.reactBulmaComponents.reactBulmaComponentsStrings.span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Brand extends StObject {
  
  var Brand: BulmaComponent[js.Object, div]
  
  var Burger: BulmaComponent[NavbarBurgerProps, div]
  
  var Container: BulmaComponent[NavbarContainerProps, div]
  
  var Divider: BulmaComponent[js.Object, div]
  
  var Dropdown: BulmaComponent[NavbarDropdownProps, span]
  
  var Item: BulmaComponent[NavbarItemProps, a]
  
  var Link: BulmaComponent[NavbarLinkProps, span]
  
  var Menu: BulmaComponent[js.Object, div]
}
object Brand {
  
  inline def apply(
    Brand: /* props */ js.Object & (ElementProps[js.Object, div]) => ReactElement,
    Burger: /* props */ NavbarBurgerProps & (ElementProps[NavbarBurgerProps, div]) => ReactElement,
    Container: /* props */ NavbarContainerProps & (ElementProps[NavbarContainerProps, div]) => ReactElement,
    Divider: /* props */ js.Object & (ElementProps[js.Object, div]) => ReactElement,
    Dropdown: /* props */ NavbarDropdownProps & (ElementProps[NavbarDropdownProps, span]) => ReactElement,
    Item: /* props */ NavbarItemProps & (ElementProps[NavbarItemProps, a]) => ReactElement,
    Link: /* props */ NavbarLinkProps & (ElementProps[NavbarLinkProps, span]) => ReactElement,
    Menu: /* props */ js.Object & (ElementProps[js.Object, div]) => ReactElement
  ): Brand = {
    val __obj = js.Dynamic.literal(Brand = js.Any.fromFunction1(Brand), Burger = js.Any.fromFunction1(Burger), Container = js.Any.fromFunction1(Container), Divider = js.Any.fromFunction1(Divider), Dropdown = js.Any.fromFunction1(Dropdown), Item = js.Any.fromFunction1(Item), Link = js.Any.fromFunction1(Link), Menu = js.Any.fromFunction1(Menu))
    __obj.asInstanceOf[Brand]
  }
  
  extension [Self <: Brand](x: Self) {
    
    inline def setBrand(value: /* props */ js.Object & (ElementProps[js.Object, div]) => ReactElement): Self = StObject.set(x, "Brand", js.Any.fromFunction1(value))
    
    inline def setBurger(value: /* props */ NavbarBurgerProps & (ElementProps[NavbarBurgerProps, div]) => ReactElement): Self = StObject.set(x, "Burger", js.Any.fromFunction1(value))
    
    inline def setContainer(
      value: /* props */ NavbarContainerProps & (ElementProps[NavbarContainerProps, div]) => ReactElement
    ): Self = StObject.set(x, "Container", js.Any.fromFunction1(value))
    
    inline def setDivider(value: /* props */ js.Object & (ElementProps[js.Object, div]) => ReactElement): Self = StObject.set(x, "Divider", js.Any.fromFunction1(value))
    
    inline def setDropdown(value: /* props */ NavbarDropdownProps & (ElementProps[NavbarDropdownProps, span]) => ReactElement): Self = StObject.set(x, "Dropdown", js.Any.fromFunction1(value))
    
    inline def setItem(value: /* props */ NavbarItemProps & (ElementProps[NavbarItemProps, a]) => ReactElement): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setLink(value: /* props */ NavbarLinkProps & (ElementProps[NavbarLinkProps, span]) => ReactElement): Self = StObject.set(x, "Link", js.Any.fromFunction1(value))
    
    inline def setMenu(value: /* props */ js.Object & (ElementProps[js.Object, div]) => ReactElement): Self = StObject.set(x, "Menu", js.Any.fromFunction1(value))
  }
}
