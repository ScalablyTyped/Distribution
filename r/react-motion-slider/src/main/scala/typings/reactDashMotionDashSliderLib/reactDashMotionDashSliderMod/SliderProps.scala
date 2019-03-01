package typings
package reactDashMotionDashSliderLib.reactDashMotionDashSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderProps extends js.Object {
  /**
    * Prop callback fired after slide change.
    * @param currentIndex
    */
  var afterSlide: js.UndefOr[js.Function1[/* currentIndex */ scala.Double, scala.Unit]] = js.undefined
  /**
    * Offsets the slide to align either left, center, or right.
    * @default "left"
    */
  var align: js.UndefOr[
    reactDashMotionDashSliderLib.reactDashMotionDashSliderLibStrings.left | reactDashMotionDashSliderLib.reactDashMotionDashSliderLibStrings.center | reactDashMotionDashSliderLib.reactDashMotionDashSliderLibStrings.right
  ] = js.undefined
  /**
    * Animates the wrapper height to fit the current slide.
    * @default false
    */
  var autoHeight: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Prop callback fired before slide change.
    * @param currentIndex
    * @param nextIndex
    */
  var beforeSlide: js.UndefOr[
    js.Function2[/* currentIndex */ scala.Double, /* nextIndex */ scala.Double, scala.Unit]
  ] = js.undefined
  /**
    * Move to a slide by its index.
    */
  var currentIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * Move to a slide by its key.
    */
  var currentKey: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * The amount of time in milliseconds that determines if a swipe was a flick or not.
    */
  var flickTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * The amount of slides to move upon using prev and next methods.
    * @default 1
    */
  var slidesToMove: js.UndefOr[scala.Double] = js.undefined
  /**
    * The amount of slides shown in view
    * @default 1
    */
  var slidesToShow: js.UndefOr[scala.Double] = js.undefined
  /**
    * Accepts a React Motion spring config.
    */
  var springConfig: js.UndefOr[reactDashMotionLib.reactDashMotionMod.OpaqueConfig] = js.undefined
  /**
    * Enable touch and/or mouse dragging
    * @default true
    */
  var swipe: js.UndefOr[
    scala.Boolean | reactDashMotionDashSliderLib.reactDashMotionDashSliderLibStrings.touch | reactDashMotionDashSliderLib.reactDashMotionDashSliderLibStrings.mouse
  ] = js.undefined
  /**
    * The amount the user must swipe to advance slides. (sliderWidth * swipeThreshold)
    * @default 0.5
    */
  var swipeThreshold: js.UndefOr[scala.Double] = js.undefined
}

object SliderProps {
  @scala.inline
  def apply(
    afterSlide: js.Function1[/* currentIndex */ scala.Double, scala.Unit] = null,
    align: reactDashMotionDashSliderLib.reactDashMotionDashSliderLibStrings.left | reactDashMotionDashSliderLib.reactDashMotionDashSliderLibStrings.center | reactDashMotionDashSliderLib.reactDashMotionDashSliderLibStrings.right = null,
    autoHeight: js.UndefOr[scala.Boolean] = js.undefined,
    beforeSlide: js.Function2[/* currentIndex */ scala.Double, /* nextIndex */ scala.Double, scala.Unit] = null,
    currentIndex: scala.Int | scala.Double = null,
    currentKey: java.lang.String | scala.Double = null,
    flickTimeout: scala.Int | scala.Double = null,
    slidesToMove: scala.Int | scala.Double = null,
    slidesToShow: scala.Int | scala.Double = null,
    springConfig: reactDashMotionLib.reactDashMotionMod.OpaqueConfig = null,
    swipe: scala.Boolean | reactDashMotionDashSliderLib.reactDashMotionDashSliderLibStrings.touch | reactDashMotionDashSliderLib.reactDashMotionDashSliderLibStrings.mouse = null,
    swipeThreshold: scala.Int | scala.Double = null
  ): SliderProps = {
    val __obj = js.Dynamic.literal()
    if (afterSlide != null) __obj.updateDynamic("afterSlide")(afterSlide)
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight)
    if (beforeSlide != null) __obj.updateDynamic("beforeSlide")(beforeSlide)
    if (currentIndex != null) __obj.updateDynamic("currentIndex")(currentIndex.asInstanceOf[js.Any])
    if (currentKey != null) __obj.updateDynamic("currentKey")(currentKey.asInstanceOf[js.Any])
    if (flickTimeout != null) __obj.updateDynamic("flickTimeout")(flickTimeout.asInstanceOf[js.Any])
    if (slidesToMove != null) __obj.updateDynamic("slidesToMove")(slidesToMove.asInstanceOf[js.Any])
    if (slidesToShow != null) __obj.updateDynamic("slidesToShow")(slidesToShow.asInstanceOf[js.Any])
    if (springConfig != null) __obj.updateDynamic("springConfig")(springConfig)
    if (swipe != null) __obj.updateDynamic("swipe")(swipe.asInstanceOf[js.Any])
    if (swipeThreshold != null) __obj.updateDynamic("swipeThreshold")(swipeThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderProps]
  }
}

