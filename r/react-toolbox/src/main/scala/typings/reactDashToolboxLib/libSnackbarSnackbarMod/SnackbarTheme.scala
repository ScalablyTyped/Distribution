package typings
package reactDashToolboxLib.libSnackbarSnackbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnackbarTheme extends js.Object {
  /**
    * Added to the root element in case it's accept type.
    */
  var accept: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the root element when its active.
    */
  var active: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the button inside the component.
    */
  var button: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the root element in case it's cancel type.
    */
  var cancel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the label element.
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used as the className for the root element of the component.
    */
  var snackbar: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the root element in case it's warning type.
    */
  var warning: js.UndefOr[java.lang.String] = js.undefined
}

object SnackbarTheme {
  @scala.inline
  def apply(
    accept: java.lang.String = null,
    active: java.lang.String = null,
    button: java.lang.String = null,
    cancel: java.lang.String = null,
    label: java.lang.String = null,
    snackbar: java.lang.String = null,
    warning: java.lang.String = null
  ): SnackbarTheme = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept)
    if (active != null) __obj.updateDynamic("active")(active)
    if (button != null) __obj.updateDynamic("button")(button)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (label != null) __obj.updateDynamic("label")(label)
    if (snackbar != null) __obj.updateDynamic("snackbar")(snackbar)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[SnackbarTheme]
  }
}

