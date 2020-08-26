package typings.reactToolbox.switchSwitchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwitchTheme extends js.Object {
  /**
    * Used for the root element if the component is disabled.
    */
  var disabled: js.UndefOr[String] = js.native
  /**
    * Used for the root element if the component is not disabled.
    */
  var field: js.UndefOr[String] = js.native
  /**
    * Used for the input element.
    */
  var input: js.UndefOr[String] = js.native
  /**
    * Used for a wrapper around the thumb if checked is false.
    */
  var off: js.UndefOr[String] = js.native
  /**
    * Used for a wrapper around the thumb if checked is true.
    */
  var on: js.UndefOr[String] = js.native
  /**
    * Used for the ripple inside the switch.
    */
  var ripple: js.UndefOr[String] = js.native
  /**
    * Used for the text label element.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * Used for the thumb element.
    */
  var thumb: js.UndefOr[String] = js.native
}

object SwitchTheme {
  @scala.inline
  def apply(): SwitchTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwitchTheme]
  }
  @scala.inline
  implicit class SwitchThemeOps[Self <: SwitchTheme] (val x: Self) extends AnyVal {
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
    def setOff(value: String): Self = this.set("off", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOff: Self = this.set("off", js.undefined)
    @scala.inline
    def setOn(value: String): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    @scala.inline
    def setRipple(value: String): Self = this.set("ripple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRipple: Self = this.set("ripple", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setThumb(value: String): Self = this.set("thumb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumb: Self = this.set("thumb", js.undefined)
  }
  
}

