package typings.reactSlick.mod

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
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
  @scala.inline
  def apply(
    accessibility: js.UndefOr[Boolean] = js.undefined,
    adaptiveHeight: js.UndefOr[Boolean] = js.undefined,
    afterChange: /* currentSlide */ Double => Unit = null,
    appendDots: /* dots */ ReactNode => Element = null,
    arrows: js.UndefOr[Boolean] = js.undefined,
    asNavFor: Slider = null,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplaySpeed: js.UndefOr[Double] = js.undefined,
    beforeChange: (/* currentSlide */ Double, /* nextSlide */ Double) => Unit = null,
    centerMode: js.UndefOr[Boolean] = js.undefined,
    centerPadding: String = null,
    className: String = null,
    cssEase: String = null,
    customPaging: /* index */ Double => Element = null,
    dots: js.UndefOr[Boolean] = js.undefined,
    dotsClass: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    easing: String = null,
    edgeFriction: js.UndefOr[Double] = js.undefined,
    fade: js.UndefOr[Boolean] = js.undefined,
    focusOnSelect: js.UndefOr[Boolean] = js.undefined,
    infinite: js.UndefOr[Boolean] = js.undefined,
    initialSlide: js.UndefOr[Double] = js.undefined,
    lazyLoad: LazyLoadTypes = null,
    nextArrow: Element = null,
    onEdge: /* swipeDirection */ SwipeDirection => Unit = null,
    onInit: () => Unit = null,
    onLazyLoad: /* slidesToLoad */ js.Array[Double] => Unit = null,
    onReInit: () => Unit = null,
    onSwipe: /* swipeDirection */ SwipeDirection => Unit = null,
    pauseOnDotsHover: js.UndefOr[Boolean] = js.undefined,
    pauseOnFocus: js.UndefOr[Boolean] = js.undefined,
    pauseOnHover: js.UndefOr[Boolean] = js.undefined,
    prevArrow: Element = null,
    responsive: js.Array[ResponsiveObject] = null,
    rows: js.UndefOr[Double] = js.undefined,
    rtl: js.UndefOr[Boolean] = js.undefined,
    slide: String = null,
    slidesPerRow: js.UndefOr[Double] = js.undefined,
    slidesToScroll: js.UndefOr[Double] = js.undefined,
    slidesToShow: js.UndefOr[Double] = js.undefined,
    speed: js.UndefOr[Double] = js.undefined,
    swipe: js.UndefOr[Boolean] = js.undefined,
    swipeEvent: /* swipeDirection */ SwipeDirection => Unit = null,
    swipeToSlide: js.UndefOr[Boolean] = js.undefined,
    touchMove: js.UndefOr[Boolean] = js.undefined,
    touchThreshold: js.UndefOr[Double] = js.undefined,
    useCSS: js.UndefOr[Boolean] = js.undefined,
    useTransform: js.UndefOr[Boolean] = js.undefined,
    variableWidth: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined,
    verticalSwiping: js.UndefOr[Boolean] = js.undefined,
    waitForAnimate: js.UndefOr[Boolean] = js.undefined
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accessibility)) __obj.updateDynamic("accessibility")(accessibility.get.asInstanceOf[js.Any])
    if (!js.isUndefined(adaptiveHeight)) __obj.updateDynamic("adaptiveHeight")(adaptiveHeight.get.asInstanceOf[js.Any])
    if (afterChange != null) __obj.updateDynamic("afterChange")(js.Any.fromFunction1(afterChange))
    if (appendDots != null) __obj.updateDynamic("appendDots")(js.Any.fromFunction1(appendDots))
    if (!js.isUndefined(arrows)) __obj.updateDynamic("arrows")(arrows.get.asInstanceOf[js.Any])
    if (asNavFor != null) __obj.updateDynamic("asNavFor")(asNavFor.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoplaySpeed)) __obj.updateDynamic("autoplaySpeed")(autoplaySpeed.get.asInstanceOf[js.Any])
    if (beforeChange != null) __obj.updateDynamic("beforeChange")(js.Any.fromFunction2(beforeChange))
    if (!js.isUndefined(centerMode)) __obj.updateDynamic("centerMode")(centerMode.get.asInstanceOf[js.Any])
    if (centerPadding != null) __obj.updateDynamic("centerPadding")(centerPadding.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (cssEase != null) __obj.updateDynamic("cssEase")(cssEase.asInstanceOf[js.Any])
    if (customPaging != null) __obj.updateDynamic("customPaging")(js.Any.fromFunction1(customPaging))
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.get.asInstanceOf[js.Any])
    if (dotsClass != null) __obj.updateDynamic("dotsClass")(dotsClass.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeFriction)) __obj.updateDynamic("edgeFriction")(edgeFriction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fade)) __obj.updateDynamic("fade")(fade.get.asInstanceOf[js.Any])
    if (!js.isUndefined(focusOnSelect)) __obj.updateDynamic("focusOnSelect")(focusOnSelect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(infinite)) __obj.updateDynamic("infinite")(infinite.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialSlide)) __obj.updateDynamic("initialSlide")(initialSlide.get.asInstanceOf[js.Any])
    if (lazyLoad != null) __obj.updateDynamic("lazyLoad")(lazyLoad.asInstanceOf[js.Any])
    if (nextArrow != null) __obj.updateDynamic("nextArrow")(nextArrow.asInstanceOf[js.Any])
    if (onEdge != null) __obj.updateDynamic("onEdge")(js.Any.fromFunction1(onEdge))
    if (onInit != null) __obj.updateDynamic("onInit")(js.Any.fromFunction0(onInit))
    if (onLazyLoad != null) __obj.updateDynamic("onLazyLoad")(js.Any.fromFunction1(onLazyLoad))
    if (onReInit != null) __obj.updateDynamic("onReInit")(js.Any.fromFunction0(onReInit))
    if (onSwipe != null) __obj.updateDynamic("onSwipe")(js.Any.fromFunction1(onSwipe))
    if (!js.isUndefined(pauseOnDotsHover)) __obj.updateDynamic("pauseOnDotsHover")(pauseOnDotsHover.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseOnFocus)) __obj.updateDynamic("pauseOnFocus")(pauseOnFocus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseOnHover)) __obj.updateDynamic("pauseOnHover")(pauseOnHover.get.asInstanceOf[js.Any])
    if (prevArrow != null) __obj.updateDynamic("prevArrow")(prevArrow.asInstanceOf[js.Any])
    if (responsive != null) __obj.updateDynamic("responsive")(responsive.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.get.asInstanceOf[js.Any])
    if (slide != null) __obj.updateDynamic("slide")(slide.asInstanceOf[js.Any])
    if (!js.isUndefined(slidesPerRow)) __obj.updateDynamic("slidesPerRow")(slidesPerRow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slidesToScroll)) __obj.updateDynamic("slidesToScroll")(slidesToScroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slidesToShow)) __obj.updateDynamic("slidesToShow")(slidesToShow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(swipe)) __obj.updateDynamic("swipe")(swipe.get.asInstanceOf[js.Any])
    if (swipeEvent != null) __obj.updateDynamic("swipeEvent")(js.Any.fromFunction1(swipeEvent))
    if (!js.isUndefined(swipeToSlide)) __obj.updateDynamic("swipeToSlide")(swipeToSlide.get.asInstanceOf[js.Any])
    if (!js.isUndefined(touchMove)) __obj.updateDynamic("touchMove")(touchMove.get.asInstanceOf[js.Any])
    if (!js.isUndefined(touchThreshold)) __obj.updateDynamic("touchThreshold")(touchThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useCSS)) __obj.updateDynamic("useCSS")(useCSS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useTransform)) __obj.updateDynamic("useTransform")(useTransform.get.asInstanceOf[js.Any])
    if (!js.isUndefined(variableWidth)) __obj.updateDynamic("variableWidth")(variableWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalSwiping)) __obj.updateDynamic("verticalSwiping")(verticalSwiping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForAnimate)) __obj.updateDynamic("waitForAnimate")(waitForAnimate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

