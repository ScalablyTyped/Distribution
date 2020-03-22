package typings.rmcNukaCarousel.carouselMod

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod._Global_.JSX.Element
import typings.rmcNukaCarousel.AnonBeginValue
import typings.rmcNukaCarousel.AnonBottom
import typings.rmcNukaCarousel.AnonBottomPosition
import typings.rmcNukaCarousel.AnonBoxSizing
import typings.rmcNukaCarousel.AnonLeft
import typings.rmcNukaCarousel.AnonMsTransform
import typings.rmcNukaCarousel.AnonOnMouseDown
import typings.rmcNukaCarousel.AnonOnTouchCancel
import typings.rmcNukaCarousel.AnonPosition
import typings.rmcNukaCarousel.AnonRight
import typings.rmcNukaCarousel.AnonTextAlign
import typings.rmcNukaCarousel.AnonTop
import typings.rmcNukaCarousel.AnonTransform
import typings.rmcNukaCarousel.rmcNukaCarouselNumbers.`-1`
import typings.rmcNukaCarousel.rmcNukaCarouselNumbers.`0`
import typings.rmcNukaCarousel.rmcNukaCarouselNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Carousel
  extends Component[ICarouselProps, js.Any, js.Any] {
  var _rafID: js.Any = js.native
  var autoplayID: js.Any = js.native
  var autoplayPaused: js.Any = js.native
  var clickSafe: Boolean = js.native
  var touchObject: js.Any = js.native
  def _rafCb(): Unit = js.native
  def animateSlide(): Unit = js.native
  def animateSlide(easing: js.Any): Unit = js.native
  def animateSlide(easing: js.Any, duration: js.Any): Unit = js.native
  def animateSlide(easing: js.Any, duration: js.Any, endValue: js.Any): Unit = js.native
  def animateSlide(easing: js.Any, duration: js.Any, endValue: js.Any, callback: js.Function): Unit = js.native
  def autoplayIterator(): Unit = js.native
  def bindEvents(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MCarousel(): Unit = js.native
  @JSName("componentWillMount")
  def componentWillMount_MCarousel(): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MCarousel(nextProps: js.Any): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MCarousel(): Unit = js.native
  def formatChildren(children: js.Any): js.Array[Element] = js.native
  def getDecoratorStyles(position: js.Any): AnonLeft | AnonMsTransform | AnonPosition | AnonTop | AnonTransform | AnonRight | AnonBottom | AnonTextAlign | AnonBottomPosition = js.native
  def getFrameStyles(): CSSProperties = js.native
  def getListStyles(): CSSProperties = js.native
  def getMouseEvents(): AnonOnMouseDown | Null = js.native
  def getSlideStyles(index: js.Any, positionValue: js.Any): CSSProperties = js.native
  def getSlideTargetPosition(index: js.Any, positionValue: js.Any): Double = js.native
  def getSliderStyles(): AnonBoxSizing = js.native
  def getStyleTagStyles(): String = js.native
  def getTargetLeft(): Double = js.native
  def getTargetLeft(touchOffset: js.Any): Double = js.native
  def getTargetLeft(touchOffset: js.Any, slide: js.Any): Double = js.native
  def getTouchEvents(): AnonOnTouchCancel | Null = js.native
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
  def tweenState(path: js.Any, hasEasingDurationDelayBeginValueEndValueOnEndStackBehavior: AnonBeginValue): Unit = js.native
  def unbindEvents(): Unit = js.native
}

