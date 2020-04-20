package typings.scBrokerCluster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerSocket extends js.Object {
  var id: String
  def emit(eventName: String, args: js.Any*): Unit
}

object ServerSocket {
  @scala.inline
  def apply(emit: (String, /* repeated */ js.Any) => Unit, id: String): ServerSocket = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerSocket]
  }
}

