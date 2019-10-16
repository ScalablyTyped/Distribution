package typings.rcDashMenu

import typings.rcDashMenu.libDividerMod.DividerProps
import typings.rcDashMenu.libMenuMod.MenuProps
import typings.react.reactMod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-menu/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  @js.native
  class ItemGroup ()
    extends typings.rcDashMenu.libMenuItemGroupMod.default
  
  @js.native
  class MenuItemGroup ()
    extends typings.rcDashMenu.libMenuItemGroupMod.default
  
  @js.native
  class default protected ()
    extends typings.rcDashMenu.libMenuMod.default {
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

