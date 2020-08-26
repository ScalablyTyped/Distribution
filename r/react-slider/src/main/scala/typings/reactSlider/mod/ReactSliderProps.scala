package typings.reactSlider.mod

import typings.react.mod.global.JSX.Element
import typings.reactSlider.anon.Index
import typings.reactSlider.anon.Value
import typings.reactSlider.reactSliderStrings.horizontal
import typings.reactSlider.reactSliderStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactSliderProps extends js.Object {
  /**
    * aria-label for screen-readers to apply to the thumbs.
    * Use an array for more than one thumb.
    * The length of the array must match the number of thumbs in the value array.
    */
  var ariaLabel: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * aria-valuetext for screen-readers.
    * Can be a static string, or a function that returns a string.
    */
  var ariaValuetext: js.UndefOr[String | (js.Function1[/* value */ Index, String])] = js.native
  /**
    * The css class set on the slider node.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Determines the initial positions of the thumbs and the number of thumbs.
    *
    * If a number is passed a slider with one thumb will be rendered.
    * If an array is passed each value will determine the position of one thumb.
    * The values in the array must be sorted.
    */
  var defaultValue: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
    * If `true` the thumbs can't be moved.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Inverts the slider.
    */
  var invert: js.UndefOr[Boolean] = js.native
  /**
    * The maximum value of the slider.
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * The minimum value of the slider.
    */
  var min: js.UndefOr[Double] = js.native
  /**
    * The minimal distance between any pair of thumbs.
    * Must be positive, but zero means they can sit on top of each other.
    */
  var minDistance: js.UndefOr[Double] = js.native
  /**
    * Callback called only after moving a thumb has ended.
    */
  var onAfterChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double | js.Array[Double] | Null], Unit]] = js.native
  /**
    * Callback called before starting to move a thumb.
    */
  var onBeforeChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double | js.Array[Double] | Null], Unit]] = js.native
  /**
    * Callback called on every value change.
    */
  var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double | js.Array[Double] | Null], Unit]] = js.native
  /**
    * Callback called when the the slider is clicked (thumb or tracks).
    * Receives the value at the clicked position as argument.
    */
  var onSliderClick: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  /**
    * Determines whether the slider moves horizontally (from left to right)
    * or vertically (from top to bottom).
    */
  var orientation: js.UndefOr[horizontal | vertical] = js.native
  /**
    * The result of the function is the value to be added or subtracted
    * when the `Page Up` or `Page Down` keys are pressed.
    *
    * The current `step` value will be passed as the only argument.
    * By default, paging will modify `step` by a factor of 10.
    */
  var pageFn: js.UndefOr[js.Function1[/* step */ Double, Double]] = js.native
  /**
    * If `true` the active thumb will push other thumbs
    * within the constraints of `min`, `max`, `step` and `minDistance`.
    */
  var pearling: js.UndefOr[Boolean] = js.native
  /**
    * Provide a custom render function for dynamic thumb content.
    * The render function will be passed two arguments.The first is
    * an object that should be added to your thumb node,
    */
  var renderThumb: js.UndefOr[js.Function2[/* props */ js.Object, /* state */ Index, Element]] = js.native
  /**
    * Provide a custom render function for the track node.
    * The render function will be passed two arguments. The first is
    * an object that should be added to your handle node.
    */
  var renderTrack: js.UndefOr[js.Function2[/* props */ js.Object, /* state */ Value, Element]] = js.native
  /**
    * Disables thumb move when clicking the slider track
    */
  var snapDragDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Value to be added or subtracted on each step the slider makes.
    * Must be greater than zero.
    * `max - min` should be evenly divisible by the step value.
    */
  var step: js.UndefOr[Double] = js.native
  /**
    * The css class set on the thumb that is currently being moved.
    */
  var thumbActiveClassName: js.UndefOr[String] = js.native
  /**
    * The css class set on each thumb node.
    *
    * In addition each thumb will receive a numbered css class of the form
    * `${thumbClassName}-${i}`, e.g. `thumb-0`, `thumb-1`, ...
    */
  var thumbClassName: js.UndefOr[String] = js.native
  /**
    * The css class set on the tracks between the thumbs.
    * In addition track fragment will receive a numbered css class of the form
    * `${trackClassName}-${i}`, e.g. `track-0`, `track-1`, ...
    */
  var trackClassName: js.UndefOr[String] = js.native
  /**
    * Like `defaultValue` but for
    * [controlled components](http://facebook.github.io/react/docs/forms.html#controlled-components).
    */
  var value: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
    * If `true` tracks between the thumbs will be rendered.
    */
  var withTracks: js.UndefOr[Boolean] = js.native
}

