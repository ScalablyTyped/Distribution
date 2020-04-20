package typings.procfsStats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReceive extends js.Object {
  var Receive: String
  var Transmit: String
}

object AnonReceive {
  @scala.inline
  def apply(Receive: String, Transmit: String): AnonReceive = {
    val __obj = js.Dynamic.literal(Receive = Receive.asInstanceOf[js.Any], Transmit = Transmit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReceive]
  }
}

