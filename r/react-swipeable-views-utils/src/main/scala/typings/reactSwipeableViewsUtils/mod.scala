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
import scala.scalajs.js.`|`
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
  
  @js.native
  trait SlideRenderProps extends StObject {
    
    var index: Double = js.native
    
    var key: Double = js.native
  }
  object SlideRenderProps {
    
    @scala.inline
    def apply(index: Double, key: Double): SlideRenderProps = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[SlideRenderProps]
    }
    
    @scala.inline
    implicit class SlideRenderPropsMutableBuilder[Self <: SlideRenderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  type SlideRendererCallback = js.Function1[/* render */ SlideRenderProps, ReactNode]
  
  @js.native
  trait WithAutoPlay extends StObject {
    
    var index: Double = js.native
    
    var onChangeIndex: OnChangeIndexCallback = js.native
    
    var onSwitching: js.UndefOr[OnSwitchingCallback] = js.native
  }
  object WithAutoPlay {
    
    @scala.inline
    def apply(index: Double, onChangeIndex: (/* index */ Double, /* indexLatest */ Double) => Unit): WithAutoPlay = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], onChangeIndex = js.Any.fromFunction2(onChangeIndex))
      __obj.asInstanceOf[WithAutoPlay]
    }
    
    @scala.inline
    implicit class WithAutoPlayMutableBuilder[Self <: WithAutoPlay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChangeIndex(value: (/* index */ Double, /* indexLatest */ Double) => Unit): Self = StObject.set(x, "onChangeIndex", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSwitching(value: (/* index */ Double, /* type */ OnSwitchingCallbackTypeDescriptor) => Unit): Self = StObject.set(x, "onSwitching", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSwitchingUndefined: Self = StObject.set(x, "onSwitching", js.undefined)
    }
  }
  
  @js.native
  trait WithAutoPlayProps extends StObject {
    
    var autoplay: js.UndefOr[Boolean] = js.native
    
    var direction: js.UndefOr[incremental | decremental] = js.native
    
    var index: Double = js.native
    
    var interval: js.UndefOr[Double] = js.native
    
    var onChangeIndex: OnChangeIndexCallback = js.native
    
    var slideCount: js.UndefOr[Double] = js.native
  }
  object WithAutoPlayProps {
    
    @scala.inline
    def apply(index: Double, onChangeIndex: (/* index */ Double, /* indexLatest */ Double) => Unit): WithAutoPlayProps = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], onChangeIndex = js.Any.fromFunction2(onChangeIndex))
      __obj.asInstanceOf[WithAutoPlayProps]
    }
    
    @scala.inline
    implicit class WithAutoPlayPropsMutableBuilder[Self <: WithAutoPlayProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setDirection(value: incremental | decremental): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setOnChangeIndex(value: (/* index */ Double, /* indexLatest */ Double) => Unit): Self = StObject.set(x, "onChangeIndex", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSlideCount(value: Double): Self = StObject.set(x, "slideCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideCountUndefined: Self = StObject.set(x, "slideCount", js.undefined)
    }
  }
  
  @js.native
  trait WithBindKeyboard extends StObject {
    
    var index: Double = js.native
    
    var onChangeIndex: OnChangeIndexCallback = js.native
  }
  object WithBindKeyboard {
    
    @scala.inline
    def apply(index: Double, onChangeIndex: (/* index */ Double, /* indexLatest */ Double) => Unit): WithBindKeyboard = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], onChangeIndex = js.Any.fromFunction2(onChangeIndex))
      __obj.asInstanceOf[WithBindKeyboard]
    }
    
    @scala.inline
    implicit class WithBindKeyboardMutableBuilder[Self <: WithBindKeyboard] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChangeIndex(value: (/* index */ Double, /* indexLatest */ Double) => Unit): Self = StObject.set(x, "onChangeIndex", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait WithBindKeyboardProps extends StObject {
    
    var axis: js.UndefOr[x | `x-reverse` | y | `y-reverse`] = js.native
    
    var index: Double = js.native
    
    var onChangeIndex: OnChangeIndexCallback = js.native
    
    var slidecount: js.UndefOr[Double] = js.native
  }
  object WithBindKeyboardProps {
    
    @scala.inline
    def apply(index: Double, onChangeIndex: (/* index */ Double, /* indexLatest */ Double) => Unit): WithBindKeyboardProps = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], onChangeIndex = js.Any.fromFunction2(onChangeIndex))
      __obj.asInstanceOf[WithBindKeyboardProps]
    }
    
    @scala.inline
    implicit class WithBindKeyboardPropsMutableBuilder[Self <: WithBindKeyboardProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(
        value: typings.reactSwipeableViewsUtils.reactSwipeableViewsUtilsStrings.x | `x-reverse` | y | `y-reverse`
      ): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChangeIndex(value: (/* index */ Double, /* indexLatest */ Double) => Unit): Self = StObject.set(x, "onChangeIndex", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSlidecount(value: Double): Self = StObject.set(x, "slidecount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlidecountUndefined: Self = StObject.set(x, "slidecount", js.undefined)
    }
  }
  
  @js.native
  trait WithVirtualize extends StObject {
    
    var index: Double = js.native
    
    var onChangeIndex: OnChangeIndexCallback = js.native
    
    def slideRenderer(render: SlideRendererCallback): ReactNode = js.native
  }
  object WithVirtualize {
    
    @scala.inline
    def apply(
      index: Double,
      onChangeIndex: (/* index */ Double, /* indexLatest */ Double) => Unit,
      slideRenderer: SlideRendererCallback => ReactNode
    ): WithVirtualize = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], onChangeIndex = js.Any.fromFunction2(onChangeIndex), slideRenderer = js.Any.fromFunction1(slideRenderer))
      __obj.asInstanceOf[WithVirtualize]
    }
    
    @scala.inline
    implicit class WithVirtualizeMutableBuilder[Self <: WithVirtualize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChangeIndex(value: (/* index */ Double, /* indexLatest */ Double) => Unit): Self = StObject.set(x, "onChangeIndex", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSlideRenderer(value: SlideRendererCallback => ReactNode): Self = StObject.set(x, "slideRenderer", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait WithVirtualizeProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var index: Double = js.native
    
    var onChangeIndex: OnChangeIndexCallback = js.native
    
    var onTransitionEnd: js.UndefOr[OnTransitionEndCallback] = js.native
    
    var overscanSlideAfter: js.UndefOr[Double] = js.native
    
    var overscanSlideBefore: js.UndefOr[Double] = js.native
    
    var slideCount: js.UndefOr[Double] = js.native
    
    var slideRenderer: SlideRendererCallback = js.native
  }
  object WithVirtualizeProps {
    
    @scala.inline
    def apply(
      index: Double,
      onChangeIndex: (/* index */ Double, /* indexLatest */ Double) => Unit,
      slideRenderer: /* render */ SlideRenderProps => ReactNode
    ): WithVirtualizeProps = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], onChangeIndex = js.Any.fromFunction2(onChangeIndex), slideRenderer = js.Any.fromFunction1(slideRenderer))
      __obj.asInstanceOf[WithVirtualizeProps]
    }
    
    @scala.inline
    implicit class WithVirtualizePropsMutableBuilder[Self <: WithVirtualizeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChangeIndex(value: (/* index */ Double, /* indexLatest */ Double) => Unit): Self = StObject.set(x, "onChangeIndex", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnTransitionEnd(value: () => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      @scala.inline
      def setOverscanSlideAfter(value: Double): Self = StObject.set(x, "overscanSlideAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverscanSlideAfterUndefined: Self = StObject.set(x, "overscanSlideAfter", js.undefined)
      
      @scala.inline
      def setOverscanSlideBefore(value: Double): Self = StObject.set(x, "overscanSlideBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverscanSlideBeforeUndefined: Self = StObject.set(x, "overscanSlideBefore", js.undefined)
      
      @scala.inline
      def setSlideCount(value: Double): Self = StObject.set(x, "slideCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideCountUndefined: Self = StObject.set(x, "slideCount", js.undefined)
      
      @scala.inline
      def setSlideRenderer(value: /* render */ SlideRenderProps => ReactNode): Self = StObject.set(x, "slideRenderer", js.Any.fromFunction1(value))
    }
  }
}
