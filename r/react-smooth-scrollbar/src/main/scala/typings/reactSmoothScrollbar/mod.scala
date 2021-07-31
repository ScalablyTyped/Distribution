package typings.reactSmoothScrollbar

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.smoothScrollbar.mod.default
import typings.smoothScrollbar.scrollbarMod.ScrollStatus
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-smooth-scrollbar", JSImport.Namespace)
  @js.native
  class ^ () extends Scrollbar
  
  @js.native
  trait Scrollbar
    extends Component[ScrollbarProps, js.Object, js.Any] {
    
    /**
      * Scrollbar instance
      */
    val scrollbar: default = js.native
  }
  
  /* Inlined parent std.Partial<smooth-scrollbar.smooth-scrollbar/interfaces.ScrollbarOptions> */
  trait ScrollbarProps extends StObject {
    
    /**
      * Keep scrollbar tracks visible whether it's scrolling or not
      * @default false
      */
    var alwaysShowTracks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional class name
      */
    var className: js.UndefOr[String] = js.undefined
    
    var continuousScrolling: js.UndefOr[Boolean] = js.undefined
    
    var damping: js.UndefOr[Double] = js.undefined
    
    var delegateTo: js.UndefOr[EventTarget | Null] = js.undefined
    
    /**
      * Pipe to scrollbar.addListener()
      */
    var onScroll: js.UndefOr[js.Function2[/* status */ ScrollStatus, /* scrollbarInstance */ default, Unit]] = js.undefined
    
    var plugins: js.UndefOr[js.Any] = js.undefined
    
    var renderByPixels: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional style
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var thumbMinSize: js.UndefOr[Double] = js.undefined
    
    var wheelEventTarget: js.UndefOr[EventTarget | Null] = js.undefined
  }
  object ScrollbarProps {
    
    @scala.inline
    def apply(): ScrollbarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollbarProps]
    }
    
    @scala.inline
    implicit class ScrollbarPropsMutableBuilder[Self <: ScrollbarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysShowTracks(value: Boolean): Self = StObject.set(x, "alwaysShowTracks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysShowTracksUndefined: Self = StObject.set(x, "alwaysShowTracks", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContinuousScrolling(value: Boolean): Self = StObject.set(x, "continuousScrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContinuousScrollingUndefined: Self = StObject.set(x, "continuousScrolling", js.undefined)
      
      @scala.inline
      def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
      
      @scala.inline
      def setDelegateTo(value: EventTarget): Self = StObject.set(x, "delegateTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelegateToNull: Self = StObject.set(x, "delegateTo", null)
      
      @scala.inline
      def setDelegateToUndefined: Self = StObject.set(x, "delegateTo", js.undefined)
      
      @scala.inline
      def setOnScroll(value: (/* status */ ScrollStatus, /* scrollbarInstance */ default) => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Any): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setRenderByPixels(value: Boolean): Self = StObject.set(x, "renderByPixels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderByPixelsUndefined: Self = StObject.set(x, "renderByPixels", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setThumbMinSize(value: Double): Self = StObject.set(x, "thumbMinSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbMinSizeUndefined: Self = StObject.set(x, "thumbMinSize", js.undefined)
      
      @scala.inline
      def setWheelEventTarget(value: EventTarget): Self = StObject.set(x, "wheelEventTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWheelEventTargetNull: Self = StObject.set(x, "wheelEventTarget", null)
      
      @scala.inline
      def setWheelEventTargetUndefined: Self = StObject.set(x, "wheelEventTarget", js.undefined)
    }
  }
}
