package typings.reactToolbox.libDialogDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogTheme extends js.Object {
  /**
    * Used for the root when the dialog is active.
    */
  var active: js.UndefOr[String] = js.undefined
  /**
    * Used to wrap the dialog body.
    */
  var body: js.UndefOr[String] = js.undefined
  /**
    * Used in buttons when the dialog implements actions.
    */
  var button: js.UndefOr[String] = js.undefined
  /**
    * Used for the root element.
    */
  var dialog: js.UndefOr[String] = js.undefined
  /**
    * Used for the navigation element when it implements actions.
    */
  var navigation: js.UndefOr[String] = js.undefined
  /**
    * Used for the title element of the dialog.
    */
  var title: js.UndefOr[String] = js.undefined
}

object DialogTheme {
  @scala.inline
  def apply(
    active: String = null,
    body: String = null,
    button: String = null,
    dialog: String = null,
    navigation: String = null,
    title: String = null
  ): DialogTheme = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (dialog != null) __obj.updateDynamic("dialog")(dialog.asInstanceOf[js.Any])
    if (navigation != null) __obj.updateDynamic("navigation")(navigation.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogTheme]
  }
}

