package typings.qlikVisualizationextensions.ExtensionAPI

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.radiobuttons
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomRadioButton extends ICustomControl {
  var component: radiobuttons = js.native
  var defaultValue: String = js.native
  var options: valueOrfunc[ICustomControlOption] = js.native
}

object ICustomRadioButton {
  @scala.inline
  def apply(
    component: radiobuttons,
    defaultValue: String,
    label: String,
    options: valueOrfunc[ICustomControlOption],
    ref: String,
    `type`: String
  ): ICustomRadioButton = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomRadioButton]
  }
  @scala.inline
  implicit class ICustomRadioButtonOps[Self <: ICustomRadioButton] (val x: Self) extends AnyVal {
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
    def setComponent(value: radiobuttons): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionsFunction0(value: () => ICustomControlOption): Self = this.set("options", js.Any.fromFunction0(value))
    @scala.inline
    def setOptions(value: valueOrfunc[ICustomControlOption]): Self = this.set("options", value.asInstanceOf[js.Any])
  }
  
}

