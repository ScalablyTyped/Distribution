package typings.reactToolbox.snackbarSnackbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnackbarTheme extends js.Object {
  /**
    * Added to the root element in case it's accept type.
    */
  var accept: js.UndefOr[String] = js.undefined
  /**
    * Added to the root element when its active.
    */
  var active: js.UndefOr[String] = js.undefined
  /**
    * Used for the button inside the component.
    */
  var button: js.UndefOr[String] = js.undefined
  /**
    * Added to the root element in case it's cancel type.
    */
  var cancel: js.UndefOr[String] = js.undefined
  /**
    * Used for the label element.
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * Used as the className for the root element of the component.
    */
  var snackbar: js.UndefOr[String] = js.undefined
  /**
    * Added to the root element in case it's warning type.
    */
  var warning: js.UndefOr[String] = js.undefined
}

object SnackbarTheme {
  @scala.inline
  def apply(
    accept: String = null,
    active: String = null,
    button: String = null,
    cancel: String = null,
    label: String = null,
    snackbar: String = null,
    warning: String = null
  ): SnackbarTheme = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (snackbar != null) __obj.updateDynamic("snackbar")(snackbar.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnackbarTheme]
  }
}

