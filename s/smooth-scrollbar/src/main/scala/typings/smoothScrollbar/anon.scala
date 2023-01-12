package typings.smoothScrollbar

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.smoothScrollbar.interfacesScrollbarMod.Scrollbar
import typings.smoothScrollbar.pluginMod.ScrollbarPlugin
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bottom extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object Bottom {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait Get extends StObject {
    
    def get(): Any
  }
  object Get {
    
    inline def apply(get: () => Any): Get = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get))
      __obj.asInstanceOf[Get]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Get] (val x: Self) extends AnyVal {
      
      inline def setGet(value: () => Any): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    }
  }
  
  /* Inlined std.Partial<smooth-scrollbar.smooth-scrollbar/interfaces.ScrollIntoViewOptions> */
  trait PartialScrollIntoViewOpti extends StObject {
    
    var alignToTop: js.UndefOr[Boolean] = js.undefined
    
    var offsetBottom: js.UndefOr[Double] = js.undefined
    
    var offsetLeft: js.UndefOr[Double] = js.undefined
    
    var offsetTop: js.UndefOr[Double] = js.undefined
    
    var onlyScrollIfNeeded: js.UndefOr[Boolean] = js.undefined
  }
  object PartialScrollIntoViewOpti {
    
    inline def apply(): PartialScrollIntoViewOpti = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialScrollIntoViewOpti]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialScrollIntoViewOpti] (val x: Self) extends AnyVal {
      
      inline def setAlignToTop(value: Boolean): Self = StObject.set(x, "alignToTop", value.asInstanceOf[js.Any])
      
      inline def setAlignToTopUndefined: Self = StObject.set(x, "alignToTop", js.undefined)
      
      inline def setOffsetBottom(value: Double): Self = StObject.set(x, "offsetBottom", value.asInstanceOf[js.Any])
      
      inline def setOffsetBottomUndefined: Self = StObject.set(x, "offsetBottom", js.undefined)
      
      inline def setOffsetLeft(value: Double): Self = StObject.set(x, "offsetLeft", value.asInstanceOf[js.Any])
      
      inline def setOffsetLeftUndefined: Self = StObject.set(x, "offsetLeft", js.undefined)
      
      inline def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
      
      inline def setOffsetTopUndefined: Self = StObject.set(x, "offsetTop", js.undefined)
      
      inline def setOnlyScrollIfNeeded(value: Boolean): Self = StObject.set(x, "onlyScrollIfNeeded", value.asInstanceOf[js.Any])
      
      inline def setOnlyScrollIfNeededUndefined: Self = StObject.set(x, "onlyScrollIfNeeded", js.undefined)
    }
  }
  
  /* Inlined std.Partial<smooth-scrollbar.smooth-scrollbar/interfaces.ScrollToOptions> */
  trait PartialScrollToOptions extends StObject {
    
    var callback: js.UndefOr[js.ThisFunction0[/* this */ this.type, Unit]] = js.undefined
    
    var easing: js.UndefOr[js.Function1[/* percent */ Double, Double]] = js.undefined
  }
  object PartialScrollToOptions {
    
    inline def apply(): PartialScrollToOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialScrollToOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialScrollToOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: js.ThisFunction0[PartialScrollToOptions, Unit]): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setEasing(value: /* percent */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    }
  }
  
  /* Inlined std.Partial<smooth-scrollbar.smooth-scrollbar/interfaces.ScrollToOptions> */
  trait PartialScrollToOptionsCallback extends StObject {
    
    var callback: js.UndefOr[js.ThisFunction0[/* this */ Scrollbar, Unit]] = js.undefined
    
    var easing: js.UndefOr[js.Function1[/* percent */ Double, Double]] = js.undefined
  }
  object PartialScrollToOptionsCallback {
    
    inline def apply(): PartialScrollToOptionsCallback = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialScrollToOptionsCallback]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialScrollToOptionsCallback] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: js.ThisFunction0[/* this */ Scrollbar, Unit]): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setEasing(value: /* percent */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    }
  }
  
  /* Inlined std.Partial<smooth-scrollbar.smooth-scrollbar/interfaces.ScrollbarOptions> */
  trait PartialScrollbarOptions extends StObject {
    
    var alwaysShowTracks: js.UndefOr[Boolean] = js.undefined
    
    var continuousScrolling: js.UndefOr[Boolean] = js.undefined
    
    var damping: js.UndefOr[Double] = js.undefined
    
    var delegateTo: js.UndefOr[EventTarget | Null] = js.undefined
    
    var plugins: js.UndefOr[Any] = js.undefined
    
    var renderByPixels: js.UndefOr[Boolean] = js.undefined
    
    var thumbMinSize: js.UndefOr[Double] = js.undefined
    
    var wheelEventTarget: js.UndefOr[EventTarget | Null] = js.undefined
  }
  object PartialScrollbarOptions {
    
    inline def apply(): PartialScrollbarOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialScrollbarOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialScrollbarOptions] (val x: Self) extends AnyVal {
      
      inline def setAlwaysShowTracks(value: Boolean): Self = StObject.set(x, "alwaysShowTracks", value.asInstanceOf[js.Any])
      
      inline def setAlwaysShowTracksUndefined: Self = StObject.set(x, "alwaysShowTracks", js.undefined)
      
      inline def setContinuousScrolling(value: Boolean): Self = StObject.set(x, "continuousScrolling", value.asInstanceOf[js.Any])
      
      inline def setContinuousScrollingUndefined: Self = StObject.set(x, "continuousScrolling", js.undefined)
      
      inline def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      inline def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
      
      inline def setDelegateTo(value: EventTarget): Self = StObject.set(x, "delegateTo", value.asInstanceOf[js.Any])
      
      inline def setDelegateToNull: Self = StObject.set(x, "delegateTo", null)
      
      inline def setDelegateToUndefined: Self = StObject.set(x, "delegateTo", js.undefined)
      
      inline def setPlugins(value: Any): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setRenderByPixels(value: Boolean): Self = StObject.set(x, "renderByPixels", value.asInstanceOf[js.Any])
      
      inline def setRenderByPixelsUndefined: Self = StObject.set(x, "renderByPixels", js.undefined)
      
      inline def setThumbMinSize(value: Double): Self = StObject.set(x, "thumbMinSize", value.asInstanceOf[js.Any])
      
      inline def setThumbMinSizeUndefined: Self = StObject.set(x, "thumbMinSize", js.undefined)
      
      inline def setWheelEventTarget(value: EventTarget): Self = StObject.set(x, "wheelEventTarget", value.asInstanceOf[js.Any])
      
      inline def setWheelEventTargetNull: Self = StObject.set(x, "wheelEventTarget", null)
      
      inline def setWheelEventTargetUndefined: Self = StObject.set(x, "wheelEventTarget", js.undefined)
    }
  }
  
  /* Inlined std.Partial<smooth-scrollbar.smooth-scrollbar/interfaces.SetPositionOptions> */
  trait PartialSetPositionOptions extends StObject {
    
    var withoutCallbacks: js.UndefOr[Boolean] = js.undefined
  }
  object PartialSetPositionOptions {
    
    inline def apply(): PartialSetPositionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSetPositionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialSetPositionOptions] (val x: Self) extends AnyVal {
      
      inline def setWithoutCallbacks(value: Boolean): Self = StObject.set(x, "withoutCallbacks", value.asInstanceOf[js.Any])
      
      inline def setWithoutCallbacksUndefined: Self = StObject.set(x, "withoutCallbacks", js.undefined)
    }
  }
  
  @js.native
  trait TypeofScrollbarPlugin
    extends StObject
       with Instantiable1[/* scrollbar */ typings.smoothScrollbar.scrollbarMod.Scrollbar, ScrollbarPlugin]
       with Instantiable2[
          /* scrollbar */ typings.smoothScrollbar.scrollbarMod.Scrollbar, 
          /* options */ Any, 
          ScrollbarPlugin
        ] {
    
    var defaultOptions: Any = js.native
    
    var pluginName: String = js.native
  }
  
  trait X extends StObject {
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object X {
    
    inline def apply(): X = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait XY extends StObject {
    
    var x: Any
    
    var y: Any
  }
  object XY {
    
    inline def apply(x: Any, y: Any): XY = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[XY]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XY] (val x: Self) extends AnyVal {
      
      inline def setX(value: Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Y extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Y {
    
    inline def apply(x: Double, y: Double): Y = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Y]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Y] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
