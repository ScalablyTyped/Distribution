package typings.reactMdMenu

import typings.react.mod.ReactNode
import typings.reactMdMenu.reactMdMenuStrings.separator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultMenuItemRendererMod {
  
  @JSImport("@react-md/menu/types/defaultMenuItemRenderer", "defaultMenuItemRenderer")
  @js.native
  def defaultMenuItemRenderer(item: ValidMenuItem, key: String): ReactNode = js.native
  
  type MenuItemRenderer = js.Function2[/* item */ ValidMenuItem, /* key */ String, ReactNode]
  
  /* Rewritten from type alias, can be one of: 
    - typings.react.mod.ReactNode
    - typings.reactMdMenu.menuItemMod.MenuItemProps
    - typings.reactMdMenu.anon.MenuItemSeparatorPropsrol
  */
  type ValidMenuItem = _ValidMenuItem | ReactNode
  
  trait _ValidMenuItem extends StObject
  object _ValidMenuItem {
    
    @scala.inline
    def MenuItemProps(): typings.reactMdMenu.menuItemMod.MenuItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reactMdMenu.menuItemMod.MenuItemProps]
    }
    
    @scala.inline
    def MenuItemSeparatorPropsrol(role: js.UndefOr[String] with separator): typings.reactMdMenu.anon.MenuItemSeparatorPropsrol = {
      val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactMdMenu.anon.MenuItemSeparatorPropsrol]
    }
  }
}
