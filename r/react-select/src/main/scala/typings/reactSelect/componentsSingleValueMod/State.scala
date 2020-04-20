package typings.reactSelect.componentsSingleValueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  /** Whether this is disabled */
  var isDisabled: Boolean
}

object State {
  @scala.inline
  def apply(isDisabled: Boolean): State = {
    val __obj = js.Dynamic.literal(isDisabled = isDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

