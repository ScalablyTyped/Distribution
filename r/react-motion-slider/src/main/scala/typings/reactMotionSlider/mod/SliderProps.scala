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

trait SliderProps extends js.Object {
  /**
    * Prop callback fired after slide change.
    * @param currentIndex
    */
  var afterSlide: js.UndefOr[js.Function1[/* currentIndex */ Double, Unit]] = js.undefined
  /**
    * Offsets the slide to align either left, center, or right.
    * @default "left"
    */
  var align: js.UndefOr[left | center | right] = js.undefined
  /**
    * Animates the wrapper height to fit the current slide.
    * @default false
    */
  var autoHeight: js.UndefOr[Boolean] = js.undefined
  /**
    * Prop callback fired before slide change.
    * @param currentIndex
    * @param nextIndex
    */
  var beforeSlide: js.UndefOr[js.Function2[/* currentIndex */ Double, /* nextIndex */ Double, Unit]] = js.undefined
  /**
    * Move to a slide by its index.
    */
  var currentIndex: js.UndefOr[Double] = js.undefined
  /**
    * Move to a slide by its key.
    */
  var currentKey: js.UndefOr[String | Double] = js.undefined
  /**
    * The amount of time in milliseconds that determines if a swipe was a flick or not.
    */
  var flickTimeout: js.UndefOr[Double] = js.undefined
  /**
    * The amount of slides to move upon using prev and next methods.
    * @default 1
    */
  var slidesToMove: js.UndefOr[Double] = js.undefined
  /**
    * The amount of slides shown in view
    * @default 1
    */
  var slidesToShow: js.UndefOr[Double] = js.undefined
  /**
    * Accepts a React Motion spring config.
    */
  var springConfig: js.UndefOr[OpaqueConfig] = js.undefined
  /**
    * Enable touch and/or mouse dragging
    * @default true
    */
  var swipe: js.UndefOr[Boolean | touch | mouse] = js.undefined
  /**
    * The amount the user must swipe to advance slides. (sliderWidth * swipeThreshold)
    * @default 0.5
    */
  var swipeThreshold: js.UndefOr[Double] = js.undefined
}

object SliderProps {
  @scala.inline
  def apply(
    afterSlide: /* currentIndex */ Double => Unit = null,
    align: left | center | right = null,
    autoHeight: js.UndefOr[Boolean] = js.undefined,
    beforeSlide: (/* currentIndex */ Double, /* nextIndex */ Double) => Unit = null,
    currentIndex: js.UndefOr[Double] = js.undefined,
    currentKey: String | Double = null,
    flickTimeout: js.UndefOr[Double] = js.undefined,
    slidesToMove: js.UndefOr[Double] = js.undefined,
    slidesToShow: js.UndefOr[Double] = js.undefined,
    springConfig: OpaqueConfig = null,
    swipe: Boolean | touch | mouse = null,
    swipeThreshold: js.UndefOr[Double] = js.undefined
  ): SliderProps = {
    val __obj = js.Dynamic.literal()
    if (afterSlide != null) __obj.updateDynamic("afterSlide")(js.Any.fromFunction1(afterSlide))
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.get.asInstanceOf[js.Any])
    if (beforeSlide != null) __obj.updateDynamic("beforeSlide")(js.Any.fromFunction2(beforeSlide))
    if (!js.isUndefined(currentIndex)) __obj.updateDynamic("currentIndex")(currentIndex.get.asInstanceOf[js.Any])
    if (currentKey != null) __obj.updateDynamic("currentKey")(currentKey.asInstanceOf[js.Any])
    if (!js.isUndefined(flickTimeout)) __obj.updateDynamic("flickTimeout")(flickTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slidesToMove)) __obj.updateDynamic("slidesToMove")(slidesToMove.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slidesToShow)) __obj.updateDynamic("slidesToShow")(slidesToShow.get.asInstanceOf[js.Any])
    if (springConfig != null) __obj.updateDynamic("springConfig")(springConfig.asInstanceOf[js.Any])
    if (swipe != null) __obj.updateDynamic("swipe")(swipe.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeThreshold)) __obj.updateDynamic("swipeThreshold")(swipeThreshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderProps]
  }
}

