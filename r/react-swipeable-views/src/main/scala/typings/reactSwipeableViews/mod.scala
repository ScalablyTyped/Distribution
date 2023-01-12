package typings.reactSwipeableViews

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-swipeable-views", JSImport.Default)
  @js.native
  open class default () extends Component[SwipeableViewsProps, SwipeableViewsState, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSwipeableViews.reactSwipeableViewsStrings.x
    - typings.reactSwipeableViews.reactSwipeableViewsStrings.`x-reverse`
    - typings.reactSwipeableViews.reactSwipeableViewsStrings.y
    - typings.reactSwipeableViews.reactSwipeableViewsStrings.`y-reverse`
  */
  trait AxisType extends StObject
  object AxisType {
    
    inline def x: typings.reactSwipeableViews.reactSwipeableViewsStrings.x = "x".asInstanceOf[typings.reactSwipeableViews.reactSwipeableViewsStrings.x]
    
    inline def `x-reverse`: typings.reactSwipeableViews.reactSwipeableViewsStrings.`x-reverse` = "x-reverse".asInstanceOf[typings.reactSwipeableViews.reactSwipeableViewsStrings.`x-reverse`]
    
    inline def y: typings.reactSwipeableViews.reactSwipeableViewsStrings.y = "y".asInstanceOf[typings.reactSwipeableViews.reactSwipeableViewsStrings.y]
    
    inline def `y-reverse`: typings.reactSwipeableViews.reactSwipeableViewsStrings.`y-reverse` = "y-reverse".asInstanceOf[typings.reactSwipeableViews.reactSwipeableViewsStrings.`y-reverse`]
  }
  
  type OnChangeIndexCallback = js.Function2[/* index */ Double, /* indexLatest */ Double, Unit]
  
  type OnSwitchingCallback = js.Function2[/* index */ Double, /* type */ OnSwitchingCallbackTypeDescriptor, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSwipeableViews.reactSwipeableViewsStrings.move
    - typings.reactSwipeableViews.reactSwipeableViewsStrings.end
  */
  trait OnSwitchingCallbackTypeDescriptor extends StObject
  object OnSwitchingCallbackTypeDescriptor {
    
    inline def end: typings.reactSwipeableViews.reactSwipeableViewsStrings.end = "end".asInstanceOf[typings.reactSwipeableViews.reactSwipeableViewsStrings.end]
    
    inline def move: typings.reactSwipeableViews.reactSwipeableViewsStrings.move = "move".asInstanceOf[typings.reactSwipeableViews.reactSwipeableViewsStrings.move]
  }
  
  type OnTransitionEndCallback = js.Function0[Unit]
  
  trait SpringConfig extends StObject {
    
    var delay: String
    
    var duration: String
    
    var easeFunction: String
  }
  object SpringConfig {
    
    inline def apply(delay: String, duration: String, easeFunction: String): SpringConfig = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easeFunction = easeFunction.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpringConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpringConfig] (val x: Self) extends AnyVal {
      
      inline def setDelay(value: String): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEaseFunction(value: String): Self = StObject.set(x, "easeFunction", value.asInstanceOf[js.Any])
    }
  }
  
  type SwipeableViews = Component[SwipeableViewsProps, SwipeableViewsState, Any]
  
  trait SwipeableViewsProps
    extends StObject
       with HTMLProps[HTMLDivElement] {
    
    var animateHeight: js.UndefOr[Boolean] = js.undefined
    
    var animateTransitions: js.UndefOr[Boolean] = js.undefined
    
    var axis: js.UndefOr[AxisType] = js.undefined
    
    var containerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /*
      * This is the config used to disable lazy loading, if true it will render all the views in first rendering.
      */
    var disableLazyLoading: js.UndefOr[Boolean] = js.undefined
    
    var enableMouseEvents: js.UndefOr[Boolean] = js.undefined
    
    var hysteresis: js.UndefOr[Double] = js.undefined
    
    var ignoreNativeScroll: js.UndefOr[Boolean] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var onChangeIndex: js.UndefOr[OnChangeIndexCallback] = js.undefined
    
    var onSwitching: js.UndefOr[OnSwitchingCallback] = js.undefined
    
    @JSName("onTransitionEnd")
    var onTransitionEnd_SwipeableViewsProps: js.UndefOr[OnTransitionEndCallback] = js.undefined
    
    var resistance: js.UndefOr[Boolean] = js.undefined
    
    var slideClassName: js.UndefOr[String] = js.undefined
    
    var slideStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var springConfig: js.UndefOr[SpringConfig] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
  }
  object SwipeableViewsProps {
    
    inline def apply(): SwipeableViewsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwipeableViewsProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SwipeableViewsProps] (val x: Self) extends AnyVal {
      
      inline def setAnimateHeight(value: Boolean): Self = StObject.set(x, "animateHeight", value.asInstanceOf[js.Any])
      
      inline def setAnimateHeightUndefined: Self = StObject.set(x, "animateHeight", js.undefined)
      
      inline def setAnimateTransitions(value: Boolean): Self = StObject.set(x, "animateTransitions", value.asInstanceOf[js.Any])
      
      inline def setAnimateTransitionsUndefined: Self = StObject.set(x, "animateTransitions", js.undefined)
      
      inline def setAxis(value: AxisType): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setContainerStyle(value: CSSProperties): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setDisableLazyLoading(value: Boolean): Self = StObject.set(x, "disableLazyLoading", value.asInstanceOf[js.Any])
      
      inline def setDisableLazyLoadingUndefined: Self = StObject.set(x, "disableLazyLoading", js.undefined)
      
      inline def setEnableMouseEvents(value: Boolean): Self = StObject.set(x, "enableMouseEvents", value.asInstanceOf[js.Any])
      
      inline def setEnableMouseEventsUndefined: Self = StObject.set(x, "enableMouseEvents", js.undefined)
      
      inline def setHysteresis(value: Double): Self = StObject.set(x, "hysteresis", value.asInstanceOf[js.Any])
      
      inline def setHysteresisUndefined: Self = StObject.set(x, "hysteresis", js.undefined)
      
      inline def setIgnoreNativeScroll(value: Boolean): Self = StObject.set(x, "ignoreNativeScroll", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNativeScrollUndefined: Self = StObject.set(x, "ignoreNativeScroll", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setOnChangeIndex(value: (/* index */ Double, /* indexLatest */ Double) => Unit): Self = StObject.set(x, "onChangeIndex", js.Any.fromFunction2(value))
      
      inline def setOnChangeIndexUndefined: Self = StObject.set(x, "onChangeIndex", js.undefined)
      
      inline def setOnSwitching(value: (/* index */ Double, /* type */ OnSwitchingCallbackTypeDescriptor) => Unit): Self = StObject.set(x, "onSwitching", js.Any.fromFunction2(value))
      
      inline def setOnSwitchingUndefined: Self = StObject.set(x, "onSwitching", js.undefined)
      
      inline def setOnTransitionEnd(value: () => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction0(value))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setResistance(value: Boolean): Self = StObject.set(x, "resistance", value.asInstanceOf[js.Any])
      
      inline def setResistanceUndefined: Self = StObject.set(x, "resistance", js.undefined)
      
      inline def setSlideClassName(value: String): Self = StObject.set(x, "slideClassName", value.asInstanceOf[js.Any])
      
      inline def setSlideClassNameUndefined: Self = StObject.set(x, "slideClassName", js.undefined)
      
      inline def setSlideStyle(value: CSSProperties): Self = StObject.set(x, "slideStyle", value.asInstanceOf[js.Any])
      
      inline def setSlideStyleUndefined: Self = StObject.set(x, "slideStyle", js.undefined)
      
      inline def setSpringConfig(value: SpringConfig): Self = StObject.set(x, "springConfig", value.asInstanceOf[js.Any])
      
      inline def setSpringConfigUndefined: Self = StObject.set(x, "springConfig", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
  
  trait SwipeableViewsState extends StObject {
    
    var displaySameSlide: js.UndefOr[Boolean] = js.undefined
    
    var heightLatest: js.UndefOr[Double] = js.undefined
    
    var indexCurrent: js.UndefOr[Double] = js.undefined
    
    var indexLatest: js.UndefOr[Double] = js.undefined
    
    var isDragging: js.UndefOr[Boolean] = js.undefined
    
    var isFirstRender: js.UndefOr[Boolean] = js.undefined
  }
  object SwipeableViewsState {
    
    inline def apply(): SwipeableViewsState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwipeableViewsState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SwipeableViewsState] (val x: Self) extends AnyVal {
      
      inline def setDisplaySameSlide(value: Boolean): Self = StObject.set(x, "displaySameSlide", value.asInstanceOf[js.Any])
      
      inline def setDisplaySameSlideUndefined: Self = StObject.set(x, "displaySameSlide", js.undefined)
      
      inline def setHeightLatest(value: Double): Self = StObject.set(x, "heightLatest", value.asInstanceOf[js.Any])
      
      inline def setHeightLatestUndefined: Self = StObject.set(x, "heightLatest", js.undefined)
      
      inline def setIndexCurrent(value: Double): Self = StObject.set(x, "indexCurrent", value.asInstanceOf[js.Any])
      
      inline def setIndexCurrentUndefined: Self = StObject.set(x, "indexCurrent", js.undefined)
      
      inline def setIndexLatest(value: Double): Self = StObject.set(x, "indexLatest", value.asInstanceOf[js.Any])
      
      inline def setIndexLatestUndefined: Self = StObject.set(x, "indexLatest", js.undefined)
      
      inline def setIsDragging(value: Boolean): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
      
      inline def setIsDraggingUndefined: Self = StObject.set(x, "isDragging", js.undefined)
      
      inline def setIsFirstRender(value: Boolean): Self = StObject.set(x, "isFirstRender", value.asInstanceOf[js.Any])
      
      inline def setIsFirstRenderUndefined: Self = StObject.set(x, "isFirstRender", js.undefined)
    }
  }
}
