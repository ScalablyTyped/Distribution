package typings.qlik.mod

import typings.qlik.qlikStrings.boolean
import typings.qlik.qlikStrings.switch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomPropertySwitch
  extends CustomPropertyCommon
     with CustomProperty {
  var component: switch = js.native
  var defaultValue: js.UndefOr[String] = js.native
  var options: js.UndefOr[CustomPropertyOptions] = js.native
  @JSName("type")
  var type_CustomPropertySwitch: boolean = js.native
}

object CustomPropertySwitch {
  @scala.inline
  def apply(component: switch, `type`: boolean): CustomPropertySwitch = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertySwitch]
  }
  @scala.inline
  implicit class CustomPropertySwitchOps[Self <: CustomPropertySwitch] (val x: Self) extends AnyVal {
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
    def setType(value: boolean): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setOptionsVarargs(value: CustomPropertyOption*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptionsFunction0(value: () => js.Array[CustomPropertyOption]): Self = this.set("options", js.Any.fromFunction0(value))
    @scala.inline
    def setOptions(value: CustomPropertyOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

