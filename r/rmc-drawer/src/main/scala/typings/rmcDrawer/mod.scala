package typings.rmcDrawer

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.rmcDrawer.anon.OverlayClicked
import typings.rmcDrawer.anon.PartialDrawerProps
import typings.rmcDrawer.rmcDrawerStrings.bottom
import typings.rmcDrawer.rmcDrawerStrings.left
import typings.rmcDrawer.rmcDrawerStrings.right
import typings.rmcDrawer.rmcDrawerStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rmc-drawer", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[PartialDrawerProps, js.Object, js.Any]
  
  type Drawer = Component[PartialDrawerProps, js.Object, js.Any]
  
  trait DrawerProps extends StObject {
    
    var children: js.UndefOr[ReactNode | js.Array[ReactNode]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var contentStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var docked: js.UndefOr[Boolean] = js.undefined
    
    var dragHandleStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var dragToggleDistance: js.UndefOr[Double] = js.undefined
    
    var enableDragHandle: js.UndefOr[Boolean] = js.undefined
    
    var onOpenChange: js.UndefOr[js.Function2[/* open */ Boolean, /* overlay */ js.UndefOr[OverlayClicked], Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var overlayStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var position: js.UndefOr[left | right | top | bottom] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var sidebar: js.UndefOr[ReactNode] = js.undefined
    
    var sidebarStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var touch: js.UndefOr[Boolean] = js.undefined
    
    var transitions: js.UndefOr[Boolean] = js.undefined
  }
  object DrawerProps {
    
    @scala.inline
    def apply(): DrawerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawerProps]
    }
    
    @scala.inline
    implicit class DrawerPropsMutableBuilder[Self <: DrawerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode | js.Array[ReactNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      @scala.inline
      def setDocked(value: Boolean): Self = StObject.set(x, "docked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDockedUndefined: Self = StObject.set(x, "docked", js.undefined)
      
      @scala.inline
      def setDragHandleStyle(value: CSSProperties): Self = StObject.set(x, "dragHandleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragHandleStyleUndefined: Self = StObject.set(x, "dragHandleStyle", js.undefined)
      
      @scala.inline
      def setDragToggleDistance(value: Double): Self = StObject.set(x, "dragToggleDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragToggleDistanceUndefined: Self = StObject.set(x, "dragToggleDistance", js.undefined)
      
      @scala.inline
      def setEnableDragHandle(value: Boolean): Self = StObject.set(x, "enableDragHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableDragHandleUndefined: Self = StObject.set(x, "enableDragHandle", js.undefined)
      
      @scala.inline
      def setOnOpenChange(value: (/* open */ Boolean, /* overlay */ js.UndefOr[OverlayClicked]) => Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setOverlayStyle(value: CSSProperties): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      @scala.inline
      def setPosition(value: left | right | top | bottom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setSidebar(value: ReactNode): Self = StObject.set(x, "sidebar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSidebarStyle(value: CSSProperties): Self = StObject.set(x, "sidebarStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSidebarStyleUndefined: Self = StObject.set(x, "sidebarStyle", js.undefined)
      
      @scala.inline
      def setSidebarUndefined: Self = StObject.set(x, "sidebar", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTouch(value: Boolean): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
      
      @scala.inline
      def setTransitions(value: Boolean): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
    }
  }
}
