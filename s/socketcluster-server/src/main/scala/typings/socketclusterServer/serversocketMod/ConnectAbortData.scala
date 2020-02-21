package typings.socketclusterServer.serversocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectAbortData extends js.Object {
  var code: Double
  var reason: String
}

object ConnectAbortData {
  @scala.inline
  def apply(code: Double, reason: String): ConnectAbortData = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectAbortData]
  }
}

