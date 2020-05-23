package typings.reactJoyride.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ariamodal extends js.Object {
  var `aria-modal`: Boolean
  var role: String
  def ref(): Unit
}

object Ariamodal {
  @scala.inline
  def apply(`aria-modal`: Boolean, ref: () => Unit, role: String): Ariamodal = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction0(ref), role = role.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ariamodal]
  }
}

