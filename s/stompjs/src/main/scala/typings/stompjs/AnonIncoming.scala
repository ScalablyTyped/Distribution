package typings.stompjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIncoming extends js.Object {
  var incoming: Double
  var outgoing: Double
}

object AnonIncoming {
  @scala.inline
  def apply(incoming: Double, outgoing: Double): AnonIncoming = {
    val __obj = js.Dynamic.literal(incoming = incoming.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIncoming]
  }
}

