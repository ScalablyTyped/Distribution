package typings.rmcNukaCarousel.carouselMod

import typings.rmcNukaCarousel.rmcNukaCarouselStrings.auto
import typings.rmcNukaCarousel.rmcNukaCarouselStrings.center
import typings.rmcNukaCarousel.rmcNukaCarouselStrings.left
import typings.rmcNukaCarousel.rmcNukaCarouselStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICarouselProps extends js.Object {
  var afterSlide: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  var autoplay: js.UndefOr[Boolean] = js.undefined
  var autoplayInterval: js.UndefOr[Double] = js.undefined
  var beforeSlide: js.UndefOr[js.Function2[/* currentIndex */ Double, /* endIndex */ Double, Unit]] = js.undefined
  var cellAlign: js.UndefOr[left | center | right] = js.undefined
  var cellSpacing: js.UndefOr[Double] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Function0[Unit]] = js.undefined
  var decorators: js.UndefOr[js.Array[_]] = js.undefined
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
  @scala.inline
  def apply(
    afterSlide: /* index */ Double => Unit = null,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplayInterval: js.UndefOr[Double] = js.undefined,
    beforeSlide: (/* currentIndex */ Double, /* endIndex */ Double) => Unit = null,
    cellAlign: left | center | right = null,
    cellSpacing: js.UndefOr[Double] = js.undefined,
    className: String = null,
    data: () => Unit = null,
    decorators: js.Array[_] = null,
    dragging: js.UndefOr[Boolean] = js.undefined,
    easing: js.Function = null,
    edgeEasing: js.Function = null,
    frameOverflow: String = null,
    framePadding: String = null,
    initialSlideHeight: js.UndefOr[Double] = js.undefined,
    initialSlideWidth: js.UndefOr[Double] = js.undefined,
    resetAutoplay: js.UndefOr[Boolean] = js.undefined,
    slideIndex: js.UndefOr[Double] = js.undefined,
    slideWidth: String | Double = null,
    slidesToScroll: Double | auto = null,
    slidesToShow: js.UndefOr[Double] = js.undefined,
    speed: js.UndefOr[Double] = js.undefined,
    style: js.Any = null,
    swipeSpeed: js.UndefOr[Double] = js.undefined,
    swiping: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined,
    width: String = null,
    wrapAround: js.UndefOr[Boolean] = js.undefined
  ): ICarouselProps = {
    val __obj = js.Dynamic.literal()
    if (afterSlide != null) __obj.updateDynamic("afterSlide")(js.Any.fromFunction1(afterSlide))
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplayInterval)) __obj.updateDynamic("autoplayInterval")(autoplayInterval.get.asInstanceOf[js.Any])
    if (beforeSlide != null) __obj.updateDynamic("beforeSlide")(js.Any.fromFunction2(beforeSlide))
    if (cellAlign != null) __obj.updateDynamic("cellAlign")(cellAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(cellSpacing)) __obj.updateDynamic("cellSpacing")(cellSpacing.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(js.Any.fromFunction0(data))
    if (decorators != null) __obj.updateDynamic("decorators")(decorators.asInstanceOf[js.Any])
    if (!js.isUndefined(dragging)) __obj.updateDynamic("dragging")(dragging.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (edgeEasing != null) __obj.updateDynamic("edgeEasing")(edgeEasing.asInstanceOf[js.Any])
    if (frameOverflow != null) __obj.updateDynamic("frameOverflow")(frameOverflow.asInstanceOf[js.Any])
    if (framePadding != null) __obj.updateDynamic("framePadding")(framePadding.asInstanceOf[js.Any])
    if (!js.isUndefined(initialSlideHeight)) __obj.updateDynamic("initialSlideHeight")(initialSlideHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialSlideWidth)) __obj.updateDynamic("initialSlideWidth")(initialSlideWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resetAutoplay)) __obj.updateDynamic("resetAutoplay")(resetAutoplay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slideIndex)) __obj.updateDynamic("slideIndex")(slideIndex.get.asInstanceOf[js.Any])
    if (slideWidth != null) __obj.updateDynamic("slideWidth")(slideWidth.asInstanceOf[js.Any])
    if (slidesToScroll != null) __obj.updateDynamic("slidesToScroll")(slidesToScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(slidesToShow)) __obj.updateDynamic("slidesToShow")(slidesToShow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeSpeed)) __obj.updateDynamic("swipeSpeed")(swipeSpeed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(swiping)) __obj.updateDynamic("swiping")(swiping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapAround)) __obj.updateDynamic("wrapAround")(wrapAround.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICarouselProps]
  }
}

