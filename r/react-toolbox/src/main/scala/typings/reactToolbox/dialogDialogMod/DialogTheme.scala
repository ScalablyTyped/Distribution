package typings.reactToolbox.dialogDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogTheme extends js.Object {
  /**
    * Used for the root when the dialog is active.
    */
  var active: js.UndefOr[String] = js.native
  /**
    * Used to wrap the dialog body.
    */
  var body: js.UndefOr[String] = js.native
  /**
    * Used in buttons when the dialog implements actions.
    */
  var button: js.UndefOr[String] = js.native
  /**
    * Used for the root element.
    */
  var dialog: js.UndefOr[String] = js.native
  /**
    * Used for the navigation element when it implements actions.
    */
  var navigation: js.UndefOr[String] = js.native
  /**
    * Used for the title element of the dialog.
    */
  var title: js.UndefOr[String] = js.native
}

object DialogTheme {
  @scala.inline
  def apply(): DialogTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogTheme]
  }
  @scala.inline
  implicit class DialogThemeOps[Self <: DialogTheme] (val x: Self) extends AnyVal {
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
    def setActive(value: String): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setButton(value: String): Self = this.set("button", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButton: Self = this.set("button", js.undefined)
    @scala.inline
    def setDialog(value: String): Self = this.set("dialog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialog: Self = this.set("dialog", js.undefined)
    @scala.inline
    def setNavigation(value: String): Self = this.set("navigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigation: Self = this.set("navigation", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

