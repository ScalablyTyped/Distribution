package typings.rcMenu

import typings.rcMenu.anon.BuiltinPlacements
import typings.rcMenu.anon.Disabled
import typings.rcMenu.anon.PartialMenuState
import typings.rcMenu.dividerMod.DividerProps
import typings.rcMenu.menuMod.MenuProps
import typings.rcMenu.menuMod.MenuState
import typings.react.mod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-menu", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val Divider: FC[DividerProps] = js.native
  
  val Item: js.Any = js.native
  
  val MenuItem: js.Any = js.native
  
  val SubMenu: js.Any = js.native
  
  @js.native
  class ItemGroup ()
    extends typings.rcMenu.menuItemGroupMod.default
  /* static members */
  @js.native
  object ItemGroup extends js.Object {
    
    var defaultProps: Disabled = js.native
    
    var isMenuItemGroup: Boolean = js.native
  }
  
  @js.native
  class MenuItemGroup ()
    extends typings.rcMenu.menuItemGroupMod.default
  /* static members */
  @js.native
  object MenuItemGroup extends js.Object {
    
    var defaultProps: Disabled = js.native
    
    var isMenuItemGroup: Boolean = js.native
  }
  
  @js.native
  class default protected ()
    extends typings.rcMenu.menuMod.default {
    def this(props: MenuProps) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: BuiltinPlacements = js.native
    
    def getDerivedStateFromProps(nextProps: MenuProps, prevState: MenuState): PartialMenuState = js.native
  }
}
