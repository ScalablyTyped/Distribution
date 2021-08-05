package typings.rmcNukaCarousel

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.rmcNukaCarousel.anon.BeginValue
import typings.rmcNukaCarousel.anon.Bottom
import typings.rmcNukaCarousel.anon.BottomPosition
import typings.rmcNukaCarousel.anon.BoxSizing
import typings.rmcNukaCarousel.anon.Left
import typings.rmcNukaCarousel.anon.MsTransform
import typings.rmcNukaCarousel.anon.OnMouseDown
import typings.rmcNukaCarousel.anon.OnTouchCancel
import typings.rmcNukaCarousel.anon.Position
import typings.rmcNukaCarousel.anon.Right
import typings.rmcNukaCarousel.anon.TextAlign
import typings.rmcNukaCarousel.anon.Top
import typings.rmcNukaCarousel.anon.Transform
import typings.rmcNukaCarousel.rmcNukaCarouselNumbers.`-1`
import typings.rmcNukaCarousel.rmcNukaCarouselNumbers.`0`
import typings.rmcNukaCarousel.rmcNukaCarouselNumbers.`1`
import typings.rmcNukaCarousel.rmcNukaCarouselStrings.auto
import typings.rmcNukaCarousel.rmcNukaCarouselStrings.center
import typings.rmcNukaCarousel.rmcNukaCarouselStrings.left
import typings.rmcNukaCarousel.rmcNukaCarouselStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carouselMod {
  
  @JSImport("rmc-nuka-carousel/es/carousel", JSImport.Default)
  @js.native
  class default protected () extends Carousel {
    def this(props: js.Any) = this()
  }
  object default {
    
    @JSImport("rmc-nuka-carousel/es/carousel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("rmc-nuka-carousel/es/carousel", "default.defaultProps")
    @js.native
    def defaultProps: ICarouselProps = js.native
    inline def defaultProps_=(x: ICarouselProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Carousel
    extends Component[ICarouselProps, js.Any, js.Any] {
    
    def _rafCb(): Unit = js.native
    
    var _rafID: js.Any = js.native
    
    def animateSlide(): Unit = js.native
    def animateSlide(easing: js.Any): Unit = js.native
    def animateSlide(easing: js.Any, duration: js.Any): Unit = js.native
    def animateSlide(easing: js.Any, duration: js.Any, endValue: js.Any): Unit = js.native
    def animateSlide(easing: js.Any, duration: js.Any, endValue: js.Any, callback: js.Function): Unit = js.native
    def animateSlide(easing: js.Any, duration: js.Any, endValue: Unit, callback: js.Function): Unit = js.native
    def animateSlide(easing: js.Any, duration: Unit, endValue: js.Any): Unit = js.native
    def animateSlide(easing: js.Any, duration: Unit, endValue: js.Any, callback: js.Function): Unit = js.native
    def animateSlide(easing: js.Any, duration: Unit, endValue: Unit, callback: js.Function): Unit = js.native
    def animateSlide(easing: Unit, duration: js.Any): Unit = js.native
    def animateSlide(easing: Unit, duration: js.Any, endValue: js.Any): Unit = js.native
    def animateSlide(easing: Unit, duration: js.Any, endValue: js.Any, callback: js.Function): Unit = js.native
    def animateSlide(easing: Unit, duration: js.Any, endValue: Unit, callback: js.Function): Unit = js.native
    def animateSlide(easing: Unit, duration: Unit, endValue: js.Any): Unit = js.native
    def animateSlide(easing: Unit, duration: Unit, endValue: js.Any, callback: js.Function): Unit = js.native
    def animateSlide(easing: Unit, duration: Unit, endValue: Unit, callback: js.Function): Unit = js.native
    
    var autoplayID: js.Any = js.native
    
    def autoplayIterator(): Unit = js.native
    
    var autoplayPaused: js.Any = js.native
    
    def bindEvents(): Unit = js.native
    
    var clickSafe: Boolean = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MCarousel(): Unit = js.native
    
    @JSName("componentWillMount")
    def componentWillMount_MCarousel(): Unit = js.native
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MCarousel(nextProps: js.Any): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MCarousel(): Unit = js.native
    
    def formatChildren(children: js.Any): js.Array[Element] = js.native
    
    def getDecoratorStyles(position: js.Any): Left | MsTransform | Position | Top | Transform | Right | Bottom | TextAlign | BottomPosition = js.native
    
    def getFrameStyles(): CSSProperties = js.native
    
    def getListStyles(): CSSProperties = js.native
    
    def getMouseEvents(): OnMouseDown | Null = js.native
    
    def getSlideStyles(index: js.Any, positionValue: js.Any): CSSProperties = js.native
    
    def getSlideTargetPosition(index: js.Any, positionValue: js.Any): Double = js.native
    
    def getSliderStyles(): BoxSizing = js.native
    
    def getStyleTagStyles(): String = js.native
    
    def getTargetLeft(): Double = js.native
    def getTargetLeft(touchOffset: js.Any): Double = js.native
    def getTargetLeft(touchOffset: js.Any, slide: js.Any): Double = js.native
    def getTargetLeft(touchOffset: Unit, slide: js.Any): Double = js.native
    
    def getTouchEvents(): OnTouchCancel | Null = js.native
    
    def getTweeningValue(path: js.Any): js.Any = js.native
    
    def goToSlide(index: js.Any): Unit = js.native
    
    def handleClick(e: js.Any): Unit = js.native
    
    def handleMouseOut(): Unit = js.native
    
    def handleMouseOver(): Unit = js.native
    
    def handleSwipe(_underscore: js.Any): Unit = js.native
    
    def nextSlide(): Unit = js.native
    
    def onReadyStateChange(): Unit = js.native
    
    def onResize(): Unit = js.native
    
    def previousSlide(): Unit = js.native
    
    def resetAutoplay(): Unit = js.native
    
    def setDimensions(): Unit = js.native
    def setDimensions(props: js.Any): Unit = js.native
    
    def setExternalData(): Unit = js.native
    
    def setInitialDimensions(): Unit = js.native
    
    def setLeft(): Unit = js.native
    
    def startAutoplay(): Unit = js.native
    
    def stopAutoplay(): Unit = js.native
    
    def swipeDirection(x1: js.Any, x2: js.Any, y1: js.Any, y2: js.Any): `0` | `1` | `-1` = js.native
    
    var touchObject: js.Any = js.native
    
    def tweenState(path: js.Any, hasEasingDurationDelayBeginValueEndValueOnEndConfigSB: BeginValue): Unit = js.native
    
    def unbindEvents(): Unit = js.native
  }
  
  trait ICarouselProps extends StObject {
    
    var afterSlide: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
    
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    var autoplayInterval: js.UndefOr[Double] = js.undefined
    
    var beforeSlide: js.UndefOr[js.Function2[/* currentIndex */ Double, /* endIndex */ Double, Unit]] = js.undefined
    
    var cellAlign: js.UndefOr[left | center | right] = js.undefined
    
    var cellSpacing: js.UndefOr[Double] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var data: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var decorators: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var dragging: js.UndefOr[Boolean] = js.undefined
    
    var easing: js.UndefOr[js.Function] = js.undefined
    
    var edgeEasing: js.UndefOr[js.Function] = js.undefined
    
    var frameOverflow: js.UndefOr[String] = js.undefined
    
    var framePadding: js.UndefOr[String] = js.undefined
    
    var initialSlideHeight: js.UndefOr[Double] = js.undefined
    
    var initialSlideWidth: js.UndefOr[Double] = js.undefined
    
    var resetAutoplay: js.UndefOr[Boolean] = js.undefined
    
    var slideIndex: js.UndefOr[Double] = js.undefined
    
    var slideWidth: js.UndefOr[String | Double] = js.undefined
    
    var slidesToScroll: js.UndefOr[Double | auto] = js.undefined
    
    var slidesToShow: js.UndefOr[Double] = js.undefined
    
    var speed: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[js.Any] = js.undefined
    
    var swipeSpeed: js.UndefOr[Double] = js.undefined
    
    var swiping: js.UndefOr[Boolean] = js.undefined
    
    var vertical: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
    
    var wrapAround: js.UndefOr[Boolean] = js.undefined
  }
  object ICarouselProps {
    
    inline def apply(): ICarouselProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICarouselProps]
    }
    
    extension [Self <: ICarouselProps](x: Self) {
      
      inline def setAfterSlide(value: /* index */ Double => Unit): Self = StObject.set(x, "afterSlide", js.Any.fromFunction1(value))
      
      inline def setAfterSlideUndefined: Self = StObject.set(x, "afterSlide", js.undefined)
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayInterval(value: Double): Self = StObject.set(x, "autoplayInterval", value.asInstanceOf[js.Any])
      
      inline def setAutoplayIntervalUndefined: Self = StObject.set(x, "autoplayInterval", js.undefined)
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setBeforeSlide(value: (/* currentIndex */ Double, /* endIndex */ Double) => Unit): Self = StObject.set(x, "beforeSlide", js.Any.fromFunction2(value))
      
      inline def setBeforeSlideUndefined: Self = StObject.set(x, "beforeSlide", js.undefined)
      
      inline def setCellAlign(value: left | center | right): Self = StObject.set(x, "cellAlign", value.asInstanceOf[js.Any])
      
      inline def setCellAlignUndefined: Self = StObject.set(x, "cellAlign", js.undefined)
      
      inline def setCellSpacing(value: Double): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
      
      inline def setCellSpacingUndefined: Self = StObject.set(x, "cellSpacing", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setData(value: () => Unit): Self = StObject.set(x, "data", js.Any.fromFunction0(value))
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDecorators(value: js.Array[js.Any]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
      
      inline def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
      
      inline def setDecoratorsVarargs(value: js.Any*): Self = StObject.set(x, "decorators", js.Array(value :_*))
      
      inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
      
      inline def setEasing(value: js.Function): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setEdgeEasing(value: js.Function): Self = StObject.set(x, "edgeEasing", value.asInstanceOf[js.Any])
      
      inline def setEdgeEasingUndefined: Self = StObject.set(x, "edgeEasing", js.undefined)
      
      inline def setFrameOverflow(value: String): Self = StObject.set(x, "frameOverflow", value.asInstanceOf[js.Any])
      
      inline def setFrameOverflowUndefined: Self = StObject.set(x, "frameOverflow", js.undefined)
      
      inline def setFramePadding(value: String): Self = StObject.set(x, "framePadding", value.asInstanceOf[js.Any])
      
      inline def setFramePaddingUndefined: Self = StObject.set(x, "framePadding", js.undefined)
      
      inline def setInitialSlideHeight(value: Double): Self = StObject.set(x, "initialSlideHeight", value.asInstanceOf[js.Any])
      
      inline def setInitialSlideHeightUndefined: Self = StObject.set(x, "initialSlideHeight", js.undefined)
      
      inline def setInitialSlideWidth(value: Double): Self = StObject.set(x, "initialSlideWidth", value.asInstanceOf[js.Any])
      
      inline def setInitialSlideWidthUndefined: Self = StObject.set(x, "initialSlideWidth", js.undefined)
      
      inline def setResetAutoplay(value: Boolean): Self = StObject.set(x, "resetAutoplay", value.asInstanceOf[js.Any])
      
      inline def setResetAutoplayUndefined: Self = StObject.set(x, "resetAutoplay", js.undefined)
      
      inline def setSlideIndex(value: Double): Self = StObject.set(x, "slideIndex", value.asInstanceOf[js.Any])
      
      inline def setSlideIndexUndefined: Self = StObject.set(x, "slideIndex", js.undefined)
      
      inline def setSlideWidth(value: String | Double): Self = StObject.set(x, "slideWidth", value.asInstanceOf[js.Any])
      
      inline def setSlideWidthUndefined: Self = StObject.set(x, "slideWidth", js.undefined)
      
      inline def setSlidesToScroll(value: Double | auto): Self = StObject.set(x, "slidesToScroll", value.asInstanceOf[js.Any])
      
      inline def setSlidesToScrollUndefined: Self = StObject.set(x, "slidesToScroll", js.undefined)
      
      inline def setSlidesToShow(value: Double): Self = StObject.set(x, "slidesToShow", value.asInstanceOf[js.Any])
      
      inline def setSlidesToShowUndefined: Self = StObject.set(x, "slidesToShow", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      inline def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSwipeSpeed(value: Double): Self = StObject.set(x, "swipeSpeed", value.asInstanceOf[js.Any])
      
      inline def setSwipeSpeedUndefined: Self = StObject.set(x, "swipeSpeed", js.undefined)
      
      inline def setSwiping(value: Boolean): Self = StObject.set(x, "swiping", value.asInstanceOf[js.Any])
      
      inline def setSwipingUndefined: Self = StObject.set(x, "swiping", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWrapAround(value: Boolean): Self = StObject.set(x, "wrapAround", value.asInstanceOf[js.Any])
      
      inline def setWrapAroundUndefined: Self = StObject.set(x, "wrapAround", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rmcNukaCarousel.rmcNukaCarouselStrings.TopLeft
    - typings.rmcNukaCarousel.rmcNukaCarouselStrings.TopCenter
    - typings.rmcNukaCarousel.rmcNukaCarouselStrings.TopRight
    - typings.rmcNukaCarousel.rmcNukaCarouselStrings.CenterLeft
    - typings.rmcNukaCarousel.rmcNukaCarouselStrings.CenterCenter
    - typings.rmcNukaCarousel.rmcNukaCarouselStrings.CenterRight
    - typings.rmcNukaCarousel.rmcNukaCarouselStrings.BottomLeft
    - typings.rmcNukaCarousel.rmcNukaCarouselStrings.BottomCenter
    - typings.rmcNukaCarousel.rmcNukaCarouselStrings.BottomRight
  */
  trait IDecoratorPosition extends StObject
  object IDecoratorPosition {
    
    inline def BottomCenter: typings.rmcNukaCarousel.rmcNukaCarouselStrings.BottomCenter = "BottomCenter".asInstanceOf[typings.rmcNukaCarousel.rmcNukaCarouselStrings.BottomCenter]
    
    inline def BottomLeft: typings.rmcNukaCarousel.rmcNukaCarouselStrings.BottomLeft = "BottomLeft".asInstanceOf[typings.rmcNukaCarousel.rmcNukaCarouselStrings.BottomLeft]
    
    inline def BottomRight: typings.rmcNukaCarousel.rmcNukaCarouselStrings.BottomRight = "BottomRight".asInstanceOf[typings.rmcNukaCarousel.rmcNukaCarouselStrings.BottomRight]
    
    inline def CenterCenter: typings.rmcNukaCarousel.rmcNukaCarouselStrings.CenterCenter = "CenterCenter".asInstanceOf[typings.rmcNukaCarousel.rmcNukaCarouselStrings.CenterCenter]
    
    inline def CenterLeft: typings.rmcNukaCarousel.rmcNukaCarouselStrings.CenterLeft = "CenterLeft".asInstanceOf[typings.rmcNukaCarousel.rmcNukaCarouselStrings.CenterLeft]
    
    inline def CenterRight: typings.rmcNukaCarousel.rmcNukaCarouselStrings.CenterRight = "CenterRight".asInstanceOf[typings.rmcNukaCarousel.rmcNukaCarouselStrings.CenterRight]
    
    inline def TopCenter: typings.rmcNukaCarousel.rmcNukaCarouselStrings.TopCenter = "TopCenter".asInstanceOf[typings.rmcNukaCarousel.rmcNukaCarouselStrings.TopCenter]
    
    inline def TopLeft: typings.rmcNukaCarousel.rmcNukaCarouselStrings.TopLeft = "TopLeft".asInstanceOf[typings.rmcNukaCarousel.rmcNukaCarouselStrings.TopLeft]
    
    inline def TopRight: typings.rmcNukaCarousel.rmcNukaCarouselStrings.TopRight = "TopRight".asInstanceOf[typings.rmcNukaCarousel.rmcNukaCarouselStrings.TopRight]
  }
}
