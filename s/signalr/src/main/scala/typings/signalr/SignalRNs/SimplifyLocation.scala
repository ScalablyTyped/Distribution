package typings.signalr.SignalRNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimplifyLocation extends js.Object {
  var host: String
  var protocol: String
}

object SimplifyLocation {
  @scala.inline
  def apply(host: String, protocol: String): SimplifyLocation = {
    val __obj = js.Dynamic.literal(host = host, protocol = protocol)
  
    __obj.asInstanceOf[SimplifyLocation]
  }
}

