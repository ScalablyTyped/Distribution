package typings.reactSlick.mod

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings extends js.Object {
  var accessibility: js.UndefOr[Boolean] = js.native
  var adaptiveHeight: js.UndefOr[Boolean] = js.native
  var afterChange: js.UndefOr[js.Function1[/* currentSlide */ Double, Unit]] = js.native
  var appendDots: js.UndefOr[js.Function1[/* dots */ ReactNode, Element]] = js.native
  var arrows: js.UndefOr[Boolean] = js.native
  var asNavFor: js.UndefOr[Slider] = js.native
  var autoplay: js.UndefOr[Boolean] = js.native
  var autoplaySpeed: js.UndefOr[Double] = js.native
  var beforeChange: js.UndefOr[js.Function2[/* currentSlide */ Double, /* nextSlide */ Double, Unit]] = js.native
  var centerMode: js.UndefOr[Boolean] = js.native
  var centerPadding: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var cssEase: js.UndefOr[String] = js.native
  var customPaging: js.UndefOr[js.Function1[/* index */ Double, Element]] = js.native
  var dots: js.UndefOr[Boolean] = js.native
  var dotsClass: js.UndefOr[String] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var easing: js.UndefOr[String] = js.native
  var edgeFriction: js.UndefOr[Double] = js.native
  var fade: js.UndefOr[Boolean] = js.native
  var focusOnSelect: js.UndefOr[Boolean] = js.native
  var infinite: js.UndefOr[Boolean] = js.native
  var initialSlide: js.UndefOr[Double] = js.native
  var lazyLoad: js.UndefOr[LazyLoadTypes] = js.native
  var nextArrow: js.UndefOr[Element] = js.native
  var onEdge: js.UndefOr[js.Function1[/* swipeDirection */ SwipeDirection, Unit]] = js.native
  var onInit: js.UndefOr[js.Function0[Unit]] = js.native
  var onLazyLoad: js.UndefOr[js.Function1[/* slidesToLoad */ js.Array[Double], Unit]] = js.native
  var onReInit: js.UndefOr[js.Function0[Unit]] = js.native
  var onSwipe: js.UndefOr[js.Function1[/* swipeDirection */ SwipeDirection, Unit]] = js.native
  var pauseOnDotsHover: js.UndefOr[Boolean] = js.native
  var pauseOnFocus: js.UndefOr[Boolean] = js.native
  var pauseOnHover: js.UndefOr[Boolean] = js.native
  var prevArrow: js.UndefOr[Element] = js.native
  var responsive: js.UndefOr[js.Array[ResponsiveObject]] = js.native
  var rows: js.UndefOr[Double] = js.native
  var rtl: js.UndefOr[Boolean] = js.native
  var slide: js.UndefOr[String] = js.native
  var slidesPerRow: js.UndefOr[Double] = js.native
  var slidesToScroll: js.UndefOr[Double] = js.native
  var slidesToShow: js.UndefOr[Double] = js.native
  var speed: js.UndefOr[Double] = js.native
  var swipe: js.UndefOr[Boolean] = js.native
  var swipeEvent: js.UndefOr[js.Function1[/* swipeDirection */ SwipeDirection, Unit]] = js.native
  var swipeToSlide: js.UndefOr[Boolean] = js.native
  var touchMove: js.UndefOr[Boolean] = js.native
  var touchThreshold: js.UndefOr[Double] = js.native
  var useCSS: js.UndefOr[Boolean] = js.native
  var useTransform: js.UndefOr[Boolean] = js.native
  var variableWidth: js.UndefOr[Boolean] = js.native
  var vertical: js.UndefOr[Boolean] = js.native
  var verticalSwiping: js.UndefOr[Boolean] = js.native
  var waitForAnimate: js.UndefOr[Boolean] = js.native
}

