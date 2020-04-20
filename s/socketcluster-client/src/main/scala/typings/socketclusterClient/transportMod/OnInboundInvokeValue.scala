package typings.socketclusterClient.transportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnInboundInvokeValue extends js.Object {
  var data: js.Any
  var procedure: String
}

object OnInboundInvokeValue {
  @scala.inline
  def apply(data: js.Any, procedure: String): OnInboundInvokeValue = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], procedure = procedure.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnInboundInvokeValue]
  }
}

