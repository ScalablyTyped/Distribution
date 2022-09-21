package typings.reachMenuButton

import typings.reachMenuButton.srcMod.MenuContextValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@reach/menu-button", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Menu
    *
    * The wrapper component for the other components. No DOM element is rendered.
    *
    * @see Docs https://reach.tech/menu-button#menu
    */
  @JSImport("@reach/menu-button", "Menu")
  @js.native
  val Menu: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<any, MenuProps> */ Any = js.native
  
  /**
    * MenuButton
    *
    * Wraps a DOM `button` that toggles the opening and closing of the dropdown
    * menu. Must be rendered inside of a `<Menu>`.
    *
    * @see Docs https://reach.tech/menu-button#menubutton
    */
  @JSImport("@reach/menu-button", "MenuButton")
  @js.native
  val MenuButton: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'button', MenuButtonProps> */ Any = js.native
  
  /**
    * MenuItem
    *
    * Handles menu selection. Must be a direct child of a `<MenuList>`.
    *
    * @see Docs https://reach.tech/menu-button#menuitem
    */
  @JSImport("@reach/menu-button", "MenuItem")
  @js.native
  val MenuItem: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', MenuItemProps> */ Any = js.native
  
  /**
    * MenuItems
    *
    * A low-level wrapper for menu items. Compose it with `MenuPopover` for more
    * control over the nested components and their rendered DOM nodes, or if you
    * need to nest arbitrary components between the outer wrapper and your list.
    *
    * @see Docs https://reach.tech/menu-button#menuitems
    */
  @JSImport("@reach/menu-button", "MenuItems")
  @js.native
  val MenuItems: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', MenuItemsProps> */ Any = js.native
  
  /**
    * MenuLink
    *
    * Handles linking to a different page in the menu. By default it renders `<a>`,
    * but also accepts any other kind of Link as long as the `Link` uses the
    * `React.forwardRef` API.
    *
    * Must be a direct child of a `<MenuList>`.
    *
    * @see Docs https://reach.tech/menu-button#menulink
    */
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  val MenuLink: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'a', MenuLinkProps> */ Any = js.native
  
  /**
    * MenuList
    *
    * Wraps a DOM element that renders the menu items. Must be rendered inside of
    * a `<Menu>`.
    *
    * @see Docs https://reach.tech/menu-button#menulist
    */
  @JSImport("@reach/menu-button", "MenuList")
  @js.native
  val MenuList: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', MenuListProps> */ Any = js.native
  
  /**
    * MenuPopover
    *
    * A low-level wrapper for the popover that appears when a menu button is open.
    * You can compose it with `MenuItems` for more control over the nested
    * components and their rendered DOM nodes, or if you need to nest arbitrary
    * components between the outer wrapper and your list.
    *
    * @see Docs https://reach.tech/menu-button#menupopover
    */
  @JSImport("@reach/menu-button", "MenuPopover")
  @js.native
  val MenuPopover: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polymorphic.ForwardRefComponent<'div', MenuPopoverProps> */ Any = js.native
  
  /**
    * A hook that exposes data for a given `Menu` component to its descendants.
    *
    * @see Docs https://reach.tech/menu-button#usemenubuttoncontext
    */
  inline def useMenuButtonContext(): MenuContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useMenuButtonContext")().asInstanceOf[MenuContextValue]
}
