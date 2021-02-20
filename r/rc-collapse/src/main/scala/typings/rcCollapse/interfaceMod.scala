package typings.rcCollapse

import typings.rcCollapse.rcCollapseStrings.header
import typings.rcMotion.cssmotionMod.CSSMotionProps
import typings.react.mod.Key
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  @js.native
  trait CollapsePanelProps extends StObject {
    
    var accordion: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var collapsible: js.UndefOr[CollapsibleType] = js.native
    
    var destroyInactivePanel: js.UndefOr[Boolean] = js.native
    
    var expandIcon: js.UndefOr[js.Function1[/* props */ js.Object, ReactNode]] = js.native
    
    var extra: js.UndefOr[String | ReactNode] = js.native
    
    var forceRender: js.UndefOr[Boolean] = js.native
    
    var header: js.UndefOr[String | ReactNode] = js.native
    
    var headerClass: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var isActive: js.UndefOr[Boolean] = js.native
    
    var onItemClick: js.UndefOr[js.Function1[/* panelKey */ String | Double, Unit]] = js.native
    
    var openMotion: js.UndefOr[CSSMotionProps] = js.native
    
    var panelKey: js.UndefOr[String | Double] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var role: js.UndefOr[String] = js.native
    
    var showArrow: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
  }
  object CollapsePanelProps {
    
    @scala.inline
    def apply(): CollapsePanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapsePanelProps]
    }
    
    @scala.inline
    implicit class CollapsePanelPropsMutableBuilder[Self <: CollapsePanelProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccordion(value: Boolean): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccordionUndefined: Self = StObject.set(x, "accordion", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCollapsible(value: CollapsibleType): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
      @scala.inline
      def setDestroyInactivePanel(value: Boolean): Self = StObject.set(x, "destroyInactivePanel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyInactivePanelUndefined: Self = StObject.set(x, "destroyInactivePanel", js.undefined)
      
      @scala.inline
      def setExpandIcon(value: /* props */ js.Object => ReactNode): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      @scala.inline
      def setExtra(value: String | ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      @scala.inline
      def setHeader(value: String | ReactNode): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderClass(value: String): Self = StObject.set(x, "headerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderClassUndefined: Self = StObject.set(x, "headerClass", js.undefined)
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      @scala.inline
      def setOnItemClick(value: /* panelKey */ String | Double => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
      
      @scala.inline
      def setOpenMotion(value: CSSMotionProps): Self = StObject.set(x, "openMotion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenMotionUndefined: Self = StObject.set(x, "openMotion", js.undefined)
      
      @scala.inline
      def setPanelKey(value: String | Double): Self = StObject.set(x, "panelKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelKeyUndefined: Self = StObject.set(x, "panelKey", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait CollapseProps extends StObject {
    
    var accordion: js.UndefOr[Boolean] = js.native
    
    var activeKey: js.UndefOr[Key | js.Array[Key]] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var collapsible: js.UndefOr[CollapsibleType] = js.native
    
    var defaultActiveKey: js.UndefOr[Key | js.Array[Key]] = js.native
    
    var destroyInactivePanel: js.UndefOr[Boolean] = js.native
    
    var expandIcon: js.UndefOr[js.Function1[/* props */ js.Object, ReactNode]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* key */ Key | js.Array[Key], Unit]] = js.native
    
    var openMotion: js.UndefOr[CSSMotionProps] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
  }
  object CollapseProps {
    
    @scala.inline
    def apply(): CollapseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapseProps]
    }
    
    @scala.inline
    implicit class CollapsePropsMutableBuilder[Self <: CollapseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccordion(value: Boolean): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccordionUndefined: Self = StObject.set(x, "accordion", js.undefined)
      
      @scala.inline
      def setActiveKey(value: Key | js.Array[Key]): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
      
      @scala.inline
      def setActiveKeyVarargs(value: Key*): Self = StObject.set(x, "activeKey", js.Array(value :_*))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCollapsible(value: CollapsibleType): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
      @scala.inline
      def setDefaultActiveKey(value: Key | js.Array[Key]): Self = StObject.set(x, "defaultActiveKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultActiveKeyUndefined: Self = StObject.set(x, "defaultActiveKey", js.undefined)
      
      @scala.inline
      def setDefaultActiveKeyVarargs(value: Key*): Self = StObject.set(x, "defaultActiveKey", js.Array(value :_*))
      
      @scala.inline
      def setDestroyInactivePanel(value: Boolean): Self = StObject.set(x, "destroyInactivePanel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyInactivePanelUndefined: Self = StObject.set(x, "destroyInactivePanel", js.undefined)
      
      @scala.inline
      def setExpandIcon(value: /* props */ js.Object => ReactNode): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* key */ Key | js.Array[Key] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOpenMotion(value: CSSMotionProps): Self = StObject.set(x, "openMotion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenMotionUndefined: Self = StObject.set(x, "openMotion", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type CollapsibleType = Boolean | header
}
