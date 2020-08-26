package typings.rmcNukaCarousel.carouselMod

import typings.rmcNukaCarousel.rmcNukaCarouselStrings.auto
import typings.rmcNukaCarousel.rmcNukaCarouselStrings.center
import typings.rmcNukaCarousel.rmcNukaCarouselStrings.left
import typings.rmcNukaCarousel.rmcNukaCarouselStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICarouselProps extends js.Object {
  var afterSlide: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  var autoplay: js.UndefOr[Boolean] = js.native
  var autoplayInterval: js.UndefOr[Double] = js.native
  var beforeSlide: js.UndefOr[js.Function2[/* currentIndex */ Double, /* endIndex */ Double, Unit]] = js.native
  var cellAlign: js.UndefOr[left | center | right] = js.native
  var cellSpacing: js.UndefOr[Double] = js.native
  var className: js.UndefOr[String] = js.native
  var data: js.UndefOr[js.Function0[Unit]] = js.native
  var decorators: js.UndefOr[js.Array[_]] = js.native
  var dragging: js.UndefOr[Boolean] = js.native
  var easing: js.UndefOr[js.Function] = js.native
  var edgeEasing: js.UndefOr[js.Function] = js.native
  var frameOverflow: js.UndefOr[String] = js.native
  var framePadding: js.UndefOr[String] = js.native
  var initialSlideHeight: js.UndefOr[Double] = js.native
  var initialSlideWidth: js.UndefOr[Double] = js.native
  var resetAutoplay: js.UndefOr[Boolean] = js.native
  var slideIndex: js.UndefOr[Double] = js.native
  var slideWidth: js.UndefOr[String | Double] = js.native
  var slidesToScroll: js.UndefOr[Double | auto] = js.native
  var slidesToShow: js.UndefOr[Double] = js.native
  var speed: js.UndefOr[Double] = js.native
  var style: js.UndefOr[js.Any] = js.native
  var swipeSpeed: js.UndefOr[Double] = js.native
  var swiping: js.UndefOr[Boolean] = js.native
  var vertical: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[String] = js.native
  var wrapAround: js.UndefOr[Boolean] = js.native
}

object ICarouselProps {
  @scala.inline
  def apply(): ICarouselProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICarouselProps]
  }
  @scala.inline
  implicit class ICarouselPropsOps[Self <: ICarouselProps] (val x: Self) extends AnyVal {
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
    def setAfterSlide(value: /* index */ Double => Unit): Self = this.set("afterSlide", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterSlide: Self = this.set("afterSlide", js.undefined)
    @scala.inline
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    @scala.inline
    def setAutoplayInterval(value: Double): Self = this.set("autoplayInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoplayInterval: Self = this.set("autoplayInterval", js.undefined)
    @scala.inline
    def setBeforeSlide(value: (/* currentIndex */ Double, /* endIndex */ Double) => Unit): Self = this.set("beforeSlide", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeSlide: Self = this.set("beforeSlide", js.undefined)
    @scala.inline
    def setCellAlign(value: left | center | right): Self = this.set("cellAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellAlign: Self = this.set("cellAlign", js.undefined)
    @scala.inline
    def setCellSpacing(value: Double): Self = this.set("cellSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCellSpacing: Self = this.set("cellSpacing", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setData(value: () => Unit): Self = this.set("data", js.Any.fromFunction0(value))
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDecoratorsVarargs(value: js.Any*): Self = this.set("decorators", js.Array(value :_*))
    @scala.inline
    def setDecorators(value: js.Array[_]): Self = this.set("decorators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecorators: Self = this.set("decorators", js.undefined)
    @scala.inline
    def setDragging(value: Boolean): Self = this.set("dragging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragging: Self = this.set("dragging", js.undefined)
    @scala.inline
    def setEasing(value: js.Function): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    @scala.inline
    def setEdgeEasing(value: js.Function): Self = this.set("edgeEasing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgeEasing: Self = this.set("edgeEasing", js.undefined)
    @scala.inline
    def setFrameOverflow(value: String): Self = this.set("frameOverflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameOverflow: Self = this.set("frameOverflow", js.undefined)
    @scala.inline
    def setFramePadding(value: String): Self = this.set("framePadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFramePadding: Self = this.set("framePadding", js.undefined)
    @scala.inline
    def setInitialSlideHeight(value: Double): Self = this.set("initialSlideHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialSlideHeight: Self = this.set("initialSlideHeight", js.undefined)
    @scala.inline
    def setInitialSlideWidth(value: Double): Self = this.set("initialSlideWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialSlideWidth: Self = this.set("initialSlideWidth", js.undefined)
    @scala.inline
    def setResetAutoplay(value: Boolean): Self = this.set("resetAutoplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetAutoplay: Self = this.set("resetAutoplay", js.undefined)
    @scala.inline
    def setSlideIndex(value: Double): Self = this.set("slideIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideIndex: Self = this.set("slideIndex", js.undefined)
    @scala.inline
    def setSlideWidth(value: String | Double): Self = this.set("slideWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideWidth: Self = this.set("slideWidth", js.undefined)
    @scala.inline
    def setSlidesToScroll(value: Double | auto): Self = this.set("slidesToScroll", value.asInstanceOf[js.Any])
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
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSwipeSpeed(value: Double): Self = this.set("swipeSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeSpeed: Self = this.set("swipeSpeed", js.undefined)
    @scala.inline
    def setSwiping(value: Boolean): Self = this.set("swiping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwiping: Self = this.set("swiping", js.undefined)
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWrapAround(value: Boolean): Self = this.set("wrapAround", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapAround: Self = this.set("wrapAround", js.undefined)
  }
  
}

