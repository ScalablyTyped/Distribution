package typings.qlikVisualizationextensions.ExtensionAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomNumber extends ICustomControl {
  var defaultValue: Double = js.native
  var max: Double = js.native
  var min: Double = js.native
}

object ICustomNumber {
  @scala.inline
  def apply(defaultValue: Double, label: String, max: Double, min: Double, ref: String, `type`: String): ICustomNumber = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomNumber]
  }
  @scala.inline
  implicit class ICustomNumberOps[Self <: ICustomNumber] (val x: Self) extends AnyVal {
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
    def setDefaultValue(value: Double): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
  }
  
}

