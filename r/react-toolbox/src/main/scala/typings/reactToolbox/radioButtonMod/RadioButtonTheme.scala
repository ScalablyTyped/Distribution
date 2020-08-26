package typings.reactToolbox.radioButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadioButtonTheme extends js.Object {
  /**
    * Added to the root of the Radio in case it's disabled.
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
    * Used to style the text label element.
    */
  var text: js.UndefOr[String] = js.native
}

object RadioButtonTheme {
  @scala.inline
  def apply(): RadioButtonTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadioButtonTheme]
  }
  @scala.inline
  implicit class RadioButtonThemeOps[Self <: RadioButtonTheme] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

