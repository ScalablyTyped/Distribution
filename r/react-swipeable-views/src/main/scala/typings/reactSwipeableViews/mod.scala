package typings.reactSwipeableViews

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-swipeable-views", JSImport.Default)
  @js.native
  class default ()
    extends Component[SwipeableViewsProps, SwipeableViewsState, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSwipeableViews.reactSwipeableViewsStrings.x
    - typings.reactSwipeableViews.reactSwipeableViewsStrings.`x-reverse`
    - typings.reactSwipeableViews.reactSwipeableViewsStrings.y
    - typings.reactSwipeableViews.reactSwipeableViewsStrings.`y-reverse`
  */
  trait AxisType extends StObject
  object AxisType {
    
    @scala.inline
    def x: typings.reactSwipeableViews.reactSwipeableViewsStrings.x = "x".asInstanceOf[typings.reactSwipeableViews.reactSwipeableViewsStrings.x]
    
    @scala.inline
    def `x-reverse`: typings.reactSwipeableViews.reactSwipeableViewsStrings.`x-reverse` = "x-reverse".asInstanceOf[typings.reactSwipeableViews.reactSwipeableViewsStrings.`x-reverse`]
    
    @scala.inline
    def y: typings.reactSwipeableViews.reactSwipeableViewsStrings.y = "y".asInstanceOf[typings.reactSwipeableViews.reactSwipeableViewsStrings.y]
    
    @scala.inline
    def `y-reverse`: typings.reactSwipeableViews.reactSwipeableViewsStrings.`y-reverse` = "y-reverse".asInstanceOf[typings.reactSwipeableViews.reactSwipeableViewsStrings.`y-reverse`]
  }
  
  type OnChangeIndexCallback = js.Function2[/* index */ Double, /* indexLatest */ Double, Unit]
  
  type OnSwitchingCallback = js.Function2[/* index */ Double, /* type */ OnSwitchingCallbackTypeDescriptor, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSwipeableViews.reactSwipeableViewsStrings.move
    - typings.reactSwipeableViews.reactSwipeableViewsStrings.end
  */
  trait OnSwitchingCallbackTypeDescriptor extends StObject
  object OnSwitchingCallbackTypeDescriptor {
    
    @scala.inline
    def end: typings.reactSwipeableViews.reactSwipeableViewsStrings.end = "end".asInstanceOf[typings.reactSwipeableViews.reactSwipeableViewsStrings.end]
    
    @scala.inline
    def move: typings.reactSwipeableViews.reactSwipeableViewsStrings.move = "move".asInstanceOf[typings.reactSwipeableViews.reactSwipeableViewsStrings.move]
  }
  
  type OnTransitionEndCallback = js.Function0[Unit]
  
  @js.native
  trait SpringConfig extends StObject {
    
    var delay: String = js.native
    
    var duration: String = js.native
    
    var easeFunction: String = js.native
  }
  object SpringConfig {
    
    @scala.inline
    def apply(delay: String, duration: String, easeFunction: String): SpringConfig = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easeFunction = easeFunction.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpringConfig]
    }
    
    @scala.inline
    implicit class SpringConfigMutableBuilder[Self <: SpringConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: String): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEaseFunction(value: String): Self = StObject.set(x, "easeFunction", value.asInstanceOf[js.Any])
    }
  }
  
  type SwipeableViews = Component[SwipeableViewsProps, SwipeableViewsState, js.Any]
  
  @js.native
  trait SwipeableViewsProps extends HTMLProps[HTMLDivElement] {
    
    var animateHeight: js.UndefOr[Boolean] = js.native
    
    var animateTransitions: js.UndefOr[Boolean] = js.native
    
    var axis: js.UndefOr[AxisType] = js.native
    
    var containerStyle: js.UndefOr[CSSProperties] = js.native
    
    /*
      * This is the config used to disable lazy loading, if true it will render all the views in first rendering.
      */
    var disableLazyLoading: js.UndefOr[Boolean] = js.native
    
    var enableMouseEvents: js.UndefOr[Boolean] = js.native
    
    var hysteresis: js.UndefOr[Double] = js.native
    
    var ignoreNativeScroll: js.UndefOr[Boolean] = js.native
    
    var index: js.UndefOr[Double] = js.native
    
    var onChangeIndex: js.UndefOr[OnChangeIndexCallback] = js.native
    
    var onSwitching: js.UndefOr[OnSwitchingCallback] = js.native
    
    @JSName("onTransitionEnd")
    var onTransitionEnd_SwipeableViewsProps: js.UndefOr[OnTransitionEndCallback] = js.native
    
    var resistance: js.UndefOr[Boolean] = js.native
    
    var slideClassName: js.UndefOr[String] = js.native
    
    var slideStyle: js.UndefOr[CSSProperties] = js.native
    
    var springConfig: js.UndefOr[SpringConfig] = js.native
    
    var threshold: js.UndefOr[Double] = js.native
  }
  object SwipeableViewsProps {
    
    @scala.inline
    def apply(): SwipeableViewsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwipeableViewsProps]
    }
    
    @scala.inline
    implicit class SwipeableViewsPropsMutableBuilder[Self <: SwipeableViewsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimateHeight(value: Boolean): Self = StObject.set(x, "animateHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateHeightUndefined: Self = StObject.set(x, "animateHeight", js.undefined)
      
      @scala.inline
      def setAnimateTransitions(value: Boolean): Self = StObject.set(x, "animateTransitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateTransitionsUndefined: Self = StObject.set(x, "animateTransitions", js.undefined)
      
      @scala.inline
      def setAxis(value: AxisType): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      @scala.inline
      def setContainerStyle(value: CSSProperties): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      @scala.inline
      def setDisableLazyLoading(value: Boolean): Self = StObject.set(x, "disableLazyLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableLazyLoadingUndefined: Self = StObject.set(x, "disableLazyLoading", js.undefined)
      
      @scala.inline
      def setEnableMouseEvents(value: Boolean): Self = StObject.set(x, "enableMouseEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableMouseEventsUndefined: Self = StObject.set(x, "enableMouseEvents", js.undefined)
      
      @scala.inline
      def setHysteresis(value: Double): Self = StObject.set(x, "hysteresis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHysteresisUndefined: Self = StObject.set(x, "hysteresis", js.undefined)
      
      @scala.inline
      def setIgnoreNativeScroll(value: Boolean): Self = StObject.set(x, "ignoreNativeScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreNativeScrollUndefined: Self = StObject.set(x, "ignoreNativeScroll", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setOnChangeIndex(value: (/* index */ Double, /* indexLatest */ Double) => Unit): Self = StObject.set(x, "onChangeIndex", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeIndexUndefined: Self = StObject.set(x, "onChangeIndex", js.undefined)
      
      @scala.inline
      def setOnSwitching(value: (/* index */ Double, /* type */ OnSwitchingCallbackTypeDescriptor) => Unit): Self = StObject.set(x, "onSwitching", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSwitchingUndefined: Self = StObject.set(x, "onSwitching", js.undefined)
      
      @scala.inline
      def setOnTransitionEnd(value: () => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      @scala.inline
      def setResistance(value: Boolean): Self = StObject.set(x, "resistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResistanceUndefined: Self = StObject.set(x, "resistance", js.undefined)
      
      @scala.inline
      def setSlideClassName(value: String): Self = StObject.set(x, "slideClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideClassNameUndefined: Self = StObject.set(x, "slideClassName", js.undefined)
      
      @scala.inline
      def setSlideStyle(value: CSSProperties): Self = StObject.set(x, "slideStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideStyleUndefined: Self = StObject.set(x, "slideStyle", js.undefined)
      
      @scala.inline
      def setSpringConfig(value: SpringConfig): Self = StObject.set(x, "springConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpringConfigUndefined: Self = StObject.set(x, "springConfig", js.undefined)
      
      @scala.inline
      def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
  
  @js.native
  trait SwipeableViewsState extends StObject {
    
    var displaySameSlide: js.UndefOr[Boolean] = js.native
    
    var heightLatest: js.UndefOr[Double] = js.native
    
    var indexCurrent: js.UndefOr[Double] = js.native
    
    var indexLatest: js.UndefOr[Double] = js.native
    
    var isDragging: js.UndefOr[Boolean] = js.native
    
    var isFirstRender: js.UndefOr[Boolean] = js.native
  }
  object SwipeableViewsState {
    
    @scala.inline
    def apply(): SwipeableViewsState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwipeableViewsState]
    }
    
    @scala.inline
    implicit class SwipeableViewsStateMutableBuilder[Self <: SwipeableViewsState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplaySameSlide(value: Boolean): Self = StObject.set(x, "displaySameSlide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplaySameSlideUndefined: Self = StObject.set(x, "displaySameSlide", js.undefined)
      
      @scala.inline
      def setHeightLatest(value: Double): Self = StObject.set(x, "heightLatest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightLatestUndefined: Self = StObject.set(x, "heightLatest", js.undefined)
      
      @scala.inline
      def setIndexCurrent(value: Double): Self = StObject.set(x, "indexCurrent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexCurrentUndefined: Self = StObject.set(x, "indexCurrent", js.undefined)
      
      @scala.inline
      def setIndexLatest(value: Double): Self = StObject.set(x, "indexLatest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexLatestUndefined: Self = StObject.set(x, "indexLatest", js.undefined)
      
      @scala.inline
      def setIsDragging(value: Boolean): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDraggingUndefined: Self = StObject.set(x, "isDragging", js.undefined)
      
      @scala.inline
      def setIsFirstRender(value: Boolean): Self = StObject.set(x, "isFirstRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFirstRenderUndefined: Self = StObject.set(x, "isFirstRender", js.undefined)
    }
  }
}
