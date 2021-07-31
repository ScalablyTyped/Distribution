package typings.reactSidebar

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactSidebar.anon.PartialCSSStyleDeclaratio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-sidebar", JSImport.Default)
  @js.native
  class default ()
    extends Component[SidebarProps, js.Object, js.Any]
  
  type Sidebar = Component[SidebarProps, js.Object, js.Any]
  
  trait SidebarProps extends StObject {
    
    var contentClassName: js.UndefOr[String] = js.undefined
    
    var contentId: js.UndefOr[String] = js.undefined
    
    var defaultSidebarWidth: js.UndefOr[Double] = js.undefined
    
    var docked: js.UndefOr[Boolean] = js.undefined
    
    var dragToggleDistance: js.UndefOr[Double] = js.undefined
    
    var onSetOpen: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var overlayClassName: js.UndefOr[String] = js.undefined
    
    var overlayId: js.UndefOr[String] = js.undefined
    
    var pullRight: js.UndefOr[Boolean] = js.undefined
    
    var rootClassName: js.UndefOr[String] = js.undefined
    
    var rootId: js.UndefOr[String] = js.undefined
    
    var shadow: js.UndefOr[Boolean] = js.undefined
    
    var sidebar: js.UndefOr[ReactNode] = js.undefined
    
    var sidebarClassName: js.UndefOr[String] = js.undefined
    
    var sidebarId: js.UndefOr[String] = js.undefined
    
    var styles: js.UndefOr[SidebarStyles] = js.undefined
    
    var touch: js.UndefOr[Boolean] = js.undefined
    
    var touchHandleWidth: js.UndefOr[Double] = js.undefined
    
    var transitions: js.UndefOr[Boolean] = js.undefined
  }
  object SidebarProps {
    
    @scala.inline
    def apply(): SidebarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidebarProps]
    }
    
    @scala.inline
    implicit class SidebarPropsMutableBuilder[Self <: SidebarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      @scala.inline
      def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentIdUndefined: Self = StObject.set(x, "contentId", js.undefined)
      
      @scala.inline
      def setDefaultSidebarWidth(value: Double): Self = StObject.set(x, "defaultSidebarWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSidebarWidthUndefined: Self = StObject.set(x, "defaultSidebarWidth", js.undefined)
      
      @scala.inline
      def setDocked(value: Boolean): Self = StObject.set(x, "docked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDockedUndefined: Self = StObject.set(x, "docked", js.undefined)
      
      @scala.inline
      def setDragToggleDistance(value: Double): Self = StObject.set(x, "dragToggleDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragToggleDistanceUndefined: Self = StObject.set(x, "dragToggleDistance", js.undefined)
      
      @scala.inline
      def setOnSetOpen(value: /* open */ Boolean => Unit): Self = StObject.set(x, "onSetOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSetOpenUndefined: Self = StObject.set(x, "onSetOpen", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setOverlayClassName(value: String): Self = StObject.set(x, "overlayClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayClassNameUndefined: Self = StObject.set(x, "overlayClassName", js.undefined)
      
      @scala.inline
      def setOverlayId(value: String): Self = StObject.set(x, "overlayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayIdUndefined: Self = StObject.set(x, "overlayId", js.undefined)
      
      @scala.inline
      def setPullRight(value: Boolean): Self = StObject.set(x, "pullRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullRightUndefined: Self = StObject.set(x, "pullRight", js.undefined)
      
      @scala.inline
      def setRootClassName(value: String): Self = StObject.set(x, "rootClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootClassNameUndefined: Self = StObject.set(x, "rootClassName", js.undefined)
      
      @scala.inline
      def setRootId(value: String): Self = StObject.set(x, "rootId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootIdUndefined: Self = StObject.set(x, "rootId", js.undefined)
      
      @scala.inline
      def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
      
      @scala.inline
      def setSidebar(value: ReactNode): Self = StObject.set(x, "sidebar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSidebarClassName(value: String): Self = StObject.set(x, "sidebarClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSidebarClassNameUndefined: Self = StObject.set(x, "sidebarClassName", js.undefined)
      
      @scala.inline
      def setSidebarId(value: String): Self = StObject.set(x, "sidebarId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSidebarIdUndefined: Self = StObject.set(x, "sidebarId", js.undefined)
      
      @scala.inline
      def setSidebarUndefined: Self = StObject.set(x, "sidebar", js.undefined)
      
      @scala.inline
      def setStyles(value: SidebarStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTouch(value: Boolean): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchHandleWidth(value: Double): Self = StObject.set(x, "touchHandleWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchHandleWidthUndefined: Self = StObject.set(x, "touchHandleWidth", js.undefined)
      
      @scala.inline
      def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
      
      @scala.inline
      def setTransitions(value: Boolean): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
    }
  }
  
  trait SidebarStyles extends StObject {
    
    var content: js.UndefOr[PartialCSSStyleDeclaratio] = js.undefined
    
    var dragHandle: js.UndefOr[PartialCSSStyleDeclaratio] = js.undefined
    
    var overlay: js.UndefOr[PartialCSSStyleDeclaratio] = js.undefined
    
    var root: js.UndefOr[PartialCSSStyleDeclaratio] = js.undefined
    
    var sidebar: js.UndefOr[PartialCSSStyleDeclaratio] = js.undefined
  }
  object SidebarStyles {
    
    @scala.inline
    def apply(): SidebarStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidebarStyles]
    }
    
    @scala.inline
    implicit class SidebarStylesMutableBuilder[Self <: SidebarStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDragHandle(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "dragHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragHandleUndefined: Self = StObject.set(x, "dragHandle", js.undefined)
      
      @scala.inline
      def setOverlay(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setRoot(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setSidebar(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "sidebar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSidebarUndefined: Self = StObject.set(x, "sidebar", js.undefined)
    }
  }
}
