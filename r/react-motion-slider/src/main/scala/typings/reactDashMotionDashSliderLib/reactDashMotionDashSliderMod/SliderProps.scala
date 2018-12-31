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

