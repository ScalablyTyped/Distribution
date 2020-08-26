package typings.reactMdMenu

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/menu/types/defaultMenuItemRenderer", JSImport.Namespace)
@js.native
object defaultMenuItemRendererMod extends js.Object {
  trait _ValidMenuItem extends js.Object
  
  def default(item: ValidMenuItem, key: String): ReactNode = js.native
  type MenuItemRenderer = js.Function2[/* item */ ValidMenuItem, /* key */ String, ReactNode]
  /* Rewritten from type alias, can be one of: 
    - typings.react.mod.ReactNode
    - typings.reactMdMenu.menuItemMod.MenuItemProps
    - typings.reactMdMenu.anon.MenuItemSeparatorPropsrol
  */
  type ValidMenuItem = _ValidMenuItem | ReactNode
}

