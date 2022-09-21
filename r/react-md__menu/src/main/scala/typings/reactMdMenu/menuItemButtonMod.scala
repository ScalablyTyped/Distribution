package typings.reactMdMenu

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdMenu.typesMod.BaseMenuItemButtonProps
import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuItemButtonMod {
  
  @JSImport("@react-md/menu/types/MenuItemButton", "MenuItemButton")
  @js.native
  val MenuItemButton: ForwardRefExoticComponent[MenuItemButtonProps & RefAttributes[HTMLLIElement]] = js.native
  
  trait MenuItemButtonProps
    extends StObject
       with BaseMenuItemButtonProps {
    
    /**
      * Boolean if the menu is currently visible which will rotate the dropdown
      * icon when the {@link BaseDropdownMenuItemProps.disableDropdownIcon} is not
      * `true`.
      */
    var visible: Boolean
  }
  object MenuItemButtonProps {
    
    inline def apply(id: String, visible: Boolean): MenuItemButtonProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuItemButtonProps]
    }
    
    extension [Self <: MenuItemButtonProps](x: Self) {
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
