package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCSctpTransportEventMap extends js.Object {
  var statechange: Event
}

object RTCSctpTransportEventMap {
  @scala.inline
  def apply(statechange: Event): RTCSctpTransportEventMap = {
    val __obj = js.Dynamic.literal(statechange = statechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCSctpTransportEventMap]
  }
}

