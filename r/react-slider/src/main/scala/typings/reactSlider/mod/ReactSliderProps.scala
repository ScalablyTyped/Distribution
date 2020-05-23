package typings.reactSlider.mod

import typings.react.mod.global.JSX.Element
import typings.reactSlider.anon.Index
import typings.reactSlider.anon.Value
import typings.reactSlider.reactSliderStrings.horizontal
import typings.reactSlider.reactSliderStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactSliderProps extends js.Object {
  /**
    * aria-label for screen-readers to apply to the thumbs.
    * Use an array for more than one thumb.
    * The length of the array must match the number of thumbs in the value array.
    */
  var ariaLabel: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * aria-valuetext for screen-readers.
    * Can be a static string, or a function that returns a string.
    */
  var ariaValuetext: js.UndefOr[String | (js.Function1[/* value */ Index, String])] = js.undefined
  /**
    * The css class set on the slider node.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Determines the initial positions of the thumbs and the number of thumbs.
    *
    * If a number is passed a slider with one thumb will be rendered.
    * If an array is passed each value will determine the position of one thumb.
    * The values in the array must be sorted.
    */
  var defaultValue: js.UndefOr[Double | js.Array[Double]] = js.undefined
  /**
    * If `true` the thumbs can't be moved.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Inverts the slider.
    */
  var invert: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum value of the slider.
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * The minimum value of the slider.
    */
  var min: js.UndefOr[Double] = js.undefined
  /**
    * The minimal distance between any pair of thumbs.
    * Must be positive, but zero means they can sit on top of each other.
    */
  var minDistance: js.UndefOr[Double] = js.undefined
  /**
    * Callback called only after moving a thumb has ended.
    */
  var onAfterChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double | js.Array[Double] | Null], Unit]] = js.undefined
  /**
    * Callback called before starting to move a thumb.
    */
  var onBeforeChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double | js.Array[Double] | Null], Unit]] = js.undefined
  /**
    * Callback called on every value change.
    */
  var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double | js.Array[Double] | Null], Unit]] = js.undefined
  /**
    * Callback called when the the slider is clicked (thumb or tracks).
    * Receives the value at the clicked position as argument.
    */
  var onSliderClick: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  /**
    * Determines whether the slider moves horizontally (from left to right)
    * or vertically (from top to bottom).
    */
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  /**
    * The result of the function is the value to be added or subtracted
    * when the `Page Up` or `Page Down` keys are pressed.
    *
    * The current `step` value will be passed as the only argument.
    * By default, paging will modify `step` by a factor of 10.
    */
  var pageFn: js.UndefOr[js.Function1[/* step */ Double, Double]] = js.undefined
  /**
    * If `true` the active thumb will push other thumbs
    * within the constraints of `min`, `max`, `step` and `minDistance`.
    */
  var pearling: js.UndefOr[Boolean] = js.undefined
  /**
    * Provide a custom render function for dynamic thumb content.
    * The render function will be passed two arguments.The first is
    * an object that should be added to your thumb node,
    */
  var renderThumb: js.UndefOr[js.Function2[/* props */ js.Object, /* state */ Index, Element]] = js.undefined
  /**
    * Provide a custom render function for the track node.
    * The render function will be passed two arguments. The first is
    * an object that should be added to your handle node.
    */
  var renderTrack: js.UndefOr[js.Function2[/* props */ js.Object, /* state */ Value, Element]] = js.undefined
  /**
    * Disables thumb move when clicking the slider track
    */
  var snapDragDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Value to be added or subtracted on each step the slider makes.
    * Must be greater than zero.
    * `max - min` should be evenly divisible by the step value.
    */
  var step: js.UndefOr[Double] = js.undefined
  /**
    * The css class set on the thumb that is currently being moved.
    */
  var thumbActiveClassName: js.UndefOr[String] = js.undefined
  /**
    * The css class set on each thumb node.
    *
    * In addition each thumb will receive a numbered css class of the form
    * `${thumbClassName}-${i}`, e.g. `thumb-0`, `thumb-1`, ...
    */
  var thumbClassName: js.UndefOr[String] = js.undefined
  /**
    * The css class set on the tracks between the thumbs.
    * In addition track fragment will receive a numbered css class of the form
    * `${trackClassName}-${i}`, e.g. `track-0`, `track-1`, ...
    */
  var trackClassName: js.UndefOr[String] = js.undefined
  /**
    * Like `defaultValue` but for
    * [controlled components](http://facebook.github.io/react/docs/forms.html#controlled-components).
    */
  var value: js.UndefOr[Double | js.Array[Double]] = js.undefined
  /**
    * If `true` tracks between the thumbs will be rendered.
    */
  var withTracks: js.UndefOr[Boolean] = js.undefined
}

