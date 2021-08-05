package typings.rcMenu

import typings.rcMenu.anon.PartialMenuState
import typings.rcMenu.dividerMod.DividerProps
import typings.rcMenu.menuMod.MenuProps
import typings.rcMenu.menuMod.MenuState
import typings.react.mod.FC
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-menu", JSImport.Default)
  @js.native
  class default protected ()
    extends typings.rcMenu.menuMod.default {
    def this(props: MenuProps) = this()
  }
  object default {
    
    @JSImport("rc-menu", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-menu", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-menu", "default.defaultProps.className")
      @js.native
      def className: String = js.native
      inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-menu", "default.defaultProps.defaultOpenKeys")
      @js.native
      def defaultOpenKeys: js.Array[js.Any] = js.native
      inline def defaultOpenKeys_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOpenKeys")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-menu", "default.defaultProps.defaultSelectedKeys")
      @js.native
      def defaultSelectedKeys: js.Array[js.Any] = js.native
      inline def defaultSelectedKeys_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedKeys")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-menu", "default.defaultProps.mode")
      @js.native
      def mode: String = js.native
      inline def mode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-menu", "default.defaultProps.onClick")
      @js.native
      def onClick: js.Function0[Unit] = js.native
      inline def onClick_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-menu", "default.defaultProps.onDeselect")
      @js.native
      def onDeselect: js.Function0[Unit] = js.native
      inline def onDeselect_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onDeselect")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-menu", "default.defaultProps.onOpenChange")
      @js.native
      def onOpenChange: js.Function0[Unit] = js.native
      inline def onOpenChange_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onOpenChange")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-menu", "default.defaultProps.onSelect")
      @js.native
      def onSelect: js.Function0[Unit] = js.native
      inline def onSelect_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-menu", "default.defaultProps.overflowedIndicator")
      @js.native
      def overflowedIndicator: Element = js.native
      inline def overflowedIndicator_=(x: Element): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overflowedIndicator")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-menu", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      inline def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-menu", "default.defaultProps.selectable")
      @js.native
      def selectable: Boolean = js.native
      inline def selectable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectable")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-menu", "default.defaultProps.subMenuCloseDelay")
      @js.native
      def subMenuCloseDelay: Double = js.native
      inline def subMenuCloseDelay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subMenuCloseDelay")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-menu", "default.defaultProps.subMenuOpenDelay")
      @js.native
      def subMenuOpenDelay: Double = js.native
      inline def subMenuOpenDelay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subMenuOpenDelay")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-menu", "default.defaultProps.triggerSubMenuAction")
      @js.native
      def triggerSubMenuAction: String = js.native
      inline def triggerSubMenuAction_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("triggerSubMenuAction")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    inline def getDerivedStateFromProps(nextProps: MenuProps, prevState: MenuState): PartialMenuState = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any], prevState.asInstanceOf[js.Any])).asInstanceOf[PartialMenuState]
  }
  
  @JSImport("rc-menu", "Divider")
  @js.native
  val Divider: FC[DividerProps] = js.native
  
  @JSImport("rc-menu", "Item")
  @js.native
  val Item: js.Any = js.native
  
  @JSImport("rc-menu", "ItemGroup")
  @js.native
  class ItemGroup ()
    extends typings.rcMenu.menuItemGroupMod.default
  object ItemGroup {
    
    @JSImport("rc-menu", "ItemGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-menu", "ItemGroup.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-menu", "ItemGroup.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("rc-menu", "ItemGroup.isMenuItemGroup")
    @js.native
    def isMenuItemGroup: Boolean = js.native
    inline def isMenuItemGroup_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isMenuItemGroup")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rc-menu", "MenuItem")
  @js.native
  val MenuItem: js.Any = js.native
  
  @JSImport("rc-menu", "MenuItemGroup")
  @js.native
  class MenuItemGroup ()
    extends typings.rcMenu.menuItemGroupMod.default
  object MenuItemGroup {
    
    @JSImport("rc-menu", "MenuItemGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-menu", "MenuItemGroup.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-menu", "MenuItemGroup.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("rc-menu", "MenuItemGroup.isMenuItemGroup")
    @js.native
    def isMenuItemGroup: Boolean = js.native
    inline def isMenuItemGroup_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isMenuItemGroup")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rc-menu", "SubMenu")
  @js.native
  val SubMenu: js.Any = js.native
}
