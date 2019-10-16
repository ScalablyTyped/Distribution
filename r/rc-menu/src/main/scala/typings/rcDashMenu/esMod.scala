package typings.rcDashMenu

import typings.rcDashMenu.esDividerMod.DividerProps
import typings.rcDashMenu.esMenuMod.MenuProps
import typings.react.reactMod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-menu/es", JSImport.Namespace)
@js.native
object esMod extends js.Object {
  @js.native
  class ItemGroup ()
    extends typings.rcDashMenu.esMenuItemGroupMod.default
  
  @js.native
  class MenuItemGroup ()
    extends typings.rcDashMenu.esMenuItemGroupMod.default
  
  @js.native
  class default protected ()
    extends typings.rcDashMenu.esMenuMod.default {
    def this(props: MenuProps) = this()
  }
  
  val Divider: FC[DividerProps] = js.native
  val Item: js.Any = js.native
  val MenuItem: js.Any = js.native
  val SubMenu: js.Any = js.native
  /* static members */
  @js.native
  object ItemGroup extends js.Object {
    var defaultProps: Anon_Disabled = js.native
    var isMenuItemGroup: Boolean = js.native
  }
  
  /* static members */
  @js.native
  object MenuItemGroup extends js.Object {
    var defaultProps: Anon_Disabled = js.native
    var isMenuItemGroup: Boolean = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Anon_BuiltinPlacements = js.native
  }
  
}

