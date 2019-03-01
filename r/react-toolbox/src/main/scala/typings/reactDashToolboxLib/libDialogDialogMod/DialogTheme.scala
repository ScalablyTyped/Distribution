package typings
package reactDashToolboxLib.libDialogDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogTheme extends js.Object {
  /**
    * Used for the root when the dialog is active.
    */
  var active: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used to wrap the dialog body.
    */
  var body: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used in buttons when the dialog implements actions.
    */
  var button: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the root element.
    */
  var dialog: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the navigation element when it implements actions.
    */
  var navigation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the title element of the dialog.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object DialogTheme {
  @scala.inline
  def apply(
    active: java.lang.String = null,
    body: java.lang.String = null,
    button: java.lang.String = null,
    dialog: java.lang.String = null,
    navigation: java.lang.String = null,
    title: java.lang.String = null
  ): DialogTheme = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active)
    if (body != null) __obj.updateDynamic("body")(body)
    if (button != null) __obj.updateDynamic("button")(button)
    if (dialog != null) __obj.updateDynamic("dialog")(dialog)
    if (navigation != null) __obj.updateDynamic("navigation")(navigation)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[DialogTheme]
  }
}

