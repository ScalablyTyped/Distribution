package typings.qlikVisualizationextensions.ExtensionAPI

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.slider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomRangeSlider extends ICustomControl {
  var component: slider = js.native
  var defaultValue: js.Array[Double] = js.native
  var max: Double = js.native
  var min: Double = js.native
  var step: Double = js.native
}

object ICustomRangeSlider {
  @scala.inline
  def apply(
    component: slider,
    defaultValue: js.Array[Double],
    label: String,
    max: Double,
    min: Double,
    ref: String,
    step: Double,
    `type`: String
  ): ICustomRangeSlider = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomRangeSlider]
  }
  @scala.inline
  implicit class ICustomRangeSliderOps[Self <: ICustomRangeSlider] (val x: Self) extends AnyVal {
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
    def setComponent(value: slider): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValueVarargs(value: Double*): Self = this.set("defaultValue", js.Array(value :_*))
    @scala.inline
    def setDefaultValue(value: js.Array[Double]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
  }
  
}

