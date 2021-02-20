package typings.rcMenu

import typings.rcMenu.interfaceMod.MenuClickEventHandler
import typings.rcMenu.interfaceMod.MenuInfo
import typings.rcMenu.rcMenuStrings.ltr
import typings.rcMenu.rcMenuStrings.rtl
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuItemGroupMod {
  
  @JSImport("rc-menu/es/MenuItemGroup", JSImport.Default)
  @js.native
  class default () extends MenuItemGroup
  object default {
    
    @JSImport("rc-menu/es/MenuItemGroup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-menu/es/MenuItemGroup", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-menu/es/MenuItemGroup", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      @scala.inline
      def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("rc-menu/es/MenuItemGroup", "default.isMenuItemGroup")
    @js.native
    def isMenuItemGroup: Boolean = js.native
    @scala.inline
    def isMenuItemGroup_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isMenuItemGroup")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait MenuItemGroup
    extends Component[MenuItemGroupProps, js.Object, js.Any] {
    
    def renderInnerMenuItem(item: ReactElement): ReactElement = js.native
  }
  
  @js.native
  trait MenuItemGroupProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var direction: js.UndefOr[ltr | rtl] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var index: js.UndefOr[Double] = js.native
    
    var onClick: js.UndefOr[MenuClickEventHandler] = js.native
    
    var renderMenuItem: js.UndefOr[
        js.Function3[/* item */ ReactElement, /* index */ Double, /* key */ String, ReactElement]
      ] = js.native
    
    var rootPrefixCls: js.UndefOr[String] = js.native
    
    var subMenuKey: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[ReactNode] = js.native
  }
  object MenuItemGroupProps {
    
    @scala.inline
    def apply(): MenuItemGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItemGroupProps]
    }
    
    @scala.inline
    implicit class MenuItemGroupPropsMutableBuilder[Self <: MenuItemGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* info */ MenuInfo => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setRenderMenuItem(value: (/* item */ ReactElement, /* index */ Double, /* key */ String) => ReactElement): Self = StObject.set(x, "renderMenuItem", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRenderMenuItemUndefined: Self = StObject.set(x, "renderMenuItem", js.undefined)
      
      @scala.inline
      def setRootPrefixCls(value: String): Self = StObject.set(x, "rootPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootPrefixClsUndefined: Self = StObject.set(x, "rootPrefixCls", js.undefined)
      
      @scala.inline
      def setSubMenuKey(value: String): Self = StObject.set(x, "subMenuKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubMenuKeyUndefined: Self = StObject.set(x, "subMenuKey", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
