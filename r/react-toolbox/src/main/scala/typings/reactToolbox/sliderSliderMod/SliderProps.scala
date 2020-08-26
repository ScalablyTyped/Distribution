package typings.reactToolbox.sliderSliderMod

import typings.reactToolbox.mod.ReactToolbox.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliderProps extends Props {
  /**
    * Used to style the ProgressBar element
    */
  var buffer: js.UndefOr[Double] = js.native
  /**
    * If true, component will be disabled.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * If true, an input is shown and the user can set the slider from keyboard value.
    * @default false
    */
  var editable: js.UndefOr[Boolean] = js.native
  /**
    * Maximum value permitted.
    * @default 100
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * Minimum value permitted.
    * @default 0
    */
  var min: js.UndefOr[Double] = js.native
  /**
    * Callback function that will be invoked when the slider value changes.
    */
  var onChange: js.UndefOr[js.Function] = js.native
  /**
    * Callback function that will be invoked when the slider stops being dragged.
    */
  var onDragStop: js.UndefOr[js.Function] = js.native
  /**
    * If true, a pin with numeric value label is shown when the slider thumb is pressed. Use for settings for which users need to know the exact value of the setting.
    * @default false
    */
  var pinned: js.UndefOr[Boolean] = js.native
  /**
    * If true, the slider thumb snaps to tick marks evenly spaced based on the step property value.
    * @default false
    */
  var snaps: js.UndefOr[Boolean] = js.native
  /**
    * Amount to vary the value when the knob is moved or increase/decrease is called.
    * @default 0.01
    */
  var step: js.UndefOr[Double] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[SliderTheme] = js.native
  /**
    * Current value of the slider.
    * @default 0
    */
  var value: js.UndefOr[Double] = js.native
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
    def setBuffer(value: Double): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setOnChange(value: js.Function): Self = this.set("onChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnDragStop(value: js.Function): Self = this.set("onDragStop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDragStop: Self = this.set("onDragStop", js.undefined)
    @scala.inline
    def setPinned(value: Boolean): Self = this.set("pinned", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinned: Self = this.set("pinned", js.undefined)
    @scala.inline
    def setSnaps(value: Boolean): Self = this.set("snaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnaps: Self = this.set("snaps", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setTheme(value: SliderTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

