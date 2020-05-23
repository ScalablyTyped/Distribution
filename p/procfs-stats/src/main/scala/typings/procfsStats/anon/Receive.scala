package typings.procfsStats.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Receive extends js.Object {
  var Receive: String
  var Transmit: String
}

object Receive {
  @scala.inline
  def apply(Receive: String, Transmit: String): Receive = {
    val __obj = js.Dynamic.literal(Receive = Receive.asInstanceOf[js.Any], Transmit = Transmit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Receive]
  }
}

