package typings.reactPhoneNumberInput

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIcon extends js.Object {
  var icon: Component[js.Object, js.Object, _]
  var label: String
  var value: js.UndefOr[String] = js.undefined
}

object AnonIcon {
  @scala.inline
  def apply(icon: Component[js.Object, js.Object, _], label: String, value: String = null): AnonIcon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIcon]
  }
}

