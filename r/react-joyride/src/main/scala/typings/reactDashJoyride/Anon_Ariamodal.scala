package typings.reactDashJoyride

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ariamodal extends js.Object {
  var `aria-modal`: Boolean
  var role: String
  def ref(): Unit
}

object Anon_Ariamodal {
  @scala.inline
  def apply(`aria-modal`: Boolean, ref: () => Unit, role: String): Anon_Ariamodal = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction0(ref), role = role.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Ariamodal]
  }
}

