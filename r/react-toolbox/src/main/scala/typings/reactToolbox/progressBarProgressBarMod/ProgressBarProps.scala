package typings.reactToolbox.progressBarProgressBarMod

import typings.reactToolbox.mod.ReactToolbox.Props
import typings.reactToolbox.reactToolboxStrings.circular
import typings.reactToolbox.reactToolboxStrings.determinate
import typings.reactToolbox.reactToolboxStrings.indeterminate
import typings.reactToolbox.reactToolboxStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressBarProps extends Props {
  /**
    * Value of a secondary progress bar useful for buffering.
    * @default 0
    */
  var buffer: js.UndefOr[Double] = js.native
  /**
    * If true, component will be disabled.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
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
    * Mode of the progress bar, it can be determinate or indeterminate.
    * @default indeterminate
    */
  var mode: js.UndefOr[determinate | indeterminate] = js.native
  /**
    * If true, the circular progress bar will be changing its color.
    * @default false
    */
  var multicolor: js.UndefOr[Boolean] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[ProgressBarTheme] = js.native
  /**
    * Type of the progress bar, it can be circular or linear.
    * @default linear
    */
  var `type`: js.UndefOr[linear | circular] = js.native
  /**
    * Value of the current progress.
    * @default 0
    */
  var value: js.UndefOr[Double] = js.native
}

object ProgressBarProps {
  @scala.inline
  def apply(): ProgressBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressBarProps]
  }
  @scala.inline
  implicit class ProgressBarPropsOps[Self <: ProgressBarProps] (val x: Self) extends AnyVal {
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
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMode(value: determinate | indeterminate): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setMulticolor(value: Boolean): Self = this.set("multicolor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMulticolor: Self = this.set("multicolor", js.undefined)
    @scala.inline
    def setTheme(value: ProgressBarTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setType(value: linear | circular): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

