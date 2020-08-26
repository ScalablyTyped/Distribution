package typings.qlik.mod

import typings.qlik.qlikStrings.dropdown
import typings.qlik.qlikStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomPropertyDropdown
  extends CustomPropertyCommon
     with CustomProperty {
  var component: dropdown = js.native
  var defaultValue: js.UndefOr[String] = js.native
  var options: js.UndefOr[CustomPropertyOptions] = js.native
  @JSName("ref")
  var ref_CustomPropertyDropdown: String = js.native
  @JSName("type")
  var type_CustomPropertyDropdown: string = js.native
}

object CustomPropertyDropdown {
  @scala.inline
  def apply(component: dropdown, ref: String, `type`: string): CustomPropertyDropdown = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyDropdown]
  }
  @scala.inline
  implicit class CustomPropertyDropdownOps[Self <: CustomPropertyDropdown] (val x: Self) extends AnyVal {
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
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: string): Self = this.set("type", value.asInstanceOf[js.Any])
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

