package typings.reactToolbox

import typings.reactToolbox.iconMenuMod.IconMenuProps
import typings.reactToolbox.menuDividerMod.MenuDividerProps
import typings.reactToolbox.menuItemMod.MenuItemProps
import typings.reactToolbox.menuMenuMod.MenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuMod {
  
  @JSImport("react-toolbox/components/menu", "IconMenu")
  @js.native
  open class IconMenu protected ()
    extends typings.reactToolbox.iconMenuMod.IconMenu {
    def this(props: IconMenuProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IconMenuProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/menu", "Menu")
  @js.native
  open class Menu protected ()
    extends typings.reactToolbox.menuMenuMod.Menu {
    def this(props: MenuProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MenuProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/menu", "MenuDivider")
  @js.native
  open class MenuDivider protected ()
    extends typings.reactToolbox.menuDividerMod.MenuDivider {
    def this(props: MenuDividerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MenuDividerProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/menu", "MenuItem")
  @js.native
  open class MenuItem protected ()
    extends typings.reactToolbox.menuItemMod.MenuItem {
    def this(props: MenuItemProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MenuItemProps, context: Any) = this()
  }
}
