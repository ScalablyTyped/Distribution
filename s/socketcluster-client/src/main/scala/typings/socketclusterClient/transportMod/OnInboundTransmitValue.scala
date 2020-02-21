package typings.socketclusterClient.transportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnInboundTransmitValue extends js.Object {
  var data: js.Any
  var event: String
}

object OnInboundTransmitValue {
  @scala.inline
  def apply(data: js.Any, event: String): OnInboundTransmitValue = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OnInboundTransmitValue]
  }
}

