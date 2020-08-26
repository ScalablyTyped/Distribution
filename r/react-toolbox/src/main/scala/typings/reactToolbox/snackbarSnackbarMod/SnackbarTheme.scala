package typings.reactToolbox.snackbarSnackbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnackbarTheme extends js.Object {
  /**
    * Added to the root element in case it's accept type.
    */
  var accept: js.UndefOr[String] = js.native
  /**
    * Added to the root element when its active.
    */
  var active: js.UndefOr[String] = js.native
  /**
    * Used for the button inside the component.
    */
  var button: js.UndefOr[String] = js.native
  /**
    * Added to the root element in case it's cancel type.
    */
  var cancel: js.UndefOr[String] = js.native
  /**
    * Used for the label element.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * Used as the className for the root element of the component.
    */
  var snackbar: js.UndefOr[String] = js.native
  /**
    * Added to the root element in case it's warning type.
    */
  var warning: js.UndefOr[String] = js.native
}

object SnackbarTheme {
  @scala.inline
  def apply(): SnackbarTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnackbarTheme]
  }
  @scala.inline
  implicit class SnackbarThemeOps[Self <: SnackbarTheme] (val x: Self) extends AnyVal {
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
    def setAccept(value: String): Self = this.set("accept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    @scala.inline
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setButton(value: String): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setCancel(value: String): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setSnackbar(value: String): Self = this.set("snackbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnackbar: Self = this.set("snackbar", js.undefined)
    @scala.inline
    def setWarning(value: String): Self = this.set("warning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
  
}

