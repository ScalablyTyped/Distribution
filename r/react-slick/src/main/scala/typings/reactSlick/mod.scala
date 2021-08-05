package typings.reactSlick

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.react.mod.global.JSX.Element
import typings.reactSlick.reactSlickStrings.unslick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-slick", JSImport.Default)
  @js.native
  class default () extends Slider
  
  type ComponentConstructor[TProps] = (ComponentClass[TProps, ComponentState]) | StatelessComponent[TProps]
  
  trait CustomArrowProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var currentSlide: js.UndefOr[Double] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[js.Any]] = js.undefined
    
    var slideCount: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object CustomArrowProps {
    
    inline def apply(): CustomArrowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomArrowProps]
    }
    
    extension [Self <: CustomArrowProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCurrentSlide(value: Double): Self = StObject.set(x, "currentSlide", value.asInstanceOf[js.Any])
      
      inline def setCurrentSlideUndefined: Self = StObject.set(x, "currentSlide", js.undefined)
      
      inline def setOnClick(value: MouseEvent[js.Any, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setSlideCount(value: Double): Self = StObject.set(x, "slideCount", value.asInstanceOf[js.Any])
      
      inline def setSlideCountUndefined: Self = StObject.set(x, "slideCount", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSlick.reactSlickStrings.ondemand
    - typings.reactSlick.reactSlickStrings.progressive
  */
  trait LazyLoadTypes extends StObject
  object LazyLoadTypes {
    
    inline def ondemand: typings.reactSlick.reactSlickStrings.ondemand = "ondemand".asInstanceOf[typings.reactSlick.reactSlickStrings.ondemand]
    
    inline def progressive: typings.reactSlick.reactSlickStrings.progressive = "progressive".asInstanceOf[typings.reactSlick.reactSlickStrings.progressive]
  }
  
  trait ResponsiveObject extends StObject {
    
    var breakpoint: Double
    
    var settings: unslick | Settings
  }
  object ResponsiveObject {
    
    inline def apply(breakpoint: Double, settings: unslick | Settings): ResponsiveObject = {
      val __obj = js.Dynamic.literal(breakpoint = breakpoint.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponsiveObject]
    }
    
    extension [Self <: ResponsiveObject](x: Self) {
      
      inline def setBreakpoint(value: Double): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
      
      inline def setSettings(value: unslick | Settings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    }
  }
  
  trait Settings extends StObject {
    
    var accessibility: js.UndefOr[Boolean] = js.undefined
    
    var adaptiveHeight: js.UndefOr[Boolean] = js.undefined
    
    var afterChange: js.UndefOr[js.Function1[/* currentSlide */ Double, Unit]] = js.undefined
    
    var appendDots: js.UndefOr[js.Function1[/* dots */ ReactNode, Element]] = js.undefined
    
    var arrows: js.UndefOr[Boolean] = js.undefined
    
    var asNavFor: js.UndefOr[Slider] = js.undefined
    
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    var autoplaySpeed: js.UndefOr[Double] = js.undefined
    
    var beforeChange: js.UndefOr[js.Function2[/* currentSlide */ Double, /* nextSlide */ Double, Unit]] = js.undefined
    
    var centerMode: js.UndefOr[Boolean] = js.undefined
    
    var centerPadding: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var cssEase: js.UndefOr[String] = js.undefined
    
    var customPaging: js.UndefOr[js.Function1[/* index */ Double, Element]] = js.undefined
    
    var dots: js.UndefOr[Boolean] = js.undefined
    
    var dotsClass: js.UndefOr[String] = js.undefined
    
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    var easing: js.UndefOr[String] = js.undefined
    
    var edgeFriction: js.UndefOr[Double] = js.undefined
    
    var fade: js.UndefOr[Boolean] = js.undefined
    
    var focusOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var infinite: js.UndefOr[Boolean] = js.undefined
    
    var initialSlide: js.UndefOr[Double] = js.undefined
    
    var lazyLoad: js.UndefOr[LazyLoadTypes] = js.undefined
    
    var nextArrow: js.UndefOr[Element] = js.undefined
    
    var onEdge: js.UndefOr[js.Function1[/* swipeDirection */ SwipeDirection, Unit]] = js.undefined
    
    var onInit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onLazyLoad: js.UndefOr[js.Function1[/* slidesToLoad */ js.Array[Double], Unit]] = js.undefined
    
    var onReInit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSwipe: js.UndefOr[js.Function1[/* swipeDirection */ SwipeDirection, Unit]] = js.undefined
    
    var pauseOnDotsHover: js.UndefOr[Boolean] = js.undefined
    
    var pauseOnFocus: js.UndefOr[Boolean] = js.undefined
    
    var pauseOnHover: js.UndefOr[Boolean] = js.undefined
    
    var prevArrow: js.UndefOr[Element] = js.undefined
    
    var responsive: js.UndefOr[js.Array[ResponsiveObject]] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var slide: js.UndefOr[String] = js.undefined
    
    var slidesPerRow: js.UndefOr[Double] = js.undefined
    
    var slidesToScroll: js.UndefOr[Double] = js.undefined
    
    var slidesToShow: js.UndefOr[Double] = js.undefined
    
    var speed: js.UndefOr[Double] = js.undefined
    
    var swipe: js.UndefOr[Boolean] = js.undefined
    
    var swipeEvent: js.UndefOr[js.Function1[/* swipeDirection */ SwipeDirection, Unit]] = js.undefined
    
    var swipeToSlide: js.UndefOr[Boolean] = js.undefined
    
    var touchMove: js.UndefOr[Boolean] = js.undefined
    
    var touchThreshold: js.UndefOr[Double] = js.undefined
    
    var useCSS: js.UndefOr[Boolean] = js.undefined
    
    var useTransform: js.UndefOr[Boolean] = js.undefined
    
    var variableWidth: js.UndefOr[Boolean] = js.undefined
    
    var vertical: js.UndefOr[Boolean] = js.undefined
    
    var verticalSwiping: js.UndefOr[Boolean] = js.undefined
    
    var waitForAnimate: js.UndefOr[Boolean] = js.undefined
  }
  object Settings {
    
    inline def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    extension [Self <: Settings](x: Self) {
      
      inline def setAccessibility(value: Boolean): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
      
      inline def setAdaptiveHeight(value: Boolean): Self = StObject.set(x, "adaptiveHeight", value.asInstanceOf[js.Any])
      
      inline def setAdaptiveHeightUndefined: Self = StObject.set(x, "adaptiveHeight", js.undefined)
      
      inline def setAfterChange(value: /* currentSlide */ Double => Unit): Self = StObject.set(x, "afterChange", js.Any.fromFunction1(value))
      
      inline def setAfterChangeUndefined: Self = StObject.set(x, "afterChange", js.undefined)
      
      inline def setAppendDots(value: /* dots */ ReactNode => Element): Self = StObject.set(x, "appendDots", js.Any.fromFunction1(value))
      
      inline def setAppendDotsUndefined: Self = StObject.set(x, "appendDots", js.undefined)
      
      inline def setArrows(value: Boolean): Self = StObject.set(x, "arrows", value.asInstanceOf[js.Any])
      
      inline def setArrowsUndefined: Self = StObject.set(x, "arrows", js.undefined)
      
      inline def setAsNavFor(value: Slider): Self = StObject.set(x, "asNavFor", value.asInstanceOf[js.Any])
      
      inline def setAsNavForUndefined: Self = StObject.set(x, "asNavFor", js.undefined)
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplaySpeed(value: Double): Self = StObject.set(x, "autoplaySpeed", value.asInstanceOf[js.Any])
      
      inline def setAutoplaySpeedUndefined: Self = StObject.set(x, "autoplaySpeed", js.undefined)
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setBeforeChange(value: (/* currentSlide */ Double, /* nextSlide */ Double) => Unit): Self = StObject.set(x, "beforeChange", js.Any.fromFunction2(value))
      
      inline def setBeforeChangeUndefined: Self = StObject.set(x, "beforeChange", js.undefined)
      
      inline def setCenterMode(value: Boolean): Self = StObject.set(x, "centerMode", value.asInstanceOf[js.Any])
      
      inline def setCenterModeUndefined: Self = StObject.set(x, "centerMode", js.undefined)
      
      inline def setCenterPadding(value: String): Self = StObject.set(x, "centerPadding", value.asInstanceOf[js.Any])
      
      inline def setCenterPaddingUndefined: Self = StObject.set(x, "centerPadding", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCssEase(value: String): Self = StObject.set(x, "cssEase", value.asInstanceOf[js.Any])
      
      inline def setCssEaseUndefined: Self = StObject.set(x, "cssEase", js.undefined)
      
      inline def setCustomPaging(value: /* index */ Double => Element): Self = StObject.set(x, "customPaging", js.Any.fromFunction1(value))
      
      inline def setCustomPagingUndefined: Self = StObject.set(x, "customPaging", js.undefined)
      
      inline def setDots(value: Boolean): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
      
      inline def setDotsClass(value: String): Self = StObject.set(x, "dotsClass", value.asInstanceOf[js.Any])
      
      inline def setDotsClassUndefined: Self = StObject.set(x, "dotsClass", js.undefined)
      
      inline def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setEdgeFriction(value: Double): Self = StObject.set(x, "edgeFriction", value.asInstanceOf[js.Any])
      
      inline def setEdgeFrictionUndefined: Self = StObject.set(x, "edgeFriction", js.undefined)
      
      inline def setFade(value: Boolean): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
      
      inline def setFadeUndefined: Self = StObject.set(x, "fade", js.undefined)
      
      inline def setFocusOnSelect(value: Boolean): Self = StObject.set(x, "focusOnSelect", value.asInstanceOf[js.Any])
      
      inline def setFocusOnSelectUndefined: Self = StObject.set(x, "focusOnSelect", js.undefined)
      
      inline def setInfinite(value: Boolean): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
      
      inline def setInfiniteUndefined: Self = StObject.set(x, "infinite", js.undefined)
      
      inline def setInitialSlide(value: Double): Self = StObject.set(x, "initialSlide", value.asInstanceOf[js.Any])
      
      inline def setInitialSlideUndefined: Self = StObject.set(x, "initialSlide", js.undefined)
      
      inline def setLazyLoad(value: LazyLoadTypes): Self = StObject.set(x, "lazyLoad", value.asInstanceOf[js.Any])
      
      inline def setLazyLoadUndefined: Self = StObject.set(x, "lazyLoad", js.undefined)
      
      inline def setNextArrow(value: Element): Self = StObject.set(x, "nextArrow", value.asInstanceOf[js.Any])
      
      inline def setNextArrowUndefined: Self = StObject.set(x, "nextArrow", js.undefined)
      
      inline def setOnEdge(value: /* swipeDirection */ SwipeDirection => Unit): Self = StObject.set(x, "onEdge", js.Any.fromFunction1(value))
      
      inline def setOnEdgeUndefined: Self = StObject.set(x, "onEdge", js.undefined)
      
      inline def setOnInit(value: () => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction0(value))
      
      inline def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
      
      inline def setOnLazyLoad(value: /* slidesToLoad */ js.Array[Double] => Unit): Self = StObject.set(x, "onLazyLoad", js.Any.fromFunction1(value))
      
      inline def setOnLazyLoadUndefined: Self = StObject.set(x, "onLazyLoad", js.undefined)
      
      inline def setOnReInit(value: () => Unit): Self = StObject.set(x, "onReInit", js.Any.fromFunction0(value))
      
      inline def setOnReInitUndefined: Self = StObject.set(x, "onReInit", js.undefined)
      
      inline def setOnSwipe(value: /* swipeDirection */ SwipeDirection => Unit): Self = StObject.set(x, "onSwipe", js.Any.fromFunction1(value))
      
      inline def setOnSwipeUndefined: Self = StObject.set(x, "onSwipe", js.undefined)
      
      inline def setPauseOnDotsHover(value: Boolean): Self = StObject.set(x, "pauseOnDotsHover", value.asInstanceOf[js.Any])
      
      inline def setPauseOnDotsHoverUndefined: Self = StObject.set(x, "pauseOnDotsHover", js.undefined)
      
      inline def setPauseOnFocus(value: Boolean): Self = StObject.set(x, "pauseOnFocus", value.asInstanceOf[js.Any])
      
      inline def setPauseOnFocusUndefined: Self = StObject.set(x, "pauseOnFocus", js.undefined)
      
      inline def setPauseOnHover(value: Boolean): Self = StObject.set(x, "pauseOnHover", value.asInstanceOf[js.Any])
      
      inline def setPauseOnHoverUndefined: Self = StObject.set(x, "pauseOnHover", js.undefined)
      
      inline def setPrevArrow(value: Element): Self = StObject.set(x, "prevArrow", value.asInstanceOf[js.Any])
      
      inline def setPrevArrowUndefined: Self = StObject.set(x, "prevArrow", js.undefined)
      
      inline def setResponsive(value: js.Array[ResponsiveObject]): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      inline def setResponsiveVarargs(value: ResponsiveObject*): Self = StObject.set(x, "responsive", js.Array(value :_*))
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setSlide(value: String): Self = StObject.set(x, "slide", value.asInstanceOf[js.Any])
      
      inline def setSlideUndefined: Self = StObject.set(x, "slide", js.undefined)
      
      inline def setSlidesPerRow(value: Double): Self = StObject.set(x, "slidesPerRow", value.asInstanceOf[js.Any])
      
      inline def setSlidesPerRowUndefined: Self = StObject.set(x, "slidesPerRow", js.undefined)
      
      inline def setSlidesToScroll(value: Double): Self = StObject.set(x, "slidesToScroll", value.asInstanceOf[js.Any])
      
      inline def setSlidesToScrollUndefined: Self = StObject.set(x, "slidesToScroll", js.undefined)
      
      inline def setSlidesToShow(value: Double): Self = StObject.set(x, "slidesToShow", value.asInstanceOf[js.Any])
      
      inline def setSlidesToShowUndefined: Self = StObject.set(x, "slidesToShow", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      inline def setSwipe(value: Boolean): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
      
      inline def setSwipeEvent(value: /* swipeDirection */ SwipeDirection => Unit): Self = StObject.set(x, "swipeEvent", js.Any.fromFunction1(value))
      
      inline def setSwipeEventUndefined: Self = StObject.set(x, "swipeEvent", js.undefined)
      
      inline def setSwipeToSlide(value: Boolean): Self = StObject.set(x, "swipeToSlide", value.asInstanceOf[js.Any])
      
      inline def setSwipeToSlideUndefined: Self = StObject.set(x, "swipeToSlide", js.undefined)
      
      inline def setSwipeUndefined: Self = StObject.set(x, "swipe", js.undefined)
      
      inline def setTouchMove(value: Boolean): Self = StObject.set(x, "touchMove", value.asInstanceOf[js.Any])
      
      inline def setTouchMoveUndefined: Self = StObject.set(x, "touchMove", js.undefined)
      
      inline def setTouchThreshold(value: Double): Self = StObject.set(x, "touchThreshold", value.asInstanceOf[js.Any])
      
      inline def setTouchThresholdUndefined: Self = StObject.set(x, "touchThreshold", js.undefined)
      
      inline def setUseCSS(value: Boolean): Self = StObject.set(x, "useCSS", value.asInstanceOf[js.Any])
      
      inline def setUseCSSUndefined: Self = StObject.set(x, "useCSS", js.undefined)
      
      inline def setUseTransform(value: Boolean): Self = StObject.set(x, "useTransform", value.asInstanceOf[js.Any])
      
      inline def setUseTransformUndefined: Self = StObject.set(x, "useTransform", js.undefined)
      
      inline def setVariableWidth(value: Boolean): Self = StObject.set(x, "variableWidth", value.asInstanceOf[js.Any])
      
      inline def setVariableWidthUndefined: Self = StObject.set(x, "variableWidth", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalSwiping(value: Boolean): Self = StObject.set(x, "verticalSwiping", value.asInstanceOf[js.Any])
      
      inline def setVerticalSwipingUndefined: Self = StObject.set(x, "verticalSwiping", js.undefined)
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      
      inline def setWaitForAnimate(value: Boolean): Self = StObject.set(x, "waitForAnimate", value.asInstanceOf[js.Any])
      
      inline def setWaitForAnimateUndefined: Self = StObject.set(x, "waitForAnimate", js.undefined)
    }
  }
  
  @js.native
  trait Slider
    extends Component[Settings, scala.Nothing, js.Any] {
    
    def slickGoTo(slideNumber: Double): Unit = js.native
    def slickGoTo(slideNumber: Double, dontAnimate: Boolean): Unit = js.native
    
    def slickNext(): Unit = js.native
    
    def slickPause(): Unit = js.native
    
    def slickPlay(): Unit = js.native
    
    def slickPrev(): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSlick.reactSlickStrings.left
    - typings.reactSlick.reactSlickStrings.down
    - typings.reactSlick.reactSlickStrings.right
    - typings.reactSlick.reactSlickStrings.up
    - java.lang.String
  */
  type SwipeDirection = _SwipeDirection | String
  
  trait _SwipeDirection extends StObject
}
