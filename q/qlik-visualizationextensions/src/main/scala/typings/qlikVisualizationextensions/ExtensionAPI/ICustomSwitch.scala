package typings.qlikVisualizationextensions.ExtensionAPI

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.switch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomSwitch extends js.Object {
  var component: switch = js.native
  var defaultValue: Boolean = js.native
  var options: valueOrfunc[ICustomControlOption] = js.native
}

object ICustomSwitch {
  @scala.inline
  def apply(component: switch, defaultValue: Boolean, options: valueOrfunc[ICustomControlOption]): ICustomSwitch = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomSwitch]
  }
  @scala.inline
  implicit class ICustomSwitchOps[Self <: ICustomSwitch] (val x: Self) extends AnyVal {
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
    def setComponent(value: switch): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValue(value: Boolean): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionsFunction0(value: () => ICustomControlOption): Self = this.set("options", js.Any.fromFunction0(value))
    @scala.inline
    def setOptions(value: valueOrfunc[ICustomControlOption]): Self = this.set("options", value.asInstanceOf[js.Any])
  }
  
}

