package typings.qlik.mod

import typings.qlik.qlikStrings.number
import typings.qlik.qlikStrings.slider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomPropertySlider
  extends CustomPropertyCommon
     with CustomProperty {
  var component: slider = js.native
  var defaultValue: js.UndefOr[Double] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var step: js.UndefOr[Double] = js.native
  @JSName("type")
  var type_CustomPropertySlider: number = js.native
}

object CustomPropertySlider {
  @scala.inline
  def apply(component: slider, `type`: number): CustomPropertySlider = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertySlider]
  }
  @scala.inline
  implicit class CustomPropertySliderOps[Self <: CustomPropertySlider] (val x: Self) extends AnyVal {
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
    def setType(value: number): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValue(value: Double): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
  
}

