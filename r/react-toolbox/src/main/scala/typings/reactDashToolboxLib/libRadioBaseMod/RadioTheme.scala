package typings
package reactDashToolboxLib.libRadioBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioTheme extends js.Object {
  /**
    * Used to for the radio element.
    */
  var radio: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used for the radio element when it's checked.
    */
  var radioChecked: js.UndefOr[java.lang.String] = js.undefined
  /**
    * To provide styles for the ripple.
    */
  var ripple: js.UndefOr[java.lang.String] = js.undefined
}

object RadioTheme {
  @scala.inline
  def apply(
    radio: java.lang.String = null,
    radioChecked: java.lang.String = null,
    ripple: java.lang.String = null
  ): RadioTheme = {
    val __obj = js.Dynamic.literal()
    if (radio != null) __obj.updateDynamic("radio")(radio)
    if (radioChecked != null) __obj.updateDynamic("radioChecked")(radioChecked)
    if (ripple != null) __obj.updateDynamic("ripple")(ripple)
    __obj.asInstanceOf[RadioTheme]
  }
}

