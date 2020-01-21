package typings.reactJoyride

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAriamodal extends js.Object {
  var `aria-modal`: Boolean
  var role: String
  def ref(): Unit
}

object AnonAriamodal {
  @scala.inline
  def apply(`aria-modal`: Boolean, ref: () => Unit, role: String): AnonAriamodal = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction0(ref), role = role.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAriamodal]
  }
}