object ReactSliderProps {
  @scala.inline
  def apply(
    ariaLabel: String | js.Array[String] = null,
    ariaValuetext: String | (js.Function1[/* value */ Index, String]) = null,
    className: String = null,
    defaultValue: Double | js.Array[Double] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    invert: js.UndefOr[Boolean] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    minDistance: js.UndefOr[Double] = js.undefined,
    onAfterChange: /* value */ js.UndefOr[Double | js.Array[Double] | Null] => Unit = null,
    onBeforeChange: /* value */ js.UndefOr[Double | js.Array[Double] | Null] => Unit = null,
    onChange: /* value */ js.UndefOr[Double | js.Array[Double] | Null] => Unit = null,
    onSliderClick: /* value */ Double => Unit = null,
    orientation: horizontal | vertical = null,
    pageFn: /* step */ Double => Double = null,
    pearling: js.UndefOr[Boolean] = js.undefined,
    renderThumb: (/* props */ js.Object, /* state */ Index) => Element = null,
    renderTrack: (/* props */ js.Object, /* state */ Value) => Element = null,
    snapDragDisabled: js.UndefOr[Boolean] = js.undefined,
    step: js.UndefOr[Double] = js.undefined,
    thumbActiveClassName: String = null,
    thumbClassName: String = null,
    trackClassName: String = null,
    value: Double | js.Array[Double] = null,
    withTracks: js.UndefOr[Boolean] = js.undefined
  ): ReactSliderProps = {
    val __obj = js.Dynamic.literal()
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaValuetext != null) __obj.updateDynamic("ariaValuetext")(ariaValuetext.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(invert)) __obj.updateDynamic("invert")(invert.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minDistance)) __obj.updateDynamic("minDistance")(minDistance.get.asInstanceOf[js.Any])
    if (onAfterChange != null) __obj.updateDynamic("onAfterChange")(js.Any.fromFunction1(onAfterChange))
    if (onBeforeChange != null) __obj.updateDynamic("onBeforeChange")(js.Any.fromFunction1(onBeforeChange))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onSliderClick != null) __obj.updateDynamic("onSliderClick")(js.Any.fromFunction1(onSliderClick))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (pageFn != null) __obj.updateDynamic("pageFn")(js.Any.fromFunction1(pageFn))
    if (!js.isUndefined(pearling)) __obj.updateDynamic("pearling")(pearling.get.asInstanceOf[js.Any])
    if (renderThumb != null) __obj.updateDynamic("renderThumb")(js.Any.fromFunction2(renderThumb))
    if (renderTrack != null) __obj.updateDynamic("renderTrack")(js.Any.fromFunction2(renderTrack))
    if (!js.isUndefined(snapDragDisabled)) __obj.updateDynamic("snapDragDisabled")(snapDragDisabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (thumbActiveClassName != null) __obj.updateDynamic("thumbActiveClassName")(thumbActiveClassName.asInstanceOf[js.Any])
    if (thumbClassName != null) __obj.updateDynamic("thumbClassName")(thumbClassName.asInstanceOf[js.Any])
    if (trackClassName != null) __obj.updateDynamic("trackClassName")(trackClassName.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(withTracks)) __obj.updateDynamic("withTracks")(withTracks.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactSliderProps]
  }
}

