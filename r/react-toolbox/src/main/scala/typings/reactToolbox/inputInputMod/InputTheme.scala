package typings.reactToolbox.inputInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputTheme extends js.Object {
  /**
    * Used for the bar under the input.
    */
  var bar: js.UndefOr[String] = js.native
  /**
    * Used for the counter element.
    */
  var counter: js.UndefOr[String] = js.native
  /**
    * Added to the root class when input is disabled.
    */
  var disabled: js.UndefOr[String] = js.native
  /**
    * Used for the text error.
    */
  var error: js.UndefOr[String] = js.native
  /**
    * Added to the root class when input is errored.
    */
  var errored: js.UndefOr[String] = js.native
  /**
    * Used when the input is hidden.
    */
  var hidden: js.UndefOr[String] = js.native
  /**
    * Used for the hint text.
    */
  var hint: js.UndefOr[String] = js.native
  /**
    * Used for the icon in case the input has icon.
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * Used as root class for the component.
    */
  var input: js.UndefOr[String] = js.native
  /**
    * Used for the HTML input element.
    */
  var inputElement: js.UndefOr[String] = js.native
  /**
    * Used for the label when the input has a label.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * Used in case the input is required.
    */
  var required: js.UndefOr[String] = js.native
  /**
    * Added to the root class if the input has icon.
    */
  var withIcon: js.UndefOr[String] = js.native
}

object InputTheme {
  @scala.inline
  def apply(): InputTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputTheme]
  }
  @scala.inline
  implicit class InputThemeOps[Self <: InputTheme] (val x: Self) extends AnyVal {
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
    def setBar(value: String): Self = this.set("bar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBar: Self = this.set("bar", js.undefined)
    @scala.inline
    def setCounter(value: String): Self = this.set("counter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCounter: Self = this.set("counter", js.undefined)
    @scala.inline
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setErrored(value: String): Self = this.set("errored", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrored: Self = this.set("errored", js.undefined)
    @scala.inline
    def setHidden(value: String): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setHint(value: String): Self = this.set("hint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setInputElement(value: String): Self = this.set("inputElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputElement: Self = this.set("inputElement", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setRequired(value: String): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setWithIcon(value: String): Self = this.set("withIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithIcon: Self = this.set("withIcon", js.undefined)
  }
  
}

