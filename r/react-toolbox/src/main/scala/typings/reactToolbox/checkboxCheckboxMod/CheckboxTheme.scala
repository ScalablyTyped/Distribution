package typings.reactToolbox.checkboxCheckboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxTheme extends js.Object {
  /**
    * Used as root in the check element.
    */
  var check: js.UndefOr[String] = js.native
  /**
    * Used for the check element when it's checked.
    */
  var checked: js.UndefOr[String] = js.native
  /**
    * Used when the component is disabled.
    */
  var disabled: js.UndefOr[String] = js.native
  /**
    * Used as the root class of the component.
    */
  var field: js.UndefOr[String] = js.native
  /**
    * Used for the input element.
    */
  var input: js.UndefOr[String] = js.native
  /**
    * Used for the ripple component.
    */
  var ripple: js.UndefOr[String] = js.native
  /**
    * Used for the text label.
    */
  var text: js.UndefOr[String] = js.native
}

object CheckboxTheme {
  @scala.inline
  def apply(): CheckboxTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboxTheme]
  }
  @scala.inline
  implicit class CheckboxThemeOps[Self <: CheckboxTheme] (val x: Self) extends AnyVal {
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
    def setCheck(value: String): Self = this.set("check", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheck: Self = this.set("check", js.undefined)
    @scala.inline
    def setChecked(value: String): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setRipple(value: String): Self = this.set("ripple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRipple: Self = this.set("ripple", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

