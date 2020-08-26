package typings.qlikVisualizationextensions.ExtensionAPI

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.checkbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomCheckBox extends ICustomControl {
  var component: checkbox = js.native
  var defaultValue: Boolean = js.native
}

object ICustomCheckBox {
  @scala.inline
  def apply(component: checkbox, defaultValue: Boolean, label: String, ref: String, `type`: String): ICustomCheckBox = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomCheckBox]
  }
  @scala.inline
  implicit class ICustomCheckBoxOps[Self <: ICustomCheckBox] (val x: Self) extends AnyVal {
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
    def setComponent(value: checkbox): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValue(value: Boolean): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
  }
  
}

