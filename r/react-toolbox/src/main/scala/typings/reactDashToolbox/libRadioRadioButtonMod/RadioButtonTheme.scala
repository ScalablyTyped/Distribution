package typings.reactDashToolbox.libRadioRadioButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioButtonTheme extends js.Object {
  /**
    * Added to the root of the Radio in case it's disabled.
    */
  var disabled: js.UndefOr[String] = js.undefined
  /**
    * Used as the root class of the component.
    */
  var field: js.UndefOr[String] = js.undefined
  /**
    * Used for the input element.
    */
  var input: js.UndefOr[String] = js.undefined
  /**
    * Used to style the text label element.
    */
  var text: js.UndefOr[String] = js.undefined
}

object RadioButtonTheme {
  @scala.inline
  def apply(disabled: String = null, field: String = null, input: String = null, text: String = null): RadioButtonTheme = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioButtonTheme]
  }
}

