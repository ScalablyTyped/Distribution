package typings.qlikVisualizationextensions.ExtensionAPI

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.dropdown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomDropDownList extends ICustomControl {
  var component: dropdown = js.native
  var defaultValue: String = js.native
  var options: valueOrfunc[ICustomControlOption] = js.native
}

object ICustomDropDownList {
  @scala.inline
  def apply(
    component: dropdown,
    defaultValue: String,
    label: String,
    options: valueOrfunc[ICustomControlOption],
    ref: String,
    `type`: String
  ): ICustomDropDownList = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomDropDownList]
  }
  @scala.inline
  implicit class ICustomDropDownListOps[Self <: ICustomDropDownList] (val x: Self) extends AnyVal {
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
    def setComponent(value: dropdown): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionsFunction0(value: () => ICustomControlOption): Self = this.set("options", js.Any.fromFunction0(value))
    @scala.inline
    def setOptions(value: valueOrfunc[ICustomControlOption]): Self = this.set("options", value.asInstanceOf[js.Any])
  }
  
}

