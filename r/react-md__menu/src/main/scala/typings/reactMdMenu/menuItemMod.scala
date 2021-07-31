package typings.reactMdMenu

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdList.listItemMod.ListItemProps
import typings.reactMdMenu.defaultMenuItemRendererMod._ValidMenuItem
import typings.reactMdMenu.reactMdMenuStrings.button
import typings.reactMdMenu.reactMdMenuStrings.menuitem
import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuItemMod {
  
  @JSImport("@react-md/menu/types/MenuItem", "MenuItem")
  @js.native
  val MenuItem: ForwardRefExoticComponent[MenuItemProps & RefAttributes[HTMLLIElement]] = js.native
  
  trait MenuItemProps
    extends StObject
       with ListItemProps
       with _ValidMenuItem {
    
    /**
      * The current role for the menu item. This will eventually be updated for
      * some of the other `menuitem*` widgets.
      */
    @JSName("role")
    var role_MenuItemProps: js.UndefOr[menuitem | button] = js.undefined
  }
  object MenuItemProps {
    
    @scala.inline
    def apply(): MenuItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItemProps]
    }
    
    @scala.inline
    implicit class MenuItemPropsMutableBuilder[Self <: MenuItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRole(value: menuitem | button): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
}
