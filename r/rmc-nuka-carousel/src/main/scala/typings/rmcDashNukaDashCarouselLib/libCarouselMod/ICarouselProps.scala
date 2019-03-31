package typings
package rmcDashNukaDashCarouselLib.libCarouselMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICarouselProps extends js.Object {
  var afterSlide: js.UndefOr[js.Function1[/* index */ scala.Double, scala.Unit]] = js.undefined
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  var autoplayInterval: js.UndefOr[scala.Double] = js.undefined
  var beforeSlide: js.UndefOr[
    js.Function2[/* currentIndex */ scala.Double, /* endIndex */ scala.Double, scala.Unit]
  ] = js.undefined
  var cellAlign: js.UndefOr[
    rmcDashNukaDashCarouselLib.rmcDashNukaDashCarouselLibStrings.left | rmcDashNukaDashCarouselLib.rmcDashNukaDashCarouselLibStrings.center | rmcDashNukaDashCarouselLib.rmcDashNukaDashCarouselLibStrings.right
  ] = js.undefined
  var cellSpacing: js.UndefOr[scala.Double] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var decorators: js.UndefOr[js.Array[_]] = js.undefined
  var dragging: js.UndefOr[scala.Boolean] = js.undefined
  var easing: js.UndefOr[js.Function] = js.undefined
  var edgeEasing: js.UndefOr[js.Function] = js.undefined
  var frameOverflow: js.UndefOr[java.lang.String] = js.undefined
  var framePadding: js.UndefOr[java.lang.String] = js.undefined
  var initialSlideHeight: js.UndefOr[scala.Double] = js.undefined
  var initialSlideWidth: js.UndefOr[scala.Double] = js.undefined
  var resetAutoplay: js.UndefOr[scala.Boolean] = js.undefined
  var slideIndex: js.UndefOr[scala.Double] = js.undefined
  var slideWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var slidesToScroll: js.UndefOr[scala.Double | rmcDashNukaDashCarouselLib.rmcDashNukaDashCarouselLibStrings.auto] = js.undefined
  var slidesToShow: js.UndefOr[scala.Double] = js.undefined
  var speed: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var swipeSpeed: js.UndefOr[scala.Double] = js.undefined
  var swiping: js.UndefOr[scala.Boolean] = js.undefined
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
  var wrapAround: js.UndefOr[scala.Boolean] = js.undefined
}

object ICarouselProps {
  @scala.inline
  def apply(
    afterSlide: /* index */ scala.Double => scala.Unit = null,
    autoplay: js.UndefOr[scala.Boolean] = js.undefined,
    autoplayInterval: scala.Int | scala.Double = null,
    beforeSlide: (/* currentIndex */ scala.Double, /* endIndex */ scala.Double) => scala.Unit = null,
    cellAlign: rmcDashNukaDashCarouselLib.rmcDashNukaDashCarouselLibStrings.left | rmcDashNukaDashCarouselLib.rmcDashNukaDashCarouselLibStrings.center | rmcDashNukaDashCarouselLib.rmcDashNukaDashCarouselLibStrings.right = null,
    cellSpacing: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    data: () => scala.Unit = null,
    decorators: js.Array[_] = null,
    dragging: js.UndefOr[scala.Boolean] = js.undefined,
    easing: js.Function = null,
    edgeEasing: js.Function = null,
    frameOverflow: java.lang.String = null,
    framePadding: java.lang.String = null,
    initialSlideHeight: scala.Int | scala.Double = null,
    initialSlideWidth: scala.Int | scala.Double = null,
    resetAutoplay: js.UndefOr[scala.Boolean] = js.undefined,
    slideIndex: scala.Int | scala.Double = null,
    slideWidth: java.lang.String | scala.Double = null,
    slidesToScroll: scala.Double | rmcDashNukaDashCarouselLib.rmcDashNukaDashCarouselLibStrings.auto = null,
    slidesToShow: scala.Int | scala.Double = null,
    speed: scala.Int | scala.Double = null,
    style: js.Any = null,
    swipeSpeed: scala.Int | scala.Double = null,
    swiping: js.UndefOr[scala.Boolean] = js.undefined,
    vertical: js.UndefOr[scala.Boolean] = js.undefined,
    width: java.lang.String = null,
    wrapAround: js.UndefOr[scala.Boolean] = js.undefined
  ): ICarouselProps = {
    val __obj = js.Dynamic.literal()
    if (afterSlide != null) __obj.updateDynamic("afterSlide")(js.Any.fromFunction1(afterSlide))
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (autoplayInterval != null) __obj.updateDynamic("autoplayInterval")(autoplayInterval.asInstanceOf[js.Any])
    if (beforeSlide != null) __obj.updateDynamic("beforeSlide")(js.Any.fromFunction2(beforeSlide))
    if (cellAlign != null) __obj.updateDynamic("cellAlign")(cellAlign.asInstanceOf[js.Any])
    if (cellSpacing != null) __obj.updateDynamic("cellSpacing")(cellSpacing.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (data != null) __obj.updateDynamic("data")(js.Any.fromFunction0(data))
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (!js.isUndefined(dragging)) __obj.updateDynamic("dragging")(dragging)
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (edgeEasing != null) __obj.updateDynamic("edgeEasing")(edgeEasing)
    if (frameOverflow != null) __obj.updateDynamic("frameOverflow")(frameOverflow)
    if (framePadding != null) __obj.updateDynamic("framePadding")(framePadding)
    if (initialSlideHeight != null) __obj.updateDynamic("initialSlideHeight")(initialSlideHeight.asInstanceOf[js.Any])
    if (initialSlideWidth != null) __obj.updateDynamic("initialSlideWidth")(initialSlideWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(resetAutoplay)) __obj.updateDynamic("resetAutoplay")(resetAutoplay)
    if (slideIndex != null) __obj.updateDynamic("slideIndex")(slideIndex.asInstanceOf[js.Any])
    if (slideWidth != null) __obj.updateDynamic("slideWidth")(slideWidth.asInstanceOf[js.Any])
    if (slidesToScroll != null) __obj.updateDynamic("slidesToScroll")(slidesToScroll.asInstanceOf[js.Any])
    if (slidesToShow != null) __obj.updateDynamic("slidesToShow")(slidesToShow.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (swipeSpeed != null) __obj.updateDynamic("swipeSpeed")(swipeSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(swiping)) __obj.updateDynamic("swiping")(swiping)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    if (width != null) __obj.updateDynamic("width")(width)
    if (!js.isUndefined(wrapAround)) __obj.updateDynamic("wrapAround")(wrapAround)
    __obj.asInstanceOf[ICarouselProps]
  }
}

