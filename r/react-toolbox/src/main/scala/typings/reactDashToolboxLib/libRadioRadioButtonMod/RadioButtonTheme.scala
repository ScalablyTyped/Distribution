package typings
package reactDashToolboxLib.libRadioRadioButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioButtonTheme extends js.Object {
  /**
    * Added to the root of the Radio in case it's disabled.
    */
  var disabled: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used as the root class of the component.
    */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the input element.
    */
  var input: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used to style the text label element.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object RadioButtonTheme {
  @scala.inline
  def apply(
    disabled: java.lang.String = null,
    field: java.lang.String = null,
    input: java.lang.String = null,
    text: java.lang.String = null
  ): RadioButtonTheme = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (field != null) __obj.updateDynamic("field")(field)
    if (input != null) __obj.updateDynamic("input")(input)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[RadioButtonTheme]
  }
}

