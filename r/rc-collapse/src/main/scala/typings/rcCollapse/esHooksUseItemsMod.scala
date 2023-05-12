package typings.rcCollapse

import typings.rcCollapse.esInterfaceMod.CollapsibleType
import typings.rcCollapse.esInterfaceMod.ItemType
import typings.rcMotion.esCssmotionMod.CSSMotionProps
import typings.react.mod.Key
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseItemsMod {
  
  @JSImport("rc-collapse/es/hooks/useItems", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Array[ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Array[ReactElement]]
  inline def default(items: js.Array[ItemType]): js.Array[ReactElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[ReactElement]]
  inline def default(items: js.Array[ItemType], rawChildren: Unit, props: Props): js.Array[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any], rawChildren.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactElement]]
  inline def default(items: js.Array[ItemType], rawChildren: ReactNode): js.Array[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any], rawChildren.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactElement]]
  inline def default(items: js.Array[ItemType], rawChildren: ReactNode, props: Props): js.Array[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any], rawChildren.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactElement]]
  inline def default(items: Unit, rawChildren: Unit, props: Props): js.Array[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any], rawChildren.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactElement]]
  inline def default(items: Unit, rawChildren: ReactNode): js.Array[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any], rawChildren.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactElement]]
  inline def default(items: Unit, rawChildren: ReactNode, props: Props): js.Array[ReactElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any], rawChildren.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Array[ReactElement]]
  
  /* Inlined std.Pick<rc-collapse.rc-collapse/es/interface.CollapsePanelProps, 'prefixCls' | 'onItemClick' | 'openMotion' | 'expandIcon'> & std.Pick<rc-collapse.rc-collapse/es/interface.CollapseProps, 'accordion' | 'collapsible' | 'destroyInactivePanel'> & {  activeKey :std.Array<react.react.Key>} */
  trait Props extends StObject {
    
    var accordion: js.UndefOr[Boolean] = js.undefined
    
    var activeKey: js.Array[Key]
    
    var collapsible: js.UndefOr[CollapsibleType] = js.undefined
    
    var destroyInactivePanel: js.UndefOr[Boolean] = js.undefined
    
    var expandIcon: js.UndefOr[js.Function1[/* props */ js.Object, ReactNode]] = js.undefined
    
    var onItemClick: js.UndefOr[js.Function1[/* panelKey */ String | Double, Unit]] = js.undefined
    
    var openMotion: js.UndefOr[CSSMotionProps] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
  }
  object Props {
    
    inline def apply(activeKey: js.Array[Key]): Props = {
      val __obj = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setAccordion(value: Boolean): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
      
      inline def setAccordionUndefined: Self = StObject.set(x, "accordion", js.undefined)
      
      inline def setActiveKey(value: js.Array[Key]): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      inline def setActiveKeyVarargs(value: Key*): Self = StObject.set(x, "activeKey", js.Array(value*))
      
      inline def setCollapsible(value: CollapsibleType): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      inline def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
      inline def setDestroyInactivePanel(value: Boolean): Self = StObject.set(x, "destroyInactivePanel", value.asInstanceOf[js.Any])
      
      inline def setDestroyInactivePanelUndefined: Self = StObject.set(x, "destroyInactivePanel", js.undefined)
      
      inline def setExpandIcon(value: /* props */ js.Object => ReactNode): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
      
      inline def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      inline def setOnItemClick(value: /* panelKey */ String | Double => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction1(value))
      
      inline def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
      
      inline def setOpenMotion(value: CSSMotionProps): Self = StObject.set(x, "openMotion", value.asInstanceOf[js.Any])
      
      inline def setOpenMotionUndefined: Self = StObject.set(x, "openMotion", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
}
