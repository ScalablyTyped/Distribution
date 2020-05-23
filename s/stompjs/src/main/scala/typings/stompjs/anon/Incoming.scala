package typings.stompjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Incoming extends js.Object {
  var incoming: Double
  var outgoing: Double
}

object Incoming {
  @scala.inline
  def apply(incoming: Double, outgoing: Double): Incoming = {
    val __obj = js.Dynamic.literal(incoming = incoming.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Incoming]
  }
}

