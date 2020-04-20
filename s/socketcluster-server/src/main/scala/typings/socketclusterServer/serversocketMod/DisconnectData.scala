package typings.socketclusterServer.serversocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisconnectData extends js.Object {
  var code: Double
  var reason: String
}

object DisconnectData {
  @scala.inline
  def apply(code: Double, reason: String): DisconnectData = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisconnectData]
  }
}

