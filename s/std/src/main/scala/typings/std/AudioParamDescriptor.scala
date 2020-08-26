package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioParamDescriptor extends js.Object {
  var automationRate: js.UndefOr[AutomationRate] = js.native
  var defaultValue: js.UndefOr[Double] = js.native
  var maxValue: js.UndefOr[Double] = js.native
  var minValue: js.UndefOr[Double] = js.native
  var name: java.lang.String = js.native
}

object AudioParamDescriptor {
  @scala.inline
  def apply(name: java.lang.String): AudioParamDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioParamDescriptor]
  }
  @scala.inline
  implicit class AudioParamDescriptorOps[Self <: AudioParamDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: java.lang.String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutomationRate(value: AutomationRate): Self = this.set("automationRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomationRate: Self = this.set("automationRate", js.undefined)
    @scala.inline
    def setDefaultValue(value: Double): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
  }
  
}

