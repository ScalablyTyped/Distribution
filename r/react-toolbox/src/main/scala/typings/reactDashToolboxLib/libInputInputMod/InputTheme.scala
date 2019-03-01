package typings
package reactDashToolboxLib.libInputInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputTheme extends js.Object {
  /**
    * Used for the bar under the input.
    */
  var bar: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the counter element.
    */
  var counter: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the root class when input is disabled.
    */
  var disabled: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the text error.
    */
  var error: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the root class when input is errored.
    */
  var errored: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used when the input is hidden.
    */
  var hidden: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the hint text.
    */
  var hint: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the icon in case the input has icon.
    */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used as root class for the component.
    */
  var input: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the HTML input element.
    */
  var inputElement: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the label when the input has a label.
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used in case the input is required.
    */
  var required: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added to the root class if the input has icon.
    */
  var withIcon: js.UndefOr[java.lang.String] = js.undefined
}

object InputTheme {
  @scala.inline
  def apply(
    bar: java.lang.String = null,
    counter: java.lang.String = null,
    disabled: java.lang.String = null,
    error: java.lang.String = null,
    errored: java.lang.String = null,
    hidden: java.lang.String = null,
    hint: java.lang.String = null,
    icon: java.lang.String = null,
    input: java.lang.String = null,
    inputElement: java.lang.String = null,
    label: java.lang.String = null,
    required: java.lang.String = null,
    withIcon: java.lang.String = null
  ): InputTheme = {
    val __obj = js.Dynamic.literal()
    if (bar != null) __obj.updateDynamic("bar")(bar)
    if (counter != null) __obj.updateDynamic("counter")(counter)
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (error != null) __obj.updateDynamic("error")(error)
    if (errored != null) __obj.updateDynamic("errored")(errored)
    if (hidden != null) __obj.updateDynamic("hidden")(hidden)
    if (hint != null) __obj.updateDynamic("hint")(hint)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (input != null) __obj.updateDynamic("input")(input)
    if (inputElement != null) __obj.updateDynamic("inputElement")(inputElement)
    if (label != null) __obj.updateDynamic("label")(label)
    if (required != null) __obj.updateDynamic("required")(required)
    if (withIcon != null) __obj.updateDynamic("withIcon")(withIcon)
    __obj.asInstanceOf[InputTheme]
  }
}