object Settings {
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessibility(value: Boolean): Self = this.set("accessibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibility: Self = this.set("accessibility", js.undefined)
    @scala.inline
    def setAdaptiveHeight(value: Boolean): Self = this.set("adaptiveHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdaptiveHeight: Self = this.set("adaptiveHeight", js.undefined)
    @scala.inline
    def setAfterChange(value: /* currentSlide */ Double => Unit): Self = this.set("afterChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterChange: Self = this.set("afterChange", js.undefined)
    @scala.inline
    def setAppendDots(value: /* dots */ ReactNode => Element): Self = this.set("appendDots", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAppendDots: Self = this.set("appendDots", js.undefined)
    @scala.inline
    def setArrows(value: Boolean): Self = this.set("arrows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrows: Self = this.set("arrows", js.undefined)
    @scala.inline
    def setAsNavFor(value: Slider): Self = this.set("asNavFor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsNavFor: Self = this.set("asNavFor", js.undefined)
    @scala.inline
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    @scala.inline
    def setAutoplaySpeed(value: Double): Self = this.set("autoplaySpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoplaySpeed: Self = this.set("autoplaySpeed", js.undefined)
    @scala.inline
    def setBeforeChange(value: (/* currentSlide */ Double, /* nextSlide */ Double) => Unit): Self = this.set("beforeChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeChange: Self = this.set("beforeChange", js.undefined)
    @scala.inline
    def setCenterMode(value: Boolean): Self = this.set("centerMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterMode: Self = this.set("centerMode", js.undefined)
    @scala.inline
    def setCenterPadding(value: String): Self = this.set("centerPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenterPadding: Self = this.set("centerPadding", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCssEase(value: String): Self = this.set("cssEase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssEase: Self = this.set("cssEase", js.undefined)
    @scala.inline
    def setCustomPaging(value: /* index */ Double => Element): Self = this.set("customPaging", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomPaging: Self = this.set("customPaging", js.undefined)
    @scala.inline
    def setDots(value: Boolean): Self = this.set("dots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDots: Self = this.set("dots", js.undefined)
    @scala.inline
    def setDotsClass(value: String): Self = this.set("dotsClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotsClass: Self = this.set("dotsClass", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setEdgeFriction(value: Double): Self = this.set("edgeFriction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgeFriction: Self = this.set("edgeFriction", js.undefined)
    @scala.inline
    def setFade(value: Boolean): Self = this.set("fade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFade: Self = this.set("fade", js.undefined)
    @scala.inline
    def setFocusOnSelect(value: Boolean): Self = this.set("focusOnSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusOnSelect: Self = this.set("focusOnSelect", js.undefined)
    @scala.inline
    def setInfinite(value: Boolean): Self = this.set("infinite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfinite: Self = this.set("infinite", js.undefined)
    @scala.inline
    def setInitialSlide(value: Double): Self = this.set("initialSlide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialSlide: Self = this.set("initialSlide", js.undefined)
    @scala.inline
    def setLazyLoad(value: LazyLoadTypes): Self = this.set("lazyLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLazyLoad: Self = this.set("lazyLoad", js.undefined)
    @scala.inline
    def setNextArrow(value: Element): Self = this.set("nextArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextArrow: Self = this.set("nextArrow", js.undefined)
    @scala.inline
    def setOnEdge(value: /* swipeDirection */ SwipeDirection => Unit): Self = this.set("onEdge", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnEdge: Self = this.set("onEdge", js.undefined)
    @scala.inline
    def setOnInit(value: () => Unit): Self = this.set("onInit", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnInit: Self = this.set("onInit", js.undefined)
    @scala.inline
    def setOnLazyLoad(value: /* slidesToLoad */ js.Array[Double] => Unit): Self = this.set("onLazyLoad", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLazyLoad: Self = this.set("onLazyLoad", js.undefined)
    @scala.inline
    def setOnReInit(value: () => Unit): Self = this.set("onReInit", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnReInit: Self = this.set("onReInit", js.undefined)
    @scala.inline
    def setOnSwipe(value: /* swipeDirection */ SwipeDirection => Unit): Self = this.set("onSwipe", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSwipe: Self = this.set("onSwipe", js.undefined)
    @scala.inline
    def setPauseOnDotsHover(value: Boolean): Self = this.set("pauseOnDotsHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePauseOnDotsHover: Self = this.set("pauseOnDotsHover", js.undefined)
    @scala.inline
    def setPauseOnFocus(value: Boolean): Self = this.set("pauseOnFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePauseOnFocus: Self = this.set("pauseOnFocus", js.undefined)
    @scala.inline
    def setPauseOnHover(value: Boolean): Self = this.set("pauseOnHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePauseOnHover: Self = this.set("pauseOnHover", js.undefined)
    @scala.inline
    def setPrevArrow(value: Element): Self = this.set("prevArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevArrow: Self = this.set("prevArrow", js.undefined)
    @scala.inline
    def setResponsiveVarargs(value: ResponsiveObject*): Self = this.set("responsive", js.Array(value :_*))
    @scala.inline
    def setResponsive(value: js.Array[ResponsiveObject]): Self = this.set("responsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponsive: Self = this.set("responsive", js.undefined)
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
    @scala.inline
    def setSlide(value: String): Self = this.set("slide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlide: Self = this.set("slide", js.undefined)
    @scala.inline
    def setSlidesPerRow(value: Double): Self = this.set("slidesPerRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlidesPerRow: Self = this.set("slidesPerRow", js.undefined)
    @scala.inline
    def setSlidesToScroll(value: Double): Self = this.set("slidesToScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlidesToScroll: Self = this.set("slidesToScroll", js.undefined)
    @scala.inline
    def setSlidesToShow(value: Double): Self = this.set("slidesToShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlidesToShow: Self = this.set("slidesToShow", js.undefined)
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    @scala.inline
    def setSwipe(value: Boolean): Self = this.set("swipe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipe: Self = this.set("swipe", js.undefined)
    @scala.inline
    def setSwipeEvent(value: /* swipeDirection */ SwipeDirection => Unit): Self = this.set("swipeEvent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSwipeEvent: Self = this.set("swipeEvent", js.undefined)
    @scala.inline
    def setSwipeToSlide(value: Boolean): Self = this.set("swipeToSlide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeToSlide: Self = this.set("swipeToSlide", js.undefined)
    @scala.inline
    def setTouchMove(value: Boolean): Self = this.set("touchMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchMove: Self = this.set("touchMove", js.undefined)
    @scala.inline
    def setTouchThreshold(value: Double): Self = this.set("touchThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchThreshold: Self = this.set("touchThreshold", js.undefined)
    @scala.inline
    def setUseCSS(value: Boolean): Self = this.set("useCSS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseCSS: Self = this.set("useCSS", js.undefined)
    @scala.inline
    def setUseTransform(value: Boolean): Self = this.set("useTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseTransform: Self = this.set("useTransform", js.undefined)
    @scala.inline
    def setVariableWidth(value: Boolean): Self = this.set("variableWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariableWidth: Self = this.set("variableWidth", js.undefined)
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
    @scala.inline
    def setVerticalSwiping(value: Boolean): Self = this.set("verticalSwiping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalSwiping: Self = this.set("verticalSwiping", js.undefined)
    @scala.inline
    def setWaitForAnimate(value: Boolean): Self = this.set("waitForAnimate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitForAnimate: Self = this.set("waitForAnimate", js.undefined)
  }
  
}

