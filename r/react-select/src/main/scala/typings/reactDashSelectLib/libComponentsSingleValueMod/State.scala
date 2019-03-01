package typings
package reactDashSelectLib.libComponentsSingleValueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  /** Whether this is disabled */
  var isDisabled: scala.Boolean
}

object State {
  @scala.inline
  def apply(isDisabled: scala.Boolean): State = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDisabled")(isDisabled)
    __obj.asInstanceOf[State]
  }
}

