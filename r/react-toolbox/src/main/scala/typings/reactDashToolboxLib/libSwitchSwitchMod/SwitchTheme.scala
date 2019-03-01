package typings
package reactDashToolboxLib.libSwitchSwitchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchTheme extends js.Object {
  /**
    * Used for the root element if the component is disabled.
    */
  var disabled: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the root element if the component is not disabled.
    */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the input element.
    */
  var input: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for a wrapper around the thumb if checked is false.
    */
  var off: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for a wrapper around the thumb if checked is true.
    */
  var on: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the ripple inside the switch.
    */
  var ripple: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the text label element.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the thumb element.
    */
  var thumb: js.UndefOr[java.lang.String] = js.undefined
}

object SwitchTheme {
  @scala.inline
  def apply(
    disabled: java.lang.String = null,
    field: java.lang.String = null,
    input: java.lang.String = null,
    off: java.lang.String = null,
    on: java.lang.String = null,
    ripple: java.lang.String = null,
    text: java.lang.String = null,
    thumb: java.lang.String = null
  ): SwitchTheme = {
    val __obj = js.Dynamic.literal()
    if (disabled != null) __obj.updateDynamic("disabled")(disabled)
    if (field != null) __obj.updateDynamic("field")(field)
    if (input != null) __obj.updateDynamic("input")(input)
    if (off != null) __obj.updateDynamic("off")(off)
    if (on != null) __obj.updateDynamic("on")(on)
    if (ripple != null) __obj.updateDynamic("ripple")(ripple)
    if (text != null) __obj.updateDynamic("text")(text)
    if (thumb != null) __obj.updateDynamic("thumb")(thumb)
    __obj.asInstanceOf[SwitchTheme]
  }
}

