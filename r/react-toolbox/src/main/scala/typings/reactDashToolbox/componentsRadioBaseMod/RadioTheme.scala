package typings.reactDashToolbox.componentsRadioBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioTheme extends js.Object {
  /**
    * Used to for the radio element.
    */
  var radio: js.UndefOr[String] = js.undefined
  /**
    * Used for the radio element when it's checked.
    */
  var radioChecked: js.UndefOr[String] = js.undefined
  /**
    * To provide styles for the ripple.
    */
  var ripple: js.UndefOr[String] = js.undefined
}

object RadioTheme {
  @scala.inline
  def apply(radio: String = null, radioChecked: String = null, ripple: String = null): RadioTheme = {
    val __obj = js.Dynamic.literal()
    if (radio != null) __obj.updateDynamic("radio")(radio.asInstanceOf[js.Any])
    if (radioChecked != null) __obj.updateDynamic("radioChecked")(radioChecked.asInstanceOf[js.Any])
    if (ripple != null) __obj.updateDynamic("ripple")(ripple.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioTheme]
  }
}

