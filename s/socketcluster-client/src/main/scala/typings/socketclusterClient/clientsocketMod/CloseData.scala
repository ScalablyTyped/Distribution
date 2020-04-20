package typings.socketclusterClient.clientsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseData extends js.Object {
  var code: Double
  var reason: String
}

object CloseData {
  @scala.inline
  def apply(code: Double, reason: String): CloseData = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseData]
  }
}

