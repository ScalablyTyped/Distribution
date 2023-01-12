package typings.reactSwipeableViewsUtils

import typings.materialUiTypes.mod.PropInjector
import typings.react.mod.ReactNode
import typings.reactSwipeableViews.mod.OnChangeIndexCallback
import typings.reactSwipeableViews.mod.OnSwitchingCallback
import typings.reactSwipeableViews.mod.OnSwitchingCallbackTypeDescriptor
import typings.reactSwipeableViews.mod.OnTransitionEndCallback
import typings.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.`x-reverse`
import typings.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.`y-reverse`
import typings.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.decremental
import typings.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.incremental
import typings.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.x
import typings.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-swipeable-views-utils", "autoPlay")
  @js.native
  val autoPlay: PropInjector[WithAutoPlay, WithAutoPlayProps] = js.native
  
  @JSImport("react-swipeable-views-utils", "bindKeyboard")
  @js.native
  val bindKeyboard: PropInjector[WithBindKeyboard, WithBindKeyboardProps] = js.native
  
  @JSImport("react-swipeable-views-utils", "virtualize")
  @js.native
  val virtualize: PropInjector[WithVirtualize, WithVirtualizeProps] = js.native
  
  trait SlideRenderProps extends StObject {
    
    var index: Double
    
    var key: Double
  }
  object SlideRenderProps {
    
    inline def apply(index: Double, key: Double): SlideRenderProps = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[SlideRenderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SlideRenderProps] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  type SlideRendererCallback = js.Function1[/* render */ SlideRenderProps, ReactNode]
  
  trait WithAutoPlay
    extends StObject
       with WithIndex {
    
    var onSwitching: js.UndefOr[OnSwitchingCallback] = js.undefined
  }
  object WithAutoPlay {
    
    inline def apply(): WithAutoPlay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithAutoPlay]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithAutoPlay] (val x: Self) extends AnyVal {
      
      inline def setOnSwitching(value: (/* index */ Double, /* type */ OnSwitchingCallbackTypeDescriptor) => Unit): Self = StObject.set(x, "onSwitching", js.Any.fromFunction2(value))
      
      inline def setOnSwitchingUndefined: Self = StObject.set(x, "onSwitching", js.undefined)
    }
  }
  
  trait WithAutoPlayProps
    extends StObject
       with WithIndex {
    
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    var direction: js.UndefOr[incremental | decremental] = js.undefined
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var slideCount: js.UndefOr[Double] = js.undefined
  }
  object WithAutoPlayProps {
    
    inline def apply(): WithAutoPlayProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithAutoPlayProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithAutoPlayProps] (val x: Self) extends AnyVal {
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setDirection(value: incremental | decremental): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setSlideCount(value: Double): Self = StObject.set(x, "slideCount", value.asInstanceOf[js.Any])
      
      inline def setSlideCountUndefined: Self = StObject.set(x, "slideCount", js.undefined)
    }
  }
  
  type WithBindKeyboard = WithIndex
  
  trait WithBindKeyboardProps
    extends StObject
       with WithIndex {
    
    var axis: js.UndefOr[x | `x-reverse` | y | `y-reverse`] = js.undefined
    
    var slidecount: js.UndefOr[Double] = js.undefined
  }
  object WithBindKeyboardProps {
    
    inline def apply(): WithBindKeyboardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithBindKeyboardProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithBindKeyboardProps] (val x: Self) extends AnyVal {
      
      inline def setAxis(
        value: typings.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.x | `x-reverse` | y | `y-reverse`
      ): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setSlidecount(value: Double): Self = StObject.set(x, "slidecount", value.asInstanceOf[js.Any])
      
      inline def setSlidecountUndefined: Self = StObject.set(x, "slidecount", js.undefined)
    }
  }
  
  trait WithIndex extends StObject {
    
    var index: js.UndefOr[Double] = js.undefined
    
    var onChangeIndex: js.UndefOr[OnChangeIndexCallback] = js.undefined
  }
  object WithIndex {
    
    inline def apply(): WithIndex = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithIndex]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithIndex] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setOnChangeIndex(value: (/* index */ Double, /* indexLatest */ Double) => Unit): Self = StObject.set(x, "onChangeIndex", js.Any.fromFunction2(value))
      
      inline def setOnChangeIndexUndefined: Self = StObject.set(x, "onChangeIndex", js.undefined)
    }
  }
  
  trait WithVirtualize
    extends StObject
       with WithIndex {
    
    def slideRenderer(render: SlideRendererCallback): ReactNode
  }
  object WithVirtualize {
    
    inline def apply(slideRenderer: SlideRendererCallback => ReactNode): WithVirtualize = {
      val __obj = js.Dynamic.literal(slideRenderer = js.Any.fromFunction1(slideRenderer))
      __obj.asInstanceOf[WithVirtualize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithVirtualize] (val x: Self) extends AnyVal {
      
      inline def setSlideRenderer(value: SlideRendererCallback => ReactNode): Self = StObject.set(x, "slideRenderer", js.Any.fromFunction1(value))
    }
  }
  
  trait WithVirtualizeProps
    extends StObject
       with WithIndex {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var onTransitionEnd: js.UndefOr[OnTransitionEndCallback] = js.undefined
    
    var overscanSlideAfter: js.UndefOr[Double] = js.undefined
    
    var overscanSlideBefore: js.UndefOr[Double] = js.undefined
    
    var slideCount: js.UndefOr[Double] = js.undefined
    
    var slideRenderer: SlideRendererCallback
  }
  object WithVirtualizeProps {
    
    inline def apply(slideRenderer: /* render */ SlideRenderProps => ReactNode): WithVirtualizeProps = {
      val __obj = js.Dynamic.literal(slideRenderer = js.Any.fromFunction1(slideRenderer))
      __obj.asInstanceOf[WithVirtualizeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithVirtualizeProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOnTransitionEnd(value: () => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction0(value))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setOverscanSlideAfter(value: Double): Self = StObject.set(x, "overscanSlideAfter", value.asInstanceOf[js.Any])
      
      inline def setOverscanSlideAfterUndefined: Self = StObject.set(x, "overscanSlideAfter", js.undefined)
      
      inline def setOverscanSlideBefore(value: Double): Self = StObject.set(x, "overscanSlideBefore", value.asInstanceOf[js.Any])
      
      inline def setOverscanSlideBeforeUndefined: Self = StObject.set(x, "overscanSlideBefore", js.undefined)
      
      inline def setSlideCount(value: Double): Self = StObject.set(x, "slideCount", value.asInstanceOf[js.Any])
      
      inline def setSlideCountUndefined: Self = StObject.set(x, "slideCount", js.undefined)
      
      inline def setSlideRenderer(value: /* render */ SlideRenderProps => ReactNode): Self = StObject.set(x, "slideRenderer", js.Any.fromFunction1(value))
    }
  }
}
