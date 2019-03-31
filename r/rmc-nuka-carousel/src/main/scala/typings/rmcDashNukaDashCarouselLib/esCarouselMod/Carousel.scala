package typings
package rmcDashNukaDashCarouselLib.esCarouselMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Carousel
  extends reactLib.reactMod.Component[ICarouselProps, js.Any, js.Any] {
  var _rafID: js.Any = js.native
  var autoplayID: js.Any = js.native
  var autoplayPaused: js.Any = js.native
  var clickSafe: scala.Boolean = js.native
  var touchObject: js.Any = js.native
  def _rafCb(): scala.Unit = js.native
  def animateSlide(): scala.Unit = js.native
  def animateSlide(easing: js.Any): scala.Unit = js.native
  def animateSlide(easing: js.Any, duration: js.Any): scala.Unit = js.native
  def animateSlide(easing: js.Any, duration: js.Any, endValue: js.Any): scala.Unit = js.native
  def animateSlide(easing: js.Any, duration: js.Any, endValue: js.Any, callback: js.Function): scala.Unit = js.native
  def autoplayIterator(): scala.Unit = js.native
  def bindEvents(): scala.Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MCarousel(): scala.Unit = js.native
  @JSName("componentWillMount")
  def componentWillMount_MCarousel(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MCarousel(nextProps: js.Any): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MCarousel(): scala.Unit = js.native
  def formatChildren(children: js.Any): js.Array[reactLib.reactMod.Global.JSXNs.Element] = js.native
  def getDecoratorStyles(position: js.Any): rmcDashNukaDashCarouselLib.Anon_Left | rmcDashNukaDashCarouselLib.Anon_LeftMsTransform | rmcDashNukaDashCarouselLib.Anon_Position | rmcDashNukaDashCarouselLib.Anon_LeftMsTransformPosition | rmcDashNukaDashCarouselLib.Anon_LeftMsTransformPositionTop | rmcDashNukaDashCarouselLib.Anon_MsTransform | rmcDashNukaDashCarouselLib.Anon_Bottom | rmcDashNukaDashCarouselLib.Anon_BottomPosition | rmcDashNukaDashCarouselLib.Anon_BottomPositionRight = js.native
  def getFrameStyles(): reactLib.reactMod.ReactNs.CSSProperties = js.native
  def getListStyles(): reactLib.reactMod.ReactNs.CSSProperties = js.native
  def getMouseEvents(): rmcDashNukaDashCarouselLib.Anon_EOnMouseDown | scala.Null = js.native
  def getSlideStyles(index: js.Any, positionValue: js.Any): reactLib.reactMod.ReactNs.CSSProperties = js.native
  def getSlideTargetPosition(index: js.Any, positionValue: js.Any): scala.Double = js.native
  def getSliderStyles(): rmcDashNukaDashCarouselLib.Anon_BoxSizing = js.native
  def getStyleTagStyles(): java.lang.String = js.native
  def getTargetLeft(): scala.Double = js.native
  def getTargetLeft(touchOffset: js.Any): scala.Double = js.native
  def getTargetLeft(touchOffset: js.Any, slide: js.Any): scala.Double = js.native
  def getTouchEvents(): rmcDashNukaDashCarouselLib.Anon_E | scala.Null = js.native
  def getTweeningValue(path: js.Any): js.Any = js.native
  def goToSlide(index: js.Any): scala.Unit = js.native
  def handleClick(e: js.Any): scala.Unit = js.native
  def handleMouseOut(): scala.Unit = js.native
  def handleMouseOver(): scala.Unit = js.native
  def handleSwipe(`_`: js.Any): scala.Unit = js.native
  def nextSlide(): scala.Unit = js.native
  def onReadyStateChange(): scala.Unit = js.native
  def onResize(): scala.Unit = js.native
  def previousSlide(): scala.Unit = js.native
  def resetAutoplay(): scala.Unit = js.native
  def setDimensions(): scala.Unit = js.native
  def setDimensions(props: js.Any): scala.Unit = js.native
  def setExternalData(): scala.Unit = js.native
  def setInitialDimensions(): scala.Unit = js.native
  def setLeft(): scala.Unit = js.native
  def startAutoplay(): scala.Unit = js.native
  def stopAutoplay(): scala.Unit = js.native
  def swipeDirection(x1: js.Any, x2: js.Any, y1: js.Any, y2: js.Any): rmcDashNukaDashCarouselLib.rmcDashNukaDashCarouselLibNumbers.`0` | rmcDashNukaDashCarouselLib.rmcDashNukaDashCarouselLibNumbers.`1` | rmcDashNukaDashCarouselLib.rmcDashNukaDashCarouselLibNumbers.`-1` = js.native
  def tweenState(
    path: js.Any,
    hasEasingDurationDelayBeginValueEndValueOnEndStackBehavior: rmcDashNukaDashCarouselLib.Anon_BeginValue
  ): scala.Unit = js.native
  def unbindEvents(): scala.Unit = js.native
}

