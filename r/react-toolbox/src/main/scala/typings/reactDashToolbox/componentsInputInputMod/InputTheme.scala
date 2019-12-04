package typings.reactDashToolbox.componentsInputInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputTheme extends js.Object {
  /**
    * Used for the bar under the input.
    */
  var bar: js.UndefOr[String] = js.undefined
  /**
    * Used for the counter element.
    */
  var counter: js.UndefOr[String] = js.undefined
  /**
    * Added to the root class when input is disabled.
    */
  var disabled: js.UndefOr[String] = js.undefined
  /**
    * Used for the text error.
    */
  var error: js.UndefOr[String] = js.undefined
  /**
    * Added to the root class when input is errored.
    */
  var errored: js.UndefOr[String] = js.undefined
  /**
    * Used when the input is hidden.
    */
  var hidden: js.UndefOr[String] = js.undefined
  /**
    * Used for the hint text.
    */
  var hint: js.UndefOr[String] = js.undefined
  /**
    * Used for the icon in case the input has icon.
    */
  var icon: js.UndefOr[String] = js.undefined
  /**
    * Used as root class for the component.
    */
  var input: js.UndefOr[String] = js.undefined
  /**
    * Used for the HTML input element.
    */
  var inputElement: js.UndefOr[String] = js.undefined
  /**
    * Used for the label when the input has a label.
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * Used in case the input is required.
    */
  var required: js.UndefOr[String] = js.undefined
  /**
    * Added to the root class if the input has icon.
    */
  var withIcon: js.UndefOr[String] = js.undefined
}

object InputTheme {
  @scala.inline
  def apply(
    bar: String = null,
    counter: String = null,
    disabled: String = null,
    error: String = null,
    errored: String = null,
    hidden: String = null,
    hint: String = null,
    icon: String = null,
    input: String = null,
    inputElement: String = null,
    label: String = null,
    required: String = null,
    withIcon: String = null
  ): InputTheme = {
    val __obj = js.Dynamic.literal()
    if (bar != null) __obj.updateDynamic("bar")(bar.asInstanceOf[js.Any])
    if (counter != null) __obj.updateDynamic("counter")(counter.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (errored != null) __obj.updateDynamic("errored")(errored.asInstanceOf[js.Any])
    if (hidden != null) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (inputElement != null) __obj.updateDynamic("inputElement")(inputElement.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (withIcon != null) __obj.updateDynamic("withIcon")(withIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputTheme]
  }
}

