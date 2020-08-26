package typings.reactMotionSlider.mod

import typings.reactMotion.mod.OpaqueConfig
import typings.reactMotionSlider.reactMotionSliderStrings.center
import typings.reactMotionSlider.reactMotionSliderStrings.left
import typings.reactMotionSlider.reactMotionSliderStrings.mouse
import typings.reactMotionSlider.reactMotionSliderStrings.right
import typings.reactMotionSlider.reactMotionSliderStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderProps extends js.Object {
  /**
    * Prop callback fired after slide change.
    * @param currentIndex
    */
  var afterSlide: js.UndefOr[js.Function1[/* currentIndex */ Double, Unit]] = js.native
  /**
    * Offsets the slide to align either left, center, or right.
    * @default "left"
    */
  var align: js.UndefOr[left | center | right] = js.native
  /**
    * Animates the wrapper height to fit the current slide.
    * @default false
    */
  var autoHeight: js.UndefOr[Boolean] = js.native
  /**
    * Prop callback fired before slide change.
    * @param currentIndex
    * @param nextIndex
    */
  var beforeSlide: js.UndefOr[js.Function2[/* currentIndex */ Double, /* nextIndex */ Double, Unit]] = js.native
  /**
    * Move to a slide by its index.
    */
  var currentIndex: js.UndefOr[Double] = js.native
  /**
    * Move to a slide by its key.
    */
  var currentKey: js.UndefOr[String | Double] = js.native
  /**
    * The amount of time in milliseconds that determines if a swipe was a flick or not.
    */
  var flickTimeout: js.UndefOr[Double] = js.native
  /**
    * The amount of slides to move upon using prev and next methods.
    * @default 1
    */
  var slidesToMove: js.UndefOr[Double] = js.native
  /**
    * The amount of slides shown in view
    * @default 1
    */
  var slidesToShow: js.UndefOr[Double] = js.native
  /**
    * Accepts a React Motion spring config.
    */
  var springConfig: js.UndefOr[OpaqueConfig] = js.native
  /**
    * Enable touch and/or mouse dragging
    * @default true
    */
  var swipe: js.UndefOr[Boolean | touch | mouse] = js.native
  /**
    * The amount the user must swipe to advance slides. (sliderWidth * swipeThreshold)
    * @default 0.5
    */
  var swipeThreshold: js.UndefOr[Double] = js.native
}

object SliderProps {
  @scala.inline
  def apply(): SliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderProps]
  }
  @scala.inline
  implicit class SliderPropsOps[Self <: SliderProps] (val x: Self) extends AnyVal {
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
    def setAfterSlide(value: /* currentIndex */ Double => Unit): Self = this.set("afterSlide", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterSlide: Self = this.set("afterSlide", js.undefined)
    @scala.inline
    def setAlign(value: left | center | right): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setAutoHeight(value: Boolean): Self = this.set("autoHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoHeight: Self = this.set("autoHeight", js.undefined)
    @scala.inline
    def setBeforeSlide(value: (/* currentIndex */ Double, /* nextIndex */ Double) => Unit): Self = this.set("beforeSlide", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeSlide: Self = this.set("beforeSlide", js.undefined)
    @scala.inline
    def setCurrentIndex(value: Double): Self = this.set("currentIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentIndex: Self = this.set("currentIndex", js.undefined)
    @scala.inline
    def setCurrentKey(value: String | Double): Self = this.set("currentKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentKey: Self = this.set("currentKey", js.undefined)
    @scala.inline
    def setFlickTimeout(value: Double): Self = this.set("flickTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlickTimeout: Self = this.set("flickTimeout", js.undefined)
    @scala.inline
    def setSlidesToMove(value: Double): Self = this.set("slidesToMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlidesToMove: Self = this.set("slidesToMove", js.undefined)
    @scala.inline
    def setSlidesToShow(value: Double): Self = this.set("slidesToShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlidesToShow: Self = this.set("slidesToShow", js.undefined)
    @scala.inline
    def setSpringConfig(value: OpaqueConfig): Self = this.set("springConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpringConfig: Self = this.set("springConfig", js.undefined)
    @scala.inline
    def setSwipe(value: Boolean | touch | mouse): Self = this.set("swipe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipe: Self = this.set("swipe", js.undefined)
    @scala.inline
    def setSwipeThreshold(value: Double): Self = this.set("swipeThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeThreshold: Self = this.set("swipeThreshold", js.undefined)
  }
  
}

