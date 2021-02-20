package typings.smoothScrollbar

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.smoothScrollbar.scrollbarMod.Scrollbar
import typings.smoothScrollbar.smoothScrollbarMod.ScrollbarPlugin
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Bottom extends StObject {
    
    var bottom: Double = js.native
    
    var left: Double = js.native
    
    var right: Double = js.native
    
    var top: Double = js.native
  }
  object Bottom {
    
    @scala.inline
    def apply(bottom: Double, left: Double, right: Double, top: Double): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit class BottomMutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Get extends StObject {
    
    def get(): js.Any = js.native
  }
  object Get {
    
    @scala.inline
    def apply(get: () => js.Any): Get = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get))
      __obj.asInstanceOf[Get]
    }
    
    @scala.inline
    implicit class GetMutableBuilder[Self <: Get] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: () => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined std.Partial<smooth-scrollbar.smooth-scrollbar/interfaces.ScrollIntoViewOptions> */
  @js.native
  trait PartialScrollIntoViewOpti extends StObject {
    
    var alignToTop: js.UndefOr[Boolean] = js.native
    
    var offsetBottom: js.UndefOr[Double] = js.native
    
    var offsetLeft: js.UndefOr[Double] = js.native
    
    var offsetTop: js.UndefOr[Double] = js.native
    
    var onlyScrollIfNeeded: js.UndefOr[Boolean] = js.native
  }
  object PartialScrollIntoViewOpti {
    
    @scala.inline
    def apply(): PartialScrollIntoViewOpti = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialScrollIntoViewOpti]
    }
    
    @scala.inline
    implicit class PartialScrollIntoViewOptiMutableBuilder[Self <: PartialScrollIntoViewOpti] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignToTop(value: Boolean): Self = StObject.set(x, "alignToTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignToTopUndefined: Self = StObject.set(x, "alignToTop", js.undefined)
      
      @scala.inline
      def setOffsetBottom(value: Double): Self = StObject.set(x, "offsetBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetBottomUndefined: Self = StObject.set(x, "offsetBottom", js.undefined)
      
      @scala.inline
      def setOffsetLeft(value: Double): Self = StObject.set(x, "offsetLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetLeftUndefined: Self = StObject.set(x, "offsetLeft", js.undefined)
      
      @scala.inline
      def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetTopUndefined: Self = StObject.set(x, "offsetTop", js.undefined)
      
      @scala.inline
      def setOnlyScrollIfNeeded(value: Boolean): Self = StObject.set(x, "onlyScrollIfNeeded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyScrollIfNeededUndefined: Self = StObject.set(x, "onlyScrollIfNeeded", js.undefined)
    }
  }
  
  /* Inlined std.Partial<smooth-scrollbar.smooth-scrollbar/interfaces.ScrollToOptions> */
  @js.native
  trait PartialScrollToOptions extends StObject {
    
    var callback: js.UndefOr[js.ThisFunction0[/* this */ this.type, Unit]] = js.native
    
    var easing: js.UndefOr[js.Function1[/* percent */ Double, Double]] = js.native
  }
  object PartialScrollToOptions {
    
    @scala.inline
    def apply(): PartialScrollToOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialScrollToOptions]
    }
    
    @scala.inline
    implicit class PartialScrollToOptionsMutableBuilder[Self <: PartialScrollToOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: js.ThisFunction0[PartialScrollToOptions, Unit]): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setEasing(value: /* percent */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    }
  }
  
  /* Inlined std.Partial<smooth-scrollbar.smooth-scrollbar/interfaces.ScrollToOptions> */
  @js.native
  trait PartialScrollToOptionsCallback extends StObject {
    
    var callback: js.UndefOr[js.ThisFunction0[/* this */ Scrollbar, Unit]] = js.native
    
    var easing: js.UndefOr[js.Function1[/* percent */ Double, Double]] = js.native
  }
  object PartialScrollToOptionsCallback {
    
    @scala.inline
    def apply(): PartialScrollToOptionsCallback = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialScrollToOptionsCallback]
    }
    
    @scala.inline
    implicit class PartialScrollToOptionsCallbackMutableBuilder[Self <: PartialScrollToOptionsCallback] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: js.ThisFunction0[/* this */ Scrollbar, Unit]): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setEasing(value: /* percent */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    }
  }
  
  /* Inlined std.Partial<smooth-scrollbar.smooth-scrollbar/interfaces.ScrollbarOptions> */
  @js.native
  trait PartialScrollbarOptions extends StObject {
    
    var alwaysShowTracks: js.UndefOr[Boolean] = js.native
    
    var continuousScrolling: js.UndefOr[Boolean] = js.native
    
    var damping: js.UndefOr[Double] = js.native
    
    var delegateTo: js.UndefOr[EventTarget | Null] = js.native
    
    var plugins: js.UndefOr[js.Any] = js.native
    
    var renderByPixels: js.UndefOr[Boolean] = js.native
    
    var thumbMinSize: js.UndefOr[Double] = js.native
    
    var wheelEventTarget: js.UndefOr[EventTarget | Null] = js.native
  }
  object PartialScrollbarOptions {
    
    @scala.inline
    def apply(): PartialScrollbarOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialScrollbarOptions]
    }
    
    @scala.inline
    implicit class PartialScrollbarOptionsMutableBuilder[Self <: PartialScrollbarOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysShowTracks(value: Boolean): Self = StObject.set(x, "alwaysShowTracks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlwaysShowTracksUndefined: Self = StObject.set(x, "alwaysShowTracks", js.undefined)
      
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
      def setPlugins(value: js.Any): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setRenderByPixels(value: Boolean): Self = StObject.set(x, "renderByPixels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderByPixelsUndefined: Self = StObject.set(x, "renderByPixels", js.undefined)
      
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
  
  /* Inlined std.Partial<smooth-scrollbar.smooth-scrollbar/interfaces.SetPositionOptions> */
  @js.native
  trait PartialSetPositionOptions extends StObject {
    
    var withoutCallbacks: js.UndefOr[Boolean] = js.native
  }
  object PartialSetPositionOptions {
    
    @scala.inline
    def apply(): PartialSetPositionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSetPositionOptions]
    }
    
    @scala.inline
    implicit class PartialSetPositionOptionsMutableBuilder[Self <: PartialSetPositionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWithoutCallbacks(value: Boolean): Self = StObject.set(x, "withoutCallbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithoutCallbacksUndefined: Self = StObject.set(x, "withoutCallbacks", js.undefined)
    }
  }
  
  @js.native
  trait TypeofScrollbarPlugin
    extends Instantiable1[
          /* scrollbar */ typings.smoothScrollbar.smoothScrollbarScrollbarMod.Scrollbar, 
          ScrollbarPlugin
        ]
       with Instantiable2[
          /* scrollbar */ typings.smoothScrollbar.smoothScrollbarScrollbarMod.Scrollbar, 
          /* options */ js.Any, 
          ScrollbarPlugin
        ] {
    
    var defaultOptions: js.Any = js.native
    
    var pluginName: String = js.native
  }
  
  @js.native
  trait X extends StObject {
    
    var x: js.UndefOr[Double] = js.native
    
    var y: js.UndefOr[Double] = js.native
  }
  object X {
    
    @scala.inline
    def apply(): X = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait XY extends StObject {
    
    var x: js.Any = js.native
    
    var y: js.Any = js.native
  }
  object XY {
    
    @scala.inline
    def apply(x: js.Any, y: js.Any): XY = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[XY]
    }
    
    @scala.inline
    implicit class XYMutableBuilder[Self <: XY] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: js.Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Y extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Y {
    
    @scala.inline
    def apply(x: Double, y: Double): Y = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Y]
    }
    
    @scala.inline
    implicit class YMutableBuilder[Self <: Y] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
