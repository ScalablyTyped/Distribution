package typings.rcDrawer

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDrawerPanelMod {
  
  object default {
    
    inline def apply(props: DrawerPanelProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("rc-drawer/es/DrawerPanel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rc-drawer/es/DrawerPanel", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait DrawerPanelProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var containerRef: js.UndefOr[Ref[HTMLDivElement]] = js.undefined
    
    var prefixCls: String
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object DrawerPanelProps {
    
    inline def apply(prefixCls: String): DrawerPanelProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawerPanelProps]
    }
    
    extension [Self <: DrawerPanelProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContainerRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
      
      inline def setContainerRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "containerRef", js.Any.fromFunction1(value))
      
      inline def setContainerRefNull: Self = StObject.set(x, "containerRef", null)
      
      inline def setContainerRefUndefined: Self = StObject.set(x, "containerRef", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait DrawerPanelRef extends StObject {
    
    var focus: VoidFunction
  }
  object DrawerPanelRef {
    
    inline def apply(focus: () => Unit): DrawerPanelRef = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[DrawerPanelRef]
    }
    
    extension [Self <: DrawerPanelRef](x: Self) {
      
      inline def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
}
