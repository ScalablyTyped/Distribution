package typings.rcCollapse

import typings.rcCollapse.interfaceMod.CollapsibleType
import typings.rcMotion.cssmotionMod.CSSMotionProps
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined rc-collapse.rc-collapse/es/interface.CollapsePanelProps & {  children :react.react.ReactNode} & react.react.RefAttributes<std.HTMLDivElement> */
  trait CollapsePanelPropschildre extends StObject {
    
    var accordion: js.UndefOr[Boolean] = js.undefined
    
    var children: ReactNode
    
    var className: js.UndefOr[String] = js.undefined
    
    var collapsible: js.UndefOr[CollapsibleType] = js.undefined
    
    var destroyInactivePanel: js.UndefOr[Boolean] = js.undefined
    
    var expandIcon: js.UndefOr[js.Function1[/* props */ js.Object, ReactNode]] = js.undefined
    
    var extra: js.UndefOr[String | ReactNode] = js.undefined
    
    var forceRender: js.UndefOr[Boolean] = js.undefined
    
    var header: js.UndefOr[String | ReactNode] = js.undefined
    
    var headerClass: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var isActive: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[Key | Null] = js.undefined
    
    var onItemClick: js.UndefOr[js.Function1[/* panelKey */ String | Double, Unit]] = js.undefined
    
    var openMotion: js.UndefOr[CSSMotionProps] = js.undefined
    
    var panelKey: js.UndefOr[String | Double] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var ref: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var showArrow: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
  }
  object CollapsePanelPropschildre {
    
    inline def apply(): CollapsePanelPropschildre = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapsePanelPropschildre]
    }
    
    extension [Self <: CollapsePanelPropschildre](x: Self) {
      
      inline def setAccordion(value: Boolean): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
      
      inline def setAccordionUndefined: Self = StObject.set(x, "accordion", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCollapsible(value: CollapsibleType): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
      inline def setDestroyInactivePanel(value: Boolean): Self = StObject.set(x, "destroyInactivePanel", value.asInstanceOf[js.Any])
      
      inline def setDestroyInactivePanelUndefined: Self = StObject.set(x, "destroyInactivePanel", js.undefined)
      
      inline def setExpandIcon(value: /* props */ js.Object => ReactNode): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
      
      inline def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      inline def setExtra(value: String | ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      inline def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
      
      inline def setHeader(value: String | ReactNode): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderClass(value: String): Self = StObject.set(x, "headerClass", value.asInstanceOf[js.Any])
      
      inline def setHeaderClassUndefined: Self = StObject.set(x, "headerClass", js.undefined)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOnItemClick(value: /* panelKey */ String | Double => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction1(value))
      
      inline def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
      
      inline def setOpenMotion(value: CSSMotionProps): Self = StObject.set(x, "openMotion", value.asInstanceOf[js.Any])
      
      inline def setOpenMotionUndefined: Self = StObject.set(x, "openMotion", js.undefined)
      
      inline def setPanelKey(value: String | Double): Self = StObject.set(x, "panelKey", value.asInstanceOf[js.Any])
      
      inline def setPanelKeyUndefined: Self = StObject.set(x, "panelKey", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
      
      inline def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait ForceRender extends StObject {
    
    var forceRender: Boolean
    
    var headerClass: String
    
    var isActive: Boolean
    
    def onItemClick(): Unit
    
    var showArrow: Boolean
  }
  object ForceRender {
    
    inline def apply(
      forceRender: Boolean,
      headerClass: String,
      isActive: Boolean,
      onItemClick: () => Unit,
      showArrow: Boolean
    ): ForceRender = {
      val __obj = js.Dynamic.literal(forceRender = forceRender.asInstanceOf[js.Any], headerClass = headerClass.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], onItemClick = js.Any.fromFunction0(onItemClick), showArrow = showArrow.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForceRender]
    }
    
    extension [Self <: ForceRender](x: Self) {
      
      inline def setForceRender(value: Boolean): Self = StObject.set(x, "forceRender", value.asInstanceOf[js.Any])
      
      inline def setHeaderClass(value: String): Self = StObject.set(x, "headerClass", value.asInstanceOf[js.Any])
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setOnItemClick(value: () => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction0(value))
      
      inline def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<rc-collapse.rc-collapse/es/Collapse.CollapseState> */
  trait PartialCollapseState extends StObject {
    
    var activeKey: js.UndefOr[js.Array[Key]] = js.undefined
  }
  object PartialCollapseState {
    
    inline def apply(): PartialCollapseState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialCollapseState]
    }
    
    extension [Self <: PartialCollapseState](x: Self) {
      
      inline def setActiveKey(value: js.Array[Key]): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      inline def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
      
      inline def setActiveKeyVarargs(value: Key*): Self = StObject.set(x, "activeKey", js.Array(value :_*))
    }
  }
  
  trait Typeofdefault extends StObject {
    
    /* static member */
    var defaultProps: ForceRender
  }
  object Typeofdefault {
    
    inline def apply(defaultProps: ForceRender): Typeofdefault = {
      val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofdefault]
    }
    
    extension [Self <: Typeofdefault](x: Self) {
      
      inline def setDefaultProps(value: ForceRender): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    }
  }
}