object ReactSliderProps {
  @scala.inline
  def apply(): ReactSliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactSliderProps]
  }
  @scala.inline
  implicit class ReactSliderPropsOps[Self <: ReactSliderProps] (val x: Self) extends AnyVal {
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
    def setAriaLabelVarargs(value: String*): Self = this.set("ariaLabel", js.Array(value :_*))
    @scala.inline
    def setAriaLabel(value: String | js.Array[String]): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    @scala.inline
    def setAriaValuetextFunction1(value: /* value */ Index => String): Self = this.set("ariaValuetext", js.Any.fromFunction1(value))
    @scala.inline
    def setAriaValuetext(value: String | (js.Function1[/* value */ Index, String])): Self = this.set("ariaValuetext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaValuetext: Self = this.set("ariaValuetext", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDefaultValueVarargs(value: Double*): Self = this.set("defaultValue", js.Array(value :_*))
    @scala.inline
    def setDefaultValue(value: Double | js.Array[Double]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setInvert(value: Boolean): Self = this.set("invert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvert: Self = this.set("invert", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMinDistance(value: Double): Self = this.set("minDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDistance: Self = this.set("minDistance", js.undefined)
    @scala.inline
    def setOnAfterChange(value: /* value */ js.UndefOr[Double | js.Array[Double] | Null] => Unit): Self = this.set("onAfterChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAfterChange: Self = this.set("onAfterChange", js.undefined)
    @scala.inline
    def setOnBeforeChange(value: /* value */ js.UndefOr[Double | js.Array[Double] | Null] => Unit): Self = this.set("onBeforeChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforeChange: Self = this.set("onBeforeChange", js.undefined)
    @scala.inline
    def setOnChange(value: /* value */ js.UndefOr[Double | js.Array[Double] | Null] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnSliderClick(value: /* value */ Double => Unit): Self = this.set("onSliderClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSliderClick: Self = this.set("onSliderClick", js.undefined)
    @scala.inline
    def setOrientation(value: horizontal | vertical): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setPageFn(value: /* step */ Double => Double): Self = this.set("pageFn", js.Any.fromFunction1(value))
    @scala.inline
    def deletePageFn: Self = this.set("pageFn", js.undefined)
    @scala.inline
    def setPearling(value: Boolean): Self = this.set("pearling", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePearling: Self = this.set("pearling", js.undefined)
    @scala.inline
    def setRenderThumb(value: (/* props */ js.Object, /* state */ Index) => Element): Self = this.set("renderThumb", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRenderThumb: Self = this.set("renderThumb", js.undefined)
    @scala.inline
    def setRenderTrack(value: (/* props */ js.Object, /* state */ Value) => Element): Self = this.set("renderTrack", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRenderTrack: Self = this.set("renderTrack", js.undefined)
    @scala.inline
    def setSnapDragDisabled(value: Boolean): Self = this.set("snapDragDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapDragDisabled: Self = this.set("snapDragDisabled", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setThumbActiveClassName(value: String): Self = this.set("thumbActiveClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbActiveClassName: Self = this.set("thumbActiveClassName", js.undefined)
    @scala.inline
    def setThumbClassName(value: String): Self = this.set("thumbClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbClassName: Self = this.set("thumbClassName", js.undefined)
    @scala.inline
    def setTrackClassName(value: String): Self = this.set("trackClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackClassName: Self = this.set("trackClassName", js.undefined)
    @scala.inline
    def setValueVarargs(value: Double*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: Double | js.Array[Double]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    @scala.inline
    def setWithTracks(value: Boolean): Self = this.set("withTracks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithTracks: Self = this.set("withTracks", js.undefined)
  }
  
}

