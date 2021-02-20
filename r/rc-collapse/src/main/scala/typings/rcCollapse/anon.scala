package typings.rcCollapse

import typings.rcCollapse.interfaceMod.CollapsibleType
import typings.rcMotion.cssmotionMod.CSSMotionProps
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined rc-collapse.rc-collapse/es/interface.CollapsePanelProps & {  children :react.react.ReactNode} & react.react.RefAttributes<std.HTMLDivElement> */
  @js.native
  trait CollapsePanelPropschildre extends StObject {
    
    var accordion: js.UndefOr[Boolean] = js.native
    
    var children: ReactNode = js.native
    
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
    
    var key: js.UndefOr[Key | Null] = js.native
    
    var onItemClick: js.UndefOr[js.Function1[/* panelKey */ String | Double, Unit]] = js.native
    
    var openMotion: js.UndefOr[CSSMotionProps] = js.native
    
    var panelKey: js.UndefOr[String | Double] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var ref: js.UndefOr[Ref[HTMLDivElement]] = js.native
    
    var role: js.UndefOr[String] = js.native
    
    var showArrow: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
  }
  object CollapsePanelPropschildre {
    
    @scala.inline
    def apply(): CollapsePanelPropschildre = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapsePanelPropschildre]
    }
    
    @scala.inline
    implicit class CollapsePanelPropschildreMutableBuilder[Self <: CollapsePanelPropschildre] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccordion(value: Boolean): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccordionUndefined: Self = StObject.set(x, "accordion", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
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
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNull: Self = StObject.set(x, "key", null)
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
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
      def setRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
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
  trait ForceRender extends StObject {
    
    var forceRender: Boolean = js.native
    
    var headerClass: String = js.native
    
    var isActive: Boolean = js.native
    
    def onItemClick(): Unit = js.native
    
    var showArrow: Boolean = js.native
  }
  object ForceRender {
    
    @scala.inline
    def apply(
      forceRender: Boolean,
      headerClass: String,
      isActive: Boolean,
      onItemClick: () => Unit,
      showArrow: Boolean
    ): ForceRender = {
      val __obj = js.Dynamic.literal(forceRender = forceRender.asInstanceOf[js.Any], headerClass = headerClass.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], onItemClick = js.Any.fromFunction0(onItemClick), showArrow = showArrow.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForceRender]
    }
    
    @scala.inline
    implicit class ForceRenderMutableBuilder[Self <: ForceRender] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderClass(value: String): Self = StObject.set(x, "headerClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnItemClick(value: () => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<rc-collapse.rc-collapse/es/Collapse.CollapseState> */
  @js.native
  trait PartialCollapseState extends StObject {
    
    var activeKey: js.UndefOr[js.Array[Key]] = js.native
  }
  object PartialCollapseState {
    
    @scala.inline
    def apply(): PartialCollapseState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialCollapseState]
    }
    
    @scala.inline
    implicit class PartialCollapseStateMutableBuilder[Self <: PartialCollapseState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveKey(value: js.Array[Key]): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
      
      @scala.inline
      def setActiveKeyVarargs(value: Key*): Self = StObject.set(x, "activeKey", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Typeofdefault extends StObject {
    
    /* static member */
    var defaultProps: ForceRender = js.native
  }
  object Typeofdefault {
    
    @scala.inline
    def apply(defaultProps: ForceRender): Typeofdefault = {
      val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofdefault]
    }
    
    @scala.inline
    implicit class TypeofdefaultMutableBuilder[Self <: Typeofdefault] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultProps(value: ForceRender): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    }
  }
}
