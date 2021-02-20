package typings.reactMdMenu

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdList.listItemLinkMod.ListItemLinkProps
import typings.reactMdList.listItemLinkMod.ListItemLinkWithComponentProps
import typings.reactMdMenu.reactMdMenuStrings.menuitem
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuItemLinkMod {
  
  @JSImport("@react-md/menu/types/MenuItemLink", "MenuItemLink")
  @js.native
  val MenuItemLink: ForwardRefExoticComponent[
    (MenuItemLinkProps with RefAttributes[HTMLAnchorElement]) | (MenuItemLinkProps with ListItemLinkWithComponentProps with RefAttributes[HTMLAnchorElement])
  ] = js.native
  
  @js.native
  trait MenuItemLinkProps extends ListItemLinkProps {
    
    /**
      * The current role for the menu item. This will eventually be updated for
      * some of the other `menuitem*` widgets.
      */
    @JSName("role")
    var role_MenuItemLinkProps: js.UndefOr[menuitem] = js.native
  }
  object MenuItemLinkProps {
    
    @scala.inline
    def apply(): MenuItemLinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItemLinkProps]
    }
    
    @scala.inline
    implicit class MenuItemLinkPropsMutableBuilder[Self <: MenuItemLinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRole(value: menuitem): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
  
  type MenuItemLinkWithComponentProps = MenuItemLinkProps with ListItemLinkWithComponentProps
}
