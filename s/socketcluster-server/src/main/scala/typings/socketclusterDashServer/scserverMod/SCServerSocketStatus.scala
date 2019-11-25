package typings.socketclusterDashServer.scserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SCServerSocketStatus extends js.Object {
  var id: String
  var pingTimeout: Double
}

object SCServerSocketStatus {
  @scala.inline
  def apply(id: String, pingTimeout: Double): SCServerSocketStatus = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], pingTimeout = pingTimeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SCServerSocketStatus]
  }
}

