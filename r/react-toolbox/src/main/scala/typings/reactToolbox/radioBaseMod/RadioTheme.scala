package typings.reactToolbox.radioBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadioTheme extends js.Object {
  /**
    * Used to for the radio element.
    */
  var radio: js.UndefOr[String] = js.native
  /**
    * Used for the radio element when it's checked.
    */
  var radioChecked: js.UndefOr[String] = js.native
  /**
    * To provide styles for the ripple.
    */
  var ripple: js.UndefOr[String] = js.native
}

object RadioTheme {
  @scala.inline
  def apply(): RadioTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadioTheme]
  }
  @scala.inline
  implicit class RadioThemeOps[Self <: RadioTheme] (val x: Self) extends AnyVal {
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
    def setRadio(value: String): Self = this.set("radio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadio: Self = this.set("radio", js.undefined)
    @scala.inline
    def setRadioChecked(value: String): Self = this.set("radioChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadioChecked: Self = this.set("radioChecked", js.undefined)
    @scala.inline
    def setRipple(value: String): Self = this.set("ripple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRipple: Self = this.set("ripple", js.undefined)
  }
  
}

